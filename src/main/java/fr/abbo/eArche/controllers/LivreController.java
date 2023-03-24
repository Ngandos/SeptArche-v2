package fr.abbo.eArche.controllers;

import fr.abbo.eArche.models.Livres;
import fr.abbo.eArche.services.LivresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;


public class LivreController {
    @CrossOrigin
    @RestController
    @RequestMapping("/livres")
    public class LivresController {

        @Autowired
        private LivresService livresService;

        @ResponseStatus(HttpStatus.CREATED)
        @PostMapping
        public int save(@RequestBody Livres liv) {
            return livresService.save(liv);
        }

        @GetMapping
        public List<Livres> getAllOuvrages() {
            return livresService.findAll();
        }

        //Méthode de récuperation d'une personne par son Id (Recois une valeur)

        @GetMapping("/{id}")
        public Livres getOneLivres(@PathVariable int id) {
            Livres liv;
            try {
                liv = livresService.findById(id);
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }
            return liv;
        }

        @DeleteMapping("/{id}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public boolean delete(@PathVariable int id) {
            boolean resultat = livresService.delete(id);
            if (resultat == false) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }
            return resultat;
        }

        @ResponseStatus(HttpStatus.ACCEPTED)
        @PutMapping("/{id}")
        public Livres update(@RequestBody Livres liv) {
            return livresService.update(liv);
        }
    }
}

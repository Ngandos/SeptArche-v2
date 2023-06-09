package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.LivresRepository;
import fr.abbo.septArche.models.Livres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="/livres")
public class LivresController {
    @Autowired
    private LivresRepository rep;
   @GetMapping("/{id}")
    public List<Livres> findAll() {
        return rep.findAll();
    }
    @GetMapping(params = {"titre"})
    public Livres findByTitre(@RequestParam String titre) {
        return rep.findByTitre(titre);
    }
    @GetMapping(params = {"auteurs"})
    public Livres findByAuteur(@RequestParam String auteur) {
        return rep.findByAuteur(auteur);
    }
    @GetMapping(params = {"editeurs"})
    public Livres findByEditeur(@RequestParam String editeur) {
        return rep.findByEditeur(editeur);
    }
    @GetMapping(params = {"isbn"})
    public Livres findByIsbn(@RequestParam String isbn) {
        return rep.findByIsbn(isbn);
    }
}

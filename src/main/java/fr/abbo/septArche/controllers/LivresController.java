package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.LivresRepository;
import fr.abbo.septArche.models.Livres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/livres")
public class LivresController {
    @Autowired
    private LivresRepository rep;

    /**
     * Affichage de la liste des Livres.
     */
   @GetMapping()
    public List<Livres> findAll() {
        return rep.findAll();
    }

    /**
     * Recherche un Livre par son ID.
     */
    @GetMapping("/{id}")
    public Optional<Livres> findById(@PathVariable Long id) {
        return rep.findById(id);
    }

    /**
     * Recherche un Livre par son Titre.
     */
    @GetMapping(params = {"titre"})
    public Livres findByTitre(@RequestParam String titre) {
        return rep.findByTitre(titre);
    }

    /**
     * Recherche un Livre par Auteur.
     */
    @GetMapping(params = {"auteur"})
    public Livres findByAuteurs(@RequestParam String auteur) {
        return rep.findByAuteur(auteur);
    }

    /**
     * Recherche un Livre par son Editeur.
     */
    @GetMapping(params = {"editeur"})
    public Livres findByEditeur(@RequestParam String editeur) {
        return rep.findByEditeur(editeur);
    }

    /**
     * Recherche un utilisateur par son ID ISBN.
     */
    @GetMapping(params = {"isbn"})
    public Livres findByIsbn(@RequestParam String isbn) {
        return rep.findByIsbn(isbn);
    }
}

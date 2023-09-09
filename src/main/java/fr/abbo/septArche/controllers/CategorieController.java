package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.CategorieRepository;
import fr.abbo.septArche.models.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="/categorie")
public class CategorieController {
    @Autowired
    private CategorieRepository rep;

    /**
     * Affiche la liste des Categories.
     */
    @GetMapping()
    public List<Categorie> findAll() {
        return rep.findAll();
    }

    /**
     * Recherche un Categorie par son Nom.
     */
    @GetMapping(params = {"nom"})
    public Categorie findByNom(@RequestParam String nom) {
        return rep.findByNom(nom);
    }

    /**
     * Recherche une Categorie par sa Désignation.
     */
    @GetMapping(params = {"designation"})
    public Categorie findByDescription(@RequestParam String description) {
        return rep.findByDescription(description);
    }
}

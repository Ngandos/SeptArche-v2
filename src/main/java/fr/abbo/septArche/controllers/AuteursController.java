package fr.abbo.septArche.controllers;


import fr.abbo.septArche.DAO.AuteursRepository;
import fr.abbo.septArche.models.Auteurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/auteurs")
public class AuteursController {
    @Autowired
    private AuteursRepository rep;

    /**
     * Affiche la liste des Auteurs.
     */
    @GetMapping()
    public List<Auteurs> findAll() {
        return rep.findAll();
    }

    /**
     * Recherche un Auteur par son ID.
     */
    @GetMapping(params = {"/{id}"})
    public Optional<Auteurs> findById(@RequestParam Long id) {
        return rep.findById(id);
    }

    /**
     * Recherche un Auteur par son Nom.
     */
    @GetMapping(params = {"nom"})
    public Auteurs findByNom(@RequestParam String nom) {
        return rep.findByNom(nom);
    }
}

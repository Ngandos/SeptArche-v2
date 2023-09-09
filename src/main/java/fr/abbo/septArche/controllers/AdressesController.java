package fr.abbo.septArche.controllers;


import fr.abbo.septArche.DAO.AdressesRepository;
import fr.abbo.septArche.models.Adresses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping(path="/adresses")
public class AdressesController {
    @Autowired
    private AdressesRepository rep;

    /**
     * Affiche laliste des Adresses.
     */
    @GetMapping()
    public List<Adresses> findAll() {
        return rep.findAll();
    }

    /**
     * Affiche une Adresses par son ID.
     */
    @GetMapping(params = "/{id}")
    public Optional<Adresses> findById(@PathVariable Long id) {
        return rep.findById(id);
    }

    /**
     * Recherche une Adresse par sa Rue.
     */
    @GetMapping(params = {"rue"})
    public Adresses findByRue(@RequestParam String rue) {
        return rep.findByRue(rue);
    }

    /**
     * Recherche une Adresse par son Code Postal.
     */
    @GetMapping(params = {"codePostal"})
    public Adresses findByCodePostal(@RequestParam String codePostal) {
        return rep.findByCodePostal(codePostal);
    }

}

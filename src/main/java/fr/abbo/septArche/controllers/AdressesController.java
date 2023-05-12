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
    @GetMapping()
    public List<Adresses> findAll() {
        return rep.findAll();
    }
    @GetMapping(params = {"rue"})
    public Adresses findByRue(@RequestParam String rue) {
        return rep.findByRue(rue);
    }
    @GetMapping(params = "/{id}")
    public Optional<Adresses> findById(@RequestParam Long id) {
        return rep.findById(id);
    }
}

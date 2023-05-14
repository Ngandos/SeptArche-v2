package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ClientsRepository;
import fr.abbo.septArche.models.Clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public class ClientsController {
    @Autowired
    private ClientsRepository rep;
    @GetMapping()
    public List<Clients> findAll() {
        return rep.findAll();
    }
    @GetMapping(params = {"nom"})
    public Clients findByNom(@RequestParam String nom) {
        return rep.findByNom(nom);
    }
    @GetMapping(params = "/{id}")
    public Optional<Clients> findById(@RequestParam Long id) {
        return rep.findById(id);
    }
}

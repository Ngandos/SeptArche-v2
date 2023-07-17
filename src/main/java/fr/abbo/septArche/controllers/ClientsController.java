package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ClientsRepository;
import fr.abbo.septArche.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/clients")
public class ClientsController {
    @Autowired
    private ClientsRepository rep;
    @GetMapping()
    public List<Client> findAll() {
        return rep.findAll();
    }
    @GetMapping(params = {"nom"})
    public Client findByNom(@RequestParam String nom) {
        return rep.findByNom(nom);
    }
    @GetMapping(params = "/{id}")
    public Optional<Client> findById(@RequestParam Long id) {
        return rep.findById(id);
    }
}

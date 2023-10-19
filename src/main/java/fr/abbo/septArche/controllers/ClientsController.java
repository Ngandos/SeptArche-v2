package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ClientsRepository;
import fr.abbo.septArche.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/client")
public class ClientsController {
    @Autowired
    private ClientsRepository rep;

    @GetMapping()
    public List<Client> findAll() {
        return rep.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Client> findById(@PathVariable Long id) {
        return rep.findById(id);
    }
    @GetMapping({"nom"})
    public Client findByNom(@PathVariable String nom) {
        return rep.findByNom(nom);
    }

    @GetMapping({"prenom"})
    public Client findByPrenom(@PathVariable String prenom) {
        return rep.findByPrenom(prenom);
    }

    @GetMapping({"numCompte"})
    public Client findByNumCompte(@PathVariable String numCompte) {
        return rep.findByNumCompte(numCompte);
    }

    @PostMapping()
    public Client save(@RequestBody Client client) {
        return rep.save(client);
    }

}

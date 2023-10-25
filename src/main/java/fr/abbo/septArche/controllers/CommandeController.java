package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ClientsRepository;
import fr.abbo.septArche.DAO.CommandeRepository;
import fr.abbo.septArche.Services.CommandeServices;
import fr.abbo.septArche.models.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/commande")
public class CommandeController {
    @Autowired
    private CommandeRepository rep;
    @Autowired
    private ClientsRepository repClient;
    @Autowired
    private CommandeServices commandeServices;

    @GetMapping()
    public List<Commande> findAll() {
        return commandeServices.findAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<Commande> findById(@PathVariable Long id) {
        return commandeServices.findById(id);
    }
    @GetMapping(params = {"dateCommande"})
    public Commande findByDateCommande(@RequestParam String dateCommande) {
        return rep.findByDateCommande(dateCommande);
    }
    @GetMapping(params = {"idClient"})
    public  Commande findByClient(@RequestParam Long idClient) {
        return rep.findByClient(idClient);
    }
    @PostMapping("/creerCommande")
    public Commande creerCommande(@RequestBody Commande commande) throws Exception {
        return commandeServices.creerCommande(commande);
    }
}

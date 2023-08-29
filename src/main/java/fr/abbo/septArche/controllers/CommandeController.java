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
    private CommandeServices repCommandeServices;

    @GetMapping()
    public List<Commande> findAll() {
        return repCommandeServices.findAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<Commande> findById(@PathVariable Long id) {
        return repCommandeServices.findById(id);
    }
    @GetMapping(params = {"dateCommande"})
    public Commande findByDateCommande(@RequestParam String dateCommande) {
        return rep.findByDateCommande(dateCommande);
    }
    @GetMapping(params = {"idClient"})
    public  Commande findByCommandeClient(@RequestParam Long idClient) {
        return rep.findByCommandeClient(idClient);
    }
    /*@PostMapping("/creerCommande")
    public Commande creerCommande(@RequestBody Commande commande) throws Exception {
        return repCommandeServices.creerCommande(commande);
    }*/
}

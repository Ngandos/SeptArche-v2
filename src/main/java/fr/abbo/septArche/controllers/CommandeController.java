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

    /**
     * Affiche la liste des Commandes.
     */
    @GetMapping()
    public List<Commande> findAll() {
        return repCommandeServices.findAll();
    }

    /**
     * Recherche une Commande par son ID.
     */
    @GetMapping(path = "/{id}")
    public Optional<Commande> findById(@PathVariable Long id) {
        return repCommandeServices.findById(id);
    }

    /**
     * Recherche une Commande par sa Date de création.
     */
    @GetMapping(params = {"dateCommande"})
    public Commande findByDateCommande(@RequestParam String dateCommande) {
        return rep.findByDateCommande(dateCommande);
    }
}

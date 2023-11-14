package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ClientsRepository;
import fr.abbo.septArche.DAO.CommandeRepository;
import fr.abbo.septArche.Services.CommandeServices;
import fr.abbo.septArche.exceptions.StockExceptions;
import fr.abbo.septArche.models.Cart;
import fr.abbo.septArche.models.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/commande")
public class CommandeController {
    @Autowired
    private CommandeRepository rep;
    @Autowired
    private ClientsRepository repClient;
    @Autowired
    private CommandeServices commandeServices;

    /**
     * Affiche la liste des Commandes.
     */
    @GetMapping()
    public List<Commande> findAll() {
        return rep.findAll();
    }

    /**
     * Recherche une Commande par son ID.
     */
    @GetMapping(path = "/{id}")
    public Optional<Commande> findById(@PathVariable Long id) {
        return rep.findById(id);
    }

    /**
     * Recherche une Commande par sa Date de création.
     */
    @GetMapping(params = {"dateComm"})
    public Commande findByDateCommande(@RequestParam String dateComm) {
        return rep.findByDateComm(dateComm);
    }

    @PostMapping()
    public String creerCommande(@RequestBody Commande commande ) {

        System.out.print("Commande " + commande);

        try {
            commandeServices.creerCommande(commande);
            return "Commandé validée";
        } catch (StockExceptions e) {
            return "Problème de stock";
        }
    }
}

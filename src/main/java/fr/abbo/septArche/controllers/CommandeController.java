package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ClientsRepository;
import fr.abbo.septArche.DAO.CommandeRepository;
import fr.abbo.septArche.Services.CommandeServices;
import fr.abbo.septArche.models.Cart;
import fr.abbo.septArche.models.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping()
    public List<Commande> findAll() {
        return rep.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Commande> findById(@PathVariable Long id) {
        return rep.findById(id);
    }

    @GetMapping(params = {"dateComm"})
    public List<Commande> findByDateCommande(@RequestParam String dateComm) {
        return rep.findByDateComm(dateComm);
    }

    @PostMapping()
    public ResponseEntity<Commande> creerCommande(@RequestBody Cart cart) {
        System.out.println("Cart " + cart);

        try {
            Commande commande = commandeServices.convertCartToCommande(cart);
            commandeServices.creerCommande(commande);
            return new ResponseEntity<>(commande, HttpStatus.CREATED);
        } catch (Exception e) {
            System.err.println("Error creating command: " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

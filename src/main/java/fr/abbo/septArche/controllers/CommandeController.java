package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.CommandeRepository;
import fr.abbo.septArche.Services.CommandeServices;
import fr.abbo.septArche.models.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping("/Commande")
public class CommandeController {
    @Autowired
    private CommandeRepository rep;
    @Autowired
    private CommandeServices repCommandeServices;

    @GetMapping("/commande")
    public List<Commande> findAll(@RequestParam Long id) {
        return repCommandeServices.findAll(id);
    }
    @GetMapping(params = "/{id}")
    public Optional<Commande> findById(@RequestParam Long id) {
        return repCommandeServices.findById(id);
    }
    @GetMapping(params = {"date_commande"})
    public Commande findByDate_commande(@RequestParam String date_commande) {
        return rep.findByDate_commande(date_commande);
    }
    /*@PostMapping("/CreerCommande")
    public Commande CreerCommande(@RequestBody Commande commande) throws Exception {
        return repCommandeServices.creerCommande(Commande);
    }*/
}

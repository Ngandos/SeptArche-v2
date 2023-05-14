package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.CommandeRepository;
import fr.abbo.septArche.models.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public class CommandeController {
    @Autowired
    private CommandeRepository rep;
    @GetMapping()
    public List<Commande> findAll() {
        return rep.findAll();
    }
    @GetMapping(params = "/{id}")
    public Optional<Commande> findById(@RequestParam Long id) {
        return rep.findById(id);
    }
    //@GetMapping(params = {"clients"})
   // public Commande findByClients(@RequestParam String Clients) {
    //  return rep.findByClients(Clients);
    //}
    @GetMapping(params = {"date_commande"})
    public Commande findByDate_commande(@RequestParam String date_commande) {
        return rep.findByDate_commande(date_commande);
    }
}

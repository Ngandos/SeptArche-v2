package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ClientsRepository;
import fr.abbo.septArche.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="/client")
public class ClientsController {
    @Autowired
    private ClientsRepository rep;

    /**
     * Affiche la liste des Client.
     */
    @GetMapping()
    public List<Client> findAll() {
        return rep.findAll();
    }

    /**
     * Recherche un Client par son Nom.
     */
    @GetMapping(params = {"nom"})
    public Client findByNom(@RequestParam String nom) {
        return rep.findByNom(nom);
    }

}

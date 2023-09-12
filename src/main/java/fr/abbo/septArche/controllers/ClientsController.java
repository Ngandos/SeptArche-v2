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
     * Recherche les Clients et retourne une liste de clients.
     */
    @GetMapping()
    public List<Client> findAll() {
        return rep.findAll();
    }

    /**
     * Recherche un Client par son Nom et retourne l'objet client correspondant.
     * Un Champ nul ne renverra rien car exception non gérée dans l'état actuel,
     * Il est également possible que Spring-Boot renvoie une runtimeException
     */
    @GetMapping(params = {"nom"})
    public Client findByNom(@RequestParam String nom) {
        return rep.findByNom(nom);
    }

}

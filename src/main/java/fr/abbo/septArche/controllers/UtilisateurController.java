package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.UtilisateurRepository;
import fr.abbo.septArche.models.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/utilisateur")
public class UtilisateurController {
    @Autowired
    private UtilisateurRepository rep;

    @GetMapping()
    public List<Utilisateur> findAll() {
        return rep.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Utilisateur> findById(@PathVariable Long id) {
        return rep.findById(id);
    }
    @GetMapping({"pseudo"})
    public Utilisateur findByPseudo(@RequestParam String pseudo) {
        return rep.findByPseudo(pseudo);
    }
    @GetMapping({"email"})
    public Utilisateur findByEmail(@PathVariable String email) {
        return rep.findByEmail(email);
    }
}

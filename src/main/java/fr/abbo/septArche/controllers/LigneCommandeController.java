package fr.abbo.septArche.controllers;

import fr.abbo.septArche.Services.LigneCommandeServices;
import fr.abbo.septArche.models.LigneCommande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/ligneCommande")
public class LigneCommandeController {
    @Autowired
    private LigneCommandeServices rep;
    @GetMapping()
    public List<LigneCommande> findAll() {
        return rep.findAll();
    }
    @GetMapping("/{id}")
    public Optional<LigneCommande> findById(Long id) {
        return rep.findById(id);
    }
}

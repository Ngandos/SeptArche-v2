package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.EditeursRepository;
import fr.abbo.septArche.models.Editeurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/editeurs")
public class EditeursController {

    @Autowired
    private EditeursRepository rep;

    /**
     * Affiche la liste des Editeurs.
     */
    @GetMapping()
    public List<Editeurs> findAll() {
        return rep.findAll();
    }

    /**
     * Recherche un Editeur par son ID.
     */
    @GetMapping("/{id}")
    public Optional<Editeurs> findById(@PathVariable Long id) {
        return rep.findById(id);
    }

    /**
     * Recherche un Editeur par son nom d'Enseigne.
     */
    @GetMapping(params = {"enseigne"})
    public Editeurs findByEnseigne(@RequestParam String enseigne) {
        return rep.findByEnseigne(enseigne);
    }
}

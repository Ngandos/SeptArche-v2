package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.EditeursRepository;
import fr.abbo.septArche.models.Editeurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="/editeurs")
public class EditeursController {
    @Autowired
    private EditeursRepository rep;
    @GetMapping()
    public List<Editeurs> findAll() {
        return rep.findAll();
    }
    @GetMapping(params = {"raison_sociale"})
    public Editeurs findByEnseigne(@RequestParam String enseigne) {
        return rep.findByEnseigne(enseigne);
    }
}

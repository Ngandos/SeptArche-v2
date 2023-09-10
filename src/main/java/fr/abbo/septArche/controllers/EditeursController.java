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
    @GetMapping()
    public List<Editeurs> findAll() {
        return rep.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Editeurs> findById(@PathVariable Long id) {
        return rep.findById(id);
    }
    @GetMapping(params = {"enseigne"})
    public Editeurs findByEnseigne(@RequestParam String enseigne) {
        return rep.findByEnseigne(enseigne);
    }
}

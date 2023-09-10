package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.AdminRepository;
import fr.abbo.septArche.models.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
@RequestMapping(path="/admin")
public class AdminController {

    @Autowired
    private AdminRepository rep;
    @GetMapping()
    public List<Admin> findAll() {
        return rep.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Admin> findById(@PathVariable Long id) {
        return rep.findById(id);
    }
    @GetMapping(params = {"nivAcces"})
    public List<Admin> findByNivAcces(@RequestParam String nivAcces) {
        return (List<Admin>) rep.findByNivAcces(nivAcces);
    }
}

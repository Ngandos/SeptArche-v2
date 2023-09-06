package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.UserRepository;
import fr.abbo.septArche.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserRepository rep;

    @GetMapping()
    public List<Users> findAll() {
        return rep.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Users> findById(@PathVariable Long id) {
        return rep.findById(id);
    }
    @GetMapping({"username"})
    public Users findByUsername(@RequestParam String username) {
        return rep.findByUsername(username);
    }
    @GetMapping({"email"})
    public Users findByEmail(@RequestParam String email) {
        return rep.findByEmail(email);
    }
}

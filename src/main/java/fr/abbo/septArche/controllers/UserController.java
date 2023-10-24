package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.UserRepository;
import fr.abbo.septArche.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserRepository rep;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return rep.findById(id);
    }

    /**
     * Recherche un utilisateur par son nom utilisateur.
     */
    @GetMapping("/username")
    public User findByUsername(@RequestParam String username) {
        return rep.findByUsername(username);
    }

    /**
     * Recherche un utilisateur par son Email.
     */
    @GetMapping("/email")
    public User findByEmail(@RequestParam String email) {
        return rep.findByEmail(email);
    }

    /**
     * Methode de persistence d'un utilisateur.
     */
    @PostMapping("/save")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = rep.save(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }
}
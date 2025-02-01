package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.UserRepository;
import fr.abbo.septArche.Services.UsersServices;
import fr.abbo.septArche.exceptions.StockExceptions;
import fr.abbo.septArche.models.Commande;
import fr.abbo.septArche.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path="/users")
public class UserController {

    private UserRepository rep;

    private UsersServices usersServices;

    @Autowired
    public UserController(UserRepository rep, UsersServices usersServices) {
        this.rep = rep;
        this.usersServices = usersServices;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        return usersServices.findAll();
    }

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

    @GetMapping("/role")
    public User findByRole(@RequestParam String role) {
        return rep.findByRole(role);
    }

    /**
     * Methode de persistence d'un utilisateur.
     */
    @PostMapping("/create")
    public String creerUser(@RequestBody User user ) {
        try {
            usersServices.creerUser(user);
            return "Utilisateur Enregistré";
        } catch (StockExceptions e) {
            return "Erreur lors de l'enregistrement de l'utilisateur";
        }
    }
}

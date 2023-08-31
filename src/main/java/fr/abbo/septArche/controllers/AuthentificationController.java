package fr.abbo.septArche.controllers;

import fr.abbo.septArche.models.User;
import org.springframework.web.bind.annotation.*;


@CrossOrigin()
@RestController
@RequestMapping("/login")
public class AuthentificationController {

    @PostMapping()
    public User login(@RequestBody User user) {
        // Si on arrive dans cette méthode c'est qu'on est authentifié (Spring Security nous bloque sinon)
        System.out.println("login de : " + user.getUsername());
        return user;
        // retourne l'utilisateur connecté pour que React soit au courant que l'authentification est bonne
    }
}

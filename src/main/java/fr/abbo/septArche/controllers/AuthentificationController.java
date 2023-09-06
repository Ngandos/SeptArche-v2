package fr.abbo.septArche.controllers;

import fr.abbo.septArche.models.Users;
import org.springframework.web.bind.annotation.*;


@CrossOrigin()
@RestController
@RequestMapping("/login")
public class AuthentificationController {

    @PostMapping()
    public Users login(@RequestBody Users users) {
        // Si on arrive dans cette méthode c'est qu'on est authentifié (Spring Security nous bloque sinon)
        System.out.println("login de : " + users.getUsername());
        return users;
        // retourne l'utilisateur connecté pour que React soit au courant que l'authentification est bonne
    }
}

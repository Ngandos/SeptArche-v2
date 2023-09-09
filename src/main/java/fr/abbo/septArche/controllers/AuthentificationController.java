package fr.abbo.septArche.controllers;

import fr.abbo.septArche.models.Users;
import org.springframework.web.bind.annotation.*;


@CrossOrigin()
@RestController
@RequestMapping("/login")
public class AuthentificationController {

    /**
     * Vérifie les parametres de connexion Utilisateur pour authentification.
     */
    @PostMapping()
    public Users login(@RequestBody Users users) {

        /**
         * Une fois authentifier on arrive dans cette méthode sinon Spring Sécurity nous bloque.
         */
        System.out.println("login de : " + users.getUsername());

        /**
         * La méthode retourne l'Utilisateur connécté pour indiquer a REACT que celui)ci est bien connecté.
         */
        return users;
    }
}

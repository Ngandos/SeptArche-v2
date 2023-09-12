package fr.abbo.septArche.controllers;

import fr.abbo.septArche.models.Users;
import org.springframework.web.bind.annotation.*;


@CrossOrigin()
@RestController
@RequestMapping("/login")
public class AuthentificationController {

    /**
     * Vérifie les paramètres de l'objet Utilisateur saisi et les comparent à ceux présents en base pour
     * cet utilisateur en vue de l'authentifier.
     * Un Champ nul ou mal rempli provoquera unne erreur d'authentification et redirigera vers la page de de connexion
     * Dans le cas ou l'utilisateur n'existerais pas on redirigerait vers la page de création de compte.
     */
    @PostMapping()
    public Users login(@RequestBody Users users) {

        /**
         * Une fois authentifier nous rentrions dans cette méthode dans le cas contraire Spring Sécurity refusera
         * la connexion et procedera comme indiqué ci-dessus.
         */
        System.out.println("login de : " + users.getUsername());

        /**
         * La méthode retourne l'objet l'Utilisateur connécté pour indiquer à REACT que celui-ci est bien connecté.
         */
        return users;
    }
}

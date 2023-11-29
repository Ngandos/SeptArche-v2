package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ArticlesRepository;
import fr.abbo.septArche.models.Articles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping(path="/articles")
public class ArticlesController {

    private static final Logger logger = LoggerFactory.getLogger(ArticlesController.class);

    @Autowired
    private ArticlesRepository rep;

    /**
     * Affiche la liste des Articles.
     */
    @GetMapping()
    public List<Articles> findAll() {
        return rep.findAll();
    }

    /**
     * Recherche un Article par son ID.
     */
    @GetMapping("/{id}")
    public Articles findById(@PathVariable Long id) {
        return rep.findById(id).orElse(null);
    }

    /**
     * Recherche un Article par sa Reference.
     */
    @GetMapping(params = {"ref"})
    public Articles findByRef(@RequestParam String ref) {
        return rep.findByRef(ref);
    }

    /**
     * Recherche un Article par sa Désignation, si le champ est nul l'application renverra une erreur.
     */
    @GetMapping(params = {"designation"})
    public Articles findByDesignation(@RequestParam String designation) {

        // Gestion des espace sur le param designation
        String trimmedDesignation = designation.trim();

        // Log de designation avec trim
        logger.info("Searching for articles with designation: '{}'", trimmedDesignation);

        Articles searchResult = rep.findByDesignation(trimmedDesignation);

        // Log des résultats
        logger.info("Search result: {}", searchResult);

        return searchResult;
    }

    /**
     * Recherche un Article par une tranche de prix definie par l'utilisateur.
     */
    @GetMapping(params = {"prixMini", "prixMaxi"})
    public List<Articles> findAllBetweenPrix(@RequestParam double prixMini, @RequestParam double prixMaxi) {
        return rep.findAllBetweenPrix(prixMini, prixMaxi);
    }

    @GetMapping("/search")
    public List<Articles> searchByDesignation(@RequestParam String designation) {

        // Gestion des espace sur le param designation
        String trimmedDesignation = designation.trim();

        // Log de designation avec trim
        logger.info("Searching for articles with designation: '{}'", trimmedDesignation);

        List<Articles> searchResults = rep.findByDesignationContainingIgnoreCase(trimmedDesignation);

        // Log des résultats
        logger.info("Search results: {}", searchResults);

        return searchResults;
    }
}

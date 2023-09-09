package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ArticlesRepository;
import fr.abbo.septArche.models.Articles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @CrossOrigin
    @RestController
    @RequestMapping(path="/articles")
    public class ArticlesController {
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
        public Optional<Articles> findById(@PathVariable Long id) {
            return rep.findById(id);
        }

        /**
         * Recherche un Article par sa Reference.
         */
        @GetMapping(params = {"ref"})
        public Articles findByRef(@RequestParam String ref) {
            return rep.findByRef(ref);
        }

        /**
         * Recherche un Article par sa Désignation.
         */
        @GetMapping(params = {"designation"})
        public Articles rechercheParDesignation(@RequestParam String designation) {
            return (Articles) rep.findByDesignationContains(designation);
        }

        /**
         * Recherche un Article par une tranche de prix definie par l'utilisateur.
         */
        @GetMapping(params = {"prixMini, prixMaxi"})
        public List<Articles> findAllBetweenPrix(@RequestParam double prixMini, @RequestParam double prixMaxi){
            return rep.findAllBetweenPrix(prixMini, prixMaxi);
        }
}

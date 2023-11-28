package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ArticlesRepository;
import fr.abbo.septArche.Services.ArticleServices;
import fr.abbo.septArche.models.Articles;
import fr.abbo.septArche.models.Livres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @CrossOrigin(origins = "http://localhost:5173")
    @RestController
    @RequestMapping(path="/articles")
    public class ArticlesController {
        @Autowired
        private ArticlesRepository rep;

        private ArticleServices articleServices;

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
         * Recherche un Article par sa Désignation, si le champ est nul l'application renverra une erreur.
         */
        @GetMapping(params = {"designation"})
        public Articles findByDesignation(@RequestParam String designation) {
            return rep.findByDesignation(designation);
        }

        @GetMapping(params = {"categorie"})
        public Articles findByCategorie(@RequestParam String categorie) {
            return rep.findByCategorie(categorie);
        }

        /**
         * Recherche un Article par une tranche de prix definie par l'utilisateur.
         */
        @GetMapping(params = {"prixMini, prixMaxi"})
        public List<Articles> findAllBetweenPrix(@RequestParam double prixMini, @RequestParam double prixMaxi){
            return rep.findAllBetweenPrix(prixMini, prixMaxi);
        }

        @GetMapping("/search")
        public List<Articles> searchByDesignation(@RequestParam String designation) {
            return rep.findByCategorieContainingIgnoreCase(designation);
        }
//        public List<Articles> findByKeyword(String keyword) {
//            return rep.findByKeyword(keyword);
//        }

        /*@PostMapping("/save")
        public void addArticle(@RequestBody Articles article) {
            articleServices.saveArticles(article);
        }*/
}

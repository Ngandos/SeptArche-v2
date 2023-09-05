package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ArticlesRepository;
import fr.abbo.septArche.models.Articles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @CrossOrigin
    @RestController
    @RequestMapping("/articles")
    public class ArticlesController {
        @Autowired
        private ArticlesRepository rep;
        @GetMapping()
        public List<Articles> findAll() {
            return rep.findAll();
        }
        @GetMapping("/{id}")
        public Optional<Articles> findById(@PathVariable Long id) {
            return rep.findById(id);
        }
        @GetMapping("/ref")
        public Articles findByRef(@RequestParam String ref) {
            return rep.findByRef(ref);
        }
        /*@GetMapping("/search/designation")
        public Articles rechercheParDesignation(@RequestParam String designation) {
            return (Articles) rep.findByDesignationContains(designation);
        }*/
        /*@GetMapping(params = {"prixMini, prixMaxi"})
        public List<Articles> findAllBetweenPrix(@RequestParam double prixMini, @RequestParam double prixMaxi){
            return rep.findAllBetweenPrix(prixMini, prixMaxi);
        }*/
}

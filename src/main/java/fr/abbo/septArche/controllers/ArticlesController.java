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
        @GetMapping()
        public List<Articles> rechercheTous() {
            return rep.findAll();
        }
        @GetMapping(params = {"ref"})
        public Articles rechercheParRef(@RequestParam String ref) {
            return rep.findByRef(ref);
        }
        @GetMapping(params = {"designation"})
        public Articles rechercheParDesignation(@RequestParam String designation) {
            return rep.findByDesignationContains(designation);
        }
        @GetMapping("/{id}")
        public Optional<Articles> rechercheParRef(@PathVariable Long id) {
            return rep.findById(id);
        }
}

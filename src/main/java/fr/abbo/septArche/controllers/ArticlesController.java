package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ArticlesRepository;
import fr.abbo.septArche.models.Articles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/articles")
public class ArticlesController {

    private static final Logger logger = LoggerFactory.getLogger(ArticlesController.class);

    private final ArticlesRepository rep;

    @Autowired
    public ArticlesController(ArticlesRepository rep) {
        this.rep = rep;
    }

    @GetMapping
    public List<Articles> findAll() {
        return rep.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Articles> findById(@PathVariable @NotNull Long id) {
        Articles article = rep.findById(id).orElse(null);
        return article != null ? ResponseEntity.ok(article) : ResponseEntity.notFound().build();
    }

    @GetMapping(params = {"ref"})
    public ResponseEntity<Articles> findByRef(@RequestParam @NotBlank String ref) {
        Articles article = rep.findByRef(ref);
        return article != null ? ResponseEntity.ok(article) : ResponseEntity.notFound().build();
    }

    @GetMapping(params = {"designation"})
    public ResponseEntity<Articles> findByDesignation(@RequestParam @NotBlank String designation) {
        String trimmedDesignation = designation.trim();
        logger.info("Searching for articles with designation: '{}'", trimmedDesignation);
        Articles searchResult = rep.findByDesignation(trimmedDesignation);
        logger.info("Search result: {}", searchResult);
        return searchResult != null ? ResponseEntity.ok(searchResult) : ResponseEntity.notFound().build();
    }

    @GetMapping(params = {"prixMini", "prixMaxi"})
    public List<Articles> findAllBetweenPrix(@RequestParam double prixMini, @RequestParam double prixMaxi) {
        return rep.findAllBetweenPrix(prixMini, prixMaxi);
    }

    @GetMapping("/search")
    public List<Articles> searchByDesignation(@RequestParam @NotBlank String designation) {
        String trimmedDesignation = designation.trim();
        logger.info("Searching for articles with designation: '{}'", trimmedDesignation);
        List<Articles> searchResults = rep.findByDesignationContainingIgnoreCase(trimmedDesignation);
        logger.info("Search results: {}", searchResults);
        return searchResults;
    }
}

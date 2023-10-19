package fr.abbo.septArche.controllers;

import fr.abbo.septArche.DAO.ArticlesRepository;
import fr.abbo.septArche.Services.ArticlesService;
import fr.abbo.septArche.exceptions.ArticleNotFound;
import fr.abbo.septArche.models.Articles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/articles")
public class ArticlesController {
    @Autowired
    private ArticlesService articleService;

    @GetMapping
    public Iterable<Articles> getAllArticles() {
        return articleService.findAllArticles();
    }

    @PostMapping("/save")
    public void addArticle(@RequestBody Articles article) {
        articleService.saveArticles(article);
    }

    @GetMapping("/search/description")
    public List<Articles> searchArticles(@RequestParam String keyword) {
        return articleService.findByKeyword(keyword);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Articles> getArticleById(@PathVariable Long id) throws ArticleNotFound {
        return articleService.getArticleById(id)
                .map(p -> ResponseEntity.ok().body(p))
                .orElseThrow(() -> new ArticleNotFound("Article non trouvée avec l'ID: " + id));
    }
}

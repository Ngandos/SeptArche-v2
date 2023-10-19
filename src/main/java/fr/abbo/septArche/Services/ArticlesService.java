package fr.abbo.septArche.Services;

import fr.abbo.septArche.models.Articles;

import java.util.List;
import java.util.Optional;
public interface ArticlesService {

    Iterable<Articles> findAllArticles();

    void saveArticles(Articles articles);

    List<Articles> findByKeyword(String keyword);

    Optional<Articles> getArticleById(Long id);


}

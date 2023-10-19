package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.ArticlesRepository;
import fr.abbo.septArche.models.Articles;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArticlesServiceImpl implements ArticlesService {
    private final ArticlesRepository articlesRepository;

    public ArticlesServiceImpl(ArticlesRepository articleRepository) {
        this.articlesRepository = articleRepository;
    }

    @Override
    public List<Articles> findAllArticles() {
        return (List<Articles>) articlesRepository.findAll();
    }

    @Override
    public void saveArticles(Articles articles) {
        articlesRepository.save(articles);

    }

    @Override
    public List<Articles> findByKeyword(String keyword) {
        return articlesRepository.findByKeyword(keyword);
    }

    /**
     * Récupère un article par son identifiant.
     *
     * @param id L'identifiant de l'article à rechercher.
     * @return Un objet Optional contenant l'article trouvé ou un Optional vide si aucun article correspondant à l'identifiant n'est trouvé.
     */
    @Override
    public Optional<Articles> getArticleById(Long id) {
        List<Articles> articles = new ArrayList<>();
        //récupère tous les articles ajoute chaque article à la liste articles en utilisant forEach().
        articlesRepository.findAll().forEach(articles::add);
        return articles.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst();
    }

}


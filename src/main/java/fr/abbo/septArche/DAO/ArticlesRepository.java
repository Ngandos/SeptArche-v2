package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ArticlesRepository extends JpaRepository<Articles, Long> {
    @Override
    List<Articles> findAll();

    Optional<Articles> findById(Long id);

    Articles findByRef(String ref);

    @Override
    Articles getReferenceById(Long id);

    Articles findByDesignation(String designation);

    Articles findByCategorie(String categorie);

    @Query("SELECT a FROM Articles a WHERE a.prixHT > ?1 and a.prixHT < ?2")
    List<Articles> findAllBetweenPrix(double prixMini, double prixMaxi);
    List<Articles> findByCategorieContainingIgnoreCase(String query);

    /*@Query("SELECT a FROM Articles a WHERE LOWER(a.format) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Articles> findByKeyword(@Param("keyword") String keyword);*/

//    void saveArticles(Articles article);
}

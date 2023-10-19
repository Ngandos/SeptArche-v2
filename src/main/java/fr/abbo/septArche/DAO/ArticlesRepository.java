package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
public interface ArticlesRepository extends CrudRepository<Articles, Long> {
    @Query("SELECT a FROM Articles a WHERE LOWER(a.format) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Articles> findByKeyword(@Param("keyword") String keyword);


}

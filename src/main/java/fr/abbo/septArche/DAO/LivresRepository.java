package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Livres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface LivresRepository extends JpaRepository<Livres, Long> {

    Livres findByTitre(String titre);
    List<Livres> findByAuteurs(String auteurs);
    List<Livres> findByEditeurs(String editeurs);
    Livres findByIsbn(String isbn);
    List<Livres> findByCategorie(String categorie);
    @Query("SELECT a FROM Livres a WHERE LOWER(a.titre) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Livres> findByTitleByKeyword(@Param("keyword") String keyword);


}

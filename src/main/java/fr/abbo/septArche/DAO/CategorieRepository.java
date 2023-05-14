package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    List<Categorie> findAll();
    Optional<Categorie> findById(Long id);
    Categorie findByNom(String nom);
    Categorie findByDescription(String description);
}
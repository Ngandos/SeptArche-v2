package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Livres;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LivresRepository extends JpaRepository<Livres, Long> {
@Override
    List<Livres> findAll();
    Optional<Livres> findById(Long id);
    Livres findByTitre(String titre);
    Livres findByAuteur(String auteur);
    Livres findByEditeur(String editeur);
    Livres findByIsbn(String isbn);
    List<Livres> findByTitreContainingIgnoreCase(String query);


}

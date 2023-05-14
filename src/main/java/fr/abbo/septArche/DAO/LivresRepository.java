package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Livres;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivresRepository extends JpaRepository<Livres, Long> {

    List<Livres> findAll();

    Livres findByTitre(String titre);

    Livres findByAuteur(String auteur);

    Livres findByEditeur(String editeur);

    Livres findByIsbn(String isbn);

}

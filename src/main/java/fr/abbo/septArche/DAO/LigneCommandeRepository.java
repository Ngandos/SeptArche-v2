package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Articles;
import fr.abbo.septArche.models.Commande;
import fr.abbo.septArche.models.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LigneCommandeRepository extends JpaRepository<LigneCommande, Long>  {
    @Override
    List<LigneCommande> findAll();
    Optional<LigneCommande> findById(Long id);
    Optional<Commande> findByCommande(Long id);
}

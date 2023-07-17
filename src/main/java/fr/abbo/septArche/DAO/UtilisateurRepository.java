package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    @Override
    List<Utilisateur> findAll();
    Optional<Utilisateur> findById(Long id);
    Utilisateur findByPseudo(String pseudo);
    Utilisateur findByEmail(String email);
}

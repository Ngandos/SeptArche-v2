package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Auteurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AuteursRepository extends JpaRepository<Auteurs, Long> {
    @Override
    List<Auteurs> findAll();
    @Override
    Optional<Auteurs> findById(Long id);
    Auteurs findByNom(String nom);
}
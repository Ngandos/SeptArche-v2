package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Auteurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuteursRepository extends JpaRepository<Auteurs, Long> {
    @Override
    List<Auteurs> findAll();
    default Auteurs findById() {
        return null;
    }
    Auteurs findByNom(String nom);
}
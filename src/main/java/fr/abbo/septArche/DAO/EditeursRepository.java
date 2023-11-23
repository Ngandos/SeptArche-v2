package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Editeurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface EditeursRepository extends JpaRepository<Editeurs, Long> {
    @Override
    List<Editeurs> findAll();
    Optional<Editeurs> findById(Long id);
    Editeurs findByEnseigne(String ref);
}
package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
    @Override
    List<Commande> findAll();

    Optional<Commande> findById(Long id);

    List<Commande> findByDateComm(String dateComm);

    Commande findByNumComm(String numComm);

}
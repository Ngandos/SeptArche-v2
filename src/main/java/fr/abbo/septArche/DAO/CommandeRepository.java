package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface CommandeRepository extends CrudRepository<Commande, Long> {

    Commande findByNumComm(String numComm);

}
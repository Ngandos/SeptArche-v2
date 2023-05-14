package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClientsRepository extends JpaRepository<Clients, Long> {
    List<Clients> findAll();
    Optional<Clients> findById(Long id);
    Clients findByNom(String nom);
}
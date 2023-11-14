package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientsRepository extends JpaRepository<Client, Long> {
    @Override
    List<Client> findAll();

    Client findByNom(String nom);

    Client findByEmail(String email);

    Client findByUsername(String username);
}
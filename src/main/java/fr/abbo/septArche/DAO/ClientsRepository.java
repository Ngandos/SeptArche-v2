package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClientsRepository extends JpaRepository<Client, Long> {
    @Override
    List<Client> findAll();
    Optional<Client> findById(Long id);
    Client findByNom(String nom);
    Client findByPrenom(String prenom);
    Client findByNumCompte(String numCompte);
    Client save(Client client);
}
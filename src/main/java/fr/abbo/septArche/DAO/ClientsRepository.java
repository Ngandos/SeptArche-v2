package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ClientsRepository extends JpaRepository<Client, Long> {

    /**
     * Retrieve all clients from the database.
     *
     * @return List of clients
     */
    @Override
    List<Client> findAll();

    /**
     * Find a client by their last name (nom).
     *
     * @param nom The last name of the client
     * @return The client with the specified last name
     */
    Client findByNom(String nom);

    /**
     * Find a client by their email address.
     *
     * @param email The email address of the client
     * @return The client with the specified email address
     */
    Client findByEmail(String email);

    /**
     * Find a client by their username.
     *
     * @param username The username of the client
     * @return The client with the specified username
     */

    Optional<Client> findByUsername(String username);

}

package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**Classe UserRepository Etends la Classe Repository de JPA*/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Recherche un utilisateur par son ID.
     */
    Optional<User> findById(Long id);

    /**
     * Recherche un utilisateur par son nom utilisateur.
     */
    User findByUsername(String username);

    /**
     * Recherche un utilisateur par son email.
     */
    User findByEmail(String email);
}

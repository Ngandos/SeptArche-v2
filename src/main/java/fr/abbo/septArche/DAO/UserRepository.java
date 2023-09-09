package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**Classe UserRepository Etends la Classe Repository de JPA*/
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    /**
     * Recherche un utilisateur par son ID.
     */
    Optional<Users> findById(Long id);

    /**
     * Recherche un utilisateur par son nom utilisateur.
     */
    Users findByUsername(String username);

    /**
     * Recherche un utilisateur par son email.
     */
    Users findByEmail(String email);
}

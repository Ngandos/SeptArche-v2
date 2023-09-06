package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    List<User> findAll();
    Optional<User> findById(Long id);
    User findByUsername(String username);
    User findByEmail(String email);

    /*@Query("SELECT * FROM User u WHERE u.isAdmin  = true")
    public Iterable<User> findAllEnabled();*/
}

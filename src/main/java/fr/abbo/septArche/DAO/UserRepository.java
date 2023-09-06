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
    User findByEmail(String email);
    User findByUsername(String username);

    /*@Query("SELECT * FROM User u WHERE role  = Admin")
    public Iterable<User> findAllEnabled();*/
}

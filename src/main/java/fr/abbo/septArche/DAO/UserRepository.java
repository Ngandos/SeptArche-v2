package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    @Override
    List<Users> findAll();
    Optional<Users> findById(Long id);
    Users findByUsername(String username);
    Users findByEmail(String email);

    /*@Query("SELECT * FROM User u WHERE u.isAdmin  = true")
    public Iterable<User> findAllEnabled();*/
}

package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Adresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdressesRepository extends JpaRepository<Adresses, Long> {

    List<Adresses> findAll();
    Optional<Adresses> findById(Long id);
    default Adresses findByRue(String rue) {
        return null;
    }
    default Adresses findByClients(String clients) {
        return null;
    }


}
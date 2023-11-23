package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Adresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdressesRepository extends JpaRepository<Adresses, Long> {

    @Override
    List<Adresses> findAll();
    Optional<Adresses> findById(Long id);
    Adresses findByRue(String rue);
    Adresses findByCodePostal(String codePostal);


}
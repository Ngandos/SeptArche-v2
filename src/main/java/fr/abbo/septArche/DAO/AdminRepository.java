package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Admin;
import fr.abbo.septArche.models.Articles;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    @Override
    List<Admin> findAll();
    Optional<Admin> findById(Long id);
    Admin findByNivAcces(String nivAcces);
}

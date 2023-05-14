package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Articles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ArticlesRepository extends JpaRepository<Articles,Long> {
    Optional<Articles> findById(Long id);
    Articles findByRef(String ref);
    @Override
    Articles getReferenceById(Long id);
    Articles findByDesignationContains(String designation);
}

package fr.abbo.septArche.DAO;

import fr.abbo.septArche.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends JpaRepository<Stock, Long> {

    default List<Stock> findAll() {
        return null;
    }

}
package fr.abbo.septArche.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.abbo.septArche.DataBase.DbUser;

public interface DBUserRepository extends JpaRepository<DbUser, Integer> {
    public DbUser findByUsername(String username);
}

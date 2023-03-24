package fr.abbo.eArche.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import fr.abbo.eArche.models.Livres;
import org.springframework.jdbc.core.RowMapper;


public class LivresRowMapper implements RowMapper<Livres> {
    @Override
    public Livres mapRow(ResultSet rs, int rowId) throws SQLException {
        Livres livres = new Livres();
        livres.setTitre(rs.getString("titre"));
        livres.setEditeur(rs.getString("editeur"));
        livres.setAuteur(rs.getString("auteur"));
        livres.setISSBN(rs.getInt("ISBN"));
        return livres;
    }
}

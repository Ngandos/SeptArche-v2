package fr.abbo.eArche.dao;

import java.util.List;
import fr.abbo.eArche.models.Livres;
import fr.abbo.eArche.rowMapper.LivresRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class LivresDao implements DAO<Livres, Integer> {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public int save(Livres liv) {
        KeyHolder key = new GeneratedKeyHolder();
        String sqlRequest = "INSERT INTO Livres VALUES (titre = ?, Editeur = ?, Auteur = ?, ISSBN = ?)";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("titre", liv.getTitre());
        params.addValue("auteur", liv.getAuteur());
        params.addValue("editeur", liv.getEditeur());
        params.addValue("ISSBN", liv.getISSBN());
        namedParameterJdbcTemplate.update(sqlRequest, params, key);
        return key.getKey().intValue();
    }

    public Livres findById(Integer id) {
        String sqlRequest = "SELECT * FROM Livres WHERE id = ?";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("id", id);
        return namedParameterJdbcTemplate.queryForObject(sqlRequest, param, new LivresRowMapper());
    }

    @Override
    public List<Livres> findAll() {
        String sqlRequest = "SELECT * FROM Livres";
        return jdbcTemplate.query(sqlRequest, new LivresRowMapper());
    }

    public int delete(Integer id) {
        String sqlRequest = "DELETE FROM Livres WHERE id = :id";
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("id", id);
        return namedParameterJdbcTemplate.update(sqlRequest, param);
    }

    public int update(Livres liv) {
        String sqlRequest = "UPDATE Livres SET titre = ?, editeur = ?, auteur = ?, ISSBN = ? WHERE id = ?";
        return jdbcTemplate.update(sqlRequest, liv.getTitre(), liv.getAuteur(), liv.getEditeur());

    }

}

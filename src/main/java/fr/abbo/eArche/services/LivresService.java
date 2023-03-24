package fr.abbo.eArche.services;

import java.util.List;

import fr.abbo.eArche.models.Livres;
import fr.abbo.eArche.dao.LivresDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivresService {

    @Autowired
    private LivresDao livresDao;

    public int save(Livres liv) {
        int cle = livresDao.save(liv);
        return cle;
    }

    public Livres findById(Integer id) {
        return livresDao.findById(id);
    }

    public List<Livres> findAll() {
        return livresDao.findAll();
    }

    public boolean delete(int id) {
        if (livresDao.delete(id) > 0) {
            return true;
        }
        return false;
    }

    public Livres update(Livres liv) {
        if (livresDao.update(liv) > 0) {
            return liv;
        }
        return null;
    }

}

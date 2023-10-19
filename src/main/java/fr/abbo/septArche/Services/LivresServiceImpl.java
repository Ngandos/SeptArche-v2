package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.LivresRepository;
import fr.abbo.septArche.models.Livres;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivresServiceImpl implements LivresService {

    private final LivresRepository livresRepository;

    public LivresServiceImpl(LivresRepository livresRepository) {
        this.livresRepository = livresRepository;
    }

    @Override
    public Livres saveLivres(Livres livre) {
        livresRepository.save(livre);
        return livre;
    }

    @Override
    public List<Livres> findAllLivres() {
        return (List<Livres>) livresRepository.findAll();
    }

    @Override
    public List<Livres> findByAuteurs(String auteurs) {
        return null;
    }

    @Override
    public List<Livres> findByGenres(String genre) {
        return null;
    }

    @Override
    public List<Livres> findByEditeurs(String editeurs) {
        return null;
    }

    @Override
    public List<Livres> findTitleByKeyword(String keyword) {
        return livresRepository.findByTitleByKeyword(keyword);
    }
}

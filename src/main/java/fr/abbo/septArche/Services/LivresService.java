package fr.abbo.septArche.Services;

import fr.abbo.septArche.models.Livres;

import java.util.List;

public interface LivresService {

    Livres saveLivres(Livres livre);

    Iterable<Livres> findAllLivres();

    List<Livres> findByAuteurs(String auteurs);

    List<Livres> findByGenres(String genre);

    List<Livres> findByEditeurs(String editeurs);

    List<Livres> findTitleByKeyword(String keyword);


}

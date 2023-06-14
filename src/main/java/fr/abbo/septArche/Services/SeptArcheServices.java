package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.ArticlesRepository;
import fr.abbo.septArche.DAO.CommandeRepository;
import fr.abbo.septArche.models.Articles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeptArcheServices {
    @Autowired
    private ArticlesRepository repArticle;
    @Autowired
    private CommandeRepository repCommande;


    public Articles findByRef(String ref){
        return repArticle.findByRef(ref);
    }

    public List<Articles> rechercheTexte(String texte){
        return repArticle.findByDesignationContains(texte);
    }

    public List<Articles> recherchePrix(double prixMini, double prixMaxi){
        return repArticle.findAllBetweenPrix(prixMini,prixMaxi);
    }
}

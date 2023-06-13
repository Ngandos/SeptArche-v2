package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.ArticlesRepository;
import fr.abbo.septArche.DAO.CommandeRepository;
import fr.abbo.septArche.exceptions.StockExceptions;
import fr.abbo.septArche.models.Articles;
import fr.abbo.septArche.models.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(rollbackFor = StockExceptions.class)
    public void creeCommande(Long id, String date_commande, String status, Articles a, int qte) throws StockExceptions {
        Commande c = new Commande();
        repCommande.save(c);
        try {
            a.getStock().decremente(qte);
        }
        catch(StockExceptions ex){
            throw new StockExceptions(ex.getMessage() + " " + a.getDesignation());
        }
        repArticle.save(a);


    }
}

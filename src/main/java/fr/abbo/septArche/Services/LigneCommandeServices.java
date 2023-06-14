package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.ArticlesRepository;
import fr.abbo.septArche.exceptions.StockExceptions;
import fr.abbo.septArche.models.Articles;
import fr.abbo.septArche.models.LigneCommande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LigneCommandeServices {
    @Autowired
    private ArticlesRepository repArticles;

    private LigneCommandeServices repLigneCommande;
    @Transactional(rollbackFor = StockExceptions.class)
    public void creerLigneCommande(Articles articles, int qte) throws StockExceptions {
        LigneCommande LigneCommande = new LigneCommande();
        repLigneCommande.creerLigneCommande(articles, qte);
    }
}

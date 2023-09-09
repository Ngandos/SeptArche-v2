package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.ArticlesRepository;
import fr.abbo.septArche.exceptions.StockExceptions;
import fr.abbo.septArche.models.Articles;
import fr.abbo.septArche.models.Commande;
import fr.abbo.septArche.models.LigneCommande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class LigneCommandeServices {
    @Autowired
    private ArticlesRepository repArticles;
    private LigneCommandeServices repLigneCommande;
    @GetMapping("/ligne_commande")
    public List<LigneCommande> findAll() {
        return repLigneCommande.findAll();
    }
    @GetMapping("/{id}")
    public Optional<LigneCommande> findById(Long id) {
        return repLigneCommande.findById(id);
    }
    @GetMapping("/{id}")
    public Optional<Commande> findByCommande(Long id) {
        return repLigneCommande.findByCommande(id);
    }

    /**Créer une LigneCommande en gérant les exceptions de Stock*/
    @Transactional(rollbackFor = StockExceptions.class)
    public void creerLigneCommande(Articles articles, int qte) throws StockExceptions {
        LigneCommande LigneCommande = new LigneCommande();
        repLigneCommande.creerLigneCommande(articles, qte);
    }
}

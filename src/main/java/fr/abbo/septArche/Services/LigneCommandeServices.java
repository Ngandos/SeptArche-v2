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

    /**
     * Un champ nul ou a mauvaise syntaxe provoquera le renvoi d'un tableau vide voir d'une runtimeException
     */
    @GetMapping("/ligne_commande")
    public List<LigneCommande> findAll() {
        return repLigneCommande.findAll();
    }
    @GetMapping("/{id}")
    public Optional<LigneCommande> findById(Long id) {
        return repLigneCommande.findById(id);
    }

    /**
     * Un ID doit etre renseigné sans quoi le serveur renverra une runtimeException,
     * du fait de la non gestion de cette erreur dans l'état actuel.
     */
    @GetMapping("/{id}")
    public Optional<Commande> findByCommande(Long id) {
        return repLigneCommande.findByCommande(id);
    }

    /**
     * Ajoute une LigneCommande à la commande en gérant les exceptions de Stock, si le stock est insufisant
     * l'application renverra notre message d'exception stock insufisant
     */
    @Transactional(rollbackFor = StockExceptions.class)
    public void creerLigneCommande(Articles articles, int qte) throws StockExceptions {
        LigneCommande LigneCommande = new LigneCommande();
        repLigneCommande.creerLigneCommande(articles, qte);
    }
}

package fr.abbo.septArche.Services;


import fr.abbo.septArche.DAO.CommandeRepository;
import fr.abbo.septArche.exceptions.StockExceptions;
import fr.abbo.septArche.models.Articles;
import fr.abbo.septArche.models.Commande;
import fr.abbo.septArche.models.LigneCommande;
import fr.abbo.septArche.models.Stock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Implémentation du service de gestion des commandes.
 */
@Service
public class CommandeServiceImpl implements CommandeService {
    private static final Logger logger = LoggerFactory.getLogger(CommandeService.class);
    private final CommandeRepository commandeRepository;
    private final ArticlesService articlesService;

    /**
     * Constructeur de la classe.
     *
     * @param commandeRepository Le référentiel de commandes.
     * @param articlesService     Le service de gestion des articles.
     */

    public CommandeServiceImpl(CommandeRepository commandeRepository, ArticlesService articlesService) {
        this.commandeRepository = commandeRepository;
        this.articlesService = articlesService;
    }

    /**
     * Crée une nouvelle commande en vérifiant le stock des articles.
     *
     * @param commande La commande à créer.
     * @return La commande créée.
     * @throws StockExceptions Si le stock est insuffisant pour l'un des articles de la commande.
     */
    @Override
    @Transactional
    public Commande createCommande(Commande commande) {
        // parcours chaque LigneCommande dans la liste de lignes de commande de l'objet commande
        for (LigneCommande ligneCommande : commande.getLignesCommande()) {
            Articles articles = ligneCommande.getArticles();
            Stock stock = articles.getStock();

            if (!articles.isNumerique()) {
                if (stock != null) {
                    int quantiteCommandee = ligneCommande.getQuantite();
                    int stockDisponible = stock.getNombre();
                    logger.debug("Article: {} - Stock disponible: {} - Quantité commandée: {}", articles.getDesignation(), stockDisponible, quantiteCommandee);
                    if (stockDisponible >= quantiteCommandee) {
                        // Met à jour le stock en décrémentant la quantité commandée
                        stock.decremente(quantiteCommandee);
                        logger.debug("Décrémentation du stock pour l'article: {} - Stock restant: {}", articles.getDesignation(), stock.getNombre());
                    } else {
                        throw new StockExceptions("Stock insuffisant pour l'article: " + articles.getDesignation(), "Stock insuffisant");
                    }
                    // Sauvegarder l'article mis à jour dans la base de données
                    articlesService.saveArticles(articles);
                    logger.debug("mise a jour du stock pour l'article: {} - Stock actuel: {}", articles.getDesignation(), stock.getNombre());
                } else {
                    throw new StockExceptions("Stock indisponible pour l'article: " + articles.getDesignation(), "Stock indisponible");
                }
            }
            // Établir l'association
            ligneCommande.setCommande(commande);
        }
        // Enregistre la commande
        return commandeRepository.save(commande);

    }
    @Override
    public Iterable<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }
    @Override
    public Commande findById(Long id) {
        Optional<Commande> optionalCommande = commandeRepository.findById(id);
        return optionalCommande.orElse(null);
    }
    @Override
    public Commande findByRef(String ref) {
        return commandeRepository.findByNumComm(ref);
    }

    @Override
    public String toString() {
        return "CommandeServiceImpl{" +
                "commandeRepository=" + commandeRepository +
                ", articleService=" + articlesService +
                '}';
    }
}


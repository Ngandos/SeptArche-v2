package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.ArticlesRepository;
import fr.abbo.septArche.DAO.CommandeRepository;
import fr.abbo.septArche.exceptions.StockExceptions;
import fr.abbo.septArche.models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommandeServices {

    private static final Logger logger = LoggerFactory.getLogger(CommandeServices.class);

    @Autowired
    private CommandeRepository repCommande;

    @Autowired
    private ArticlesRepository repArticle;

    @Transactional
    public void creerCommande(Commande commande) throws StockExceptions {
        logger.info("Creating command: {}", commande);

        try {

            repCommande.save(commande);
            logger.info("Command created successfully");
        } catch (Exception e) {
            logger.error("Error creating command: {}", e.getMessage(), e);
            throw new RuntimeException("Error creating command", e);
        }
    }

    private LigneCommande convertCartLineItemToLigneCommande(CartLineItem cartLineItem) {
        LigneCommande ligneCommande = new LigneCommande();

        // Affichage de données supp en ciblant l'id

        Articles article = repArticle.findById(cartLineItem.getArticle()).orElseThrow(() ->
                new RuntimeException("Article not found"));

        // Set LigneCommande
        ligneCommande.setArticle(article);
        ligneCommande.setQuantite(cartLineItem.getQuantite());

        return ligneCommande;
    }

    public Commande convertCartToCommande(Cart cart) {
        Commande commande = new Commande();
        commande.setNumComm(cart.getNumComm());
        commande.setDateComm(cart.getDateComm());
        commande.setStatus(cart.getStatus());

        // Convertion de chaque CartLineItem en LigneCommande

        List<LigneCommande> ligneCommandes = cart.getContenu().stream()
                .map(this::convertCartLineItemToLigneCommande)
                .collect(Collectors.toList());

        commande.setContenu(ligneCommandes);

        return commande;
    }
}

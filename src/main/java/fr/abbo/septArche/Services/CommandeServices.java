package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.CommandeRepository;
import fr.abbo.septArche.exceptions.StockExceptions;
import fr.abbo.septArche.models.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeServices {
    @Autowired
    private LigneCommandeServices repLigneCommande;
    @Autowired
    private CommandeRepository repCommande;

    /**Affiche la liste des Commandes*/
    public List<Commande> findAll() {
        return repCommande.findAll();
    }

    /**Recherche une Commande par son ID */
    public Optional<Commande> findById(Long id) {
        return repCommande.findById(id);
    }

    /**Créée une Commande en base tout en gerant l'exception de stock
     * Opération transactionnelle s'annule si une des étapes échoue */
    @Transactional(rollbackFor = StockExceptions.class)
    public void creerCommande(Commande commande) throws StockExceptions {
        repCommande.save(commande);
    }
}

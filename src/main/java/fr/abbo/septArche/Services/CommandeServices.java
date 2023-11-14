package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.CommandeRepository;
import fr.abbo.septArche.exceptions.StockExceptions;
import fr.abbo.septArche.models.Cart;
import fr.abbo.septArche.models.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeServices {

    @Autowired
    private CommandeRepository repCommande;

    /**Créée une Commande en base tout en gerant l'exception de stock
     * Opération transactionnelle s'annule si une des étapes échoue */
    @Transactional(rollbackFor = StockExceptions.class)
    public void creerCommande(Commande commande) throws StockExceptions {

        System.out.println("Creation de commande");

        repCommande.save(commande);
    }
}

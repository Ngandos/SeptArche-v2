package fr.abbo.septArche.Services;

import fr.abbo.septArche.DAO.CommandeRepository;
import fr.abbo.septArche.exceptions.StockExceptions;
import fr.abbo.septArche.models.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeServices {
    @Autowired
    private LigneCommandeServices repLigneCommande;
    @Autowired
    private CommandeRepository repCommande;
    @GetMapping("/commande")
    public List<Commande> findAll(@RequestParam Long id) {
        return repCommande.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Commande> findById(Long id) {
        return repCommande.findById(id);
    }
    @Transactional(rollbackFor = StockExceptions.class)
    public void creerCommande(Commande commande) throws StockExceptions {
        repCommande.save(commande);
    }
}

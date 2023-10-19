package fr.abbo.septArche.Services;

import fr.abbo.septArche.models.Commande;

public interface CommandeService {

    Commande createCommande(Commande commande);
    Iterable<Commande> getAllCommandes();
    Commande findById(Long id);
    Commande findByRef(String ref);

}


package fr.abbo.septArche.models;

import fr.abbo.septArche.exceptions.StockExceptions;
import jakarta.persistence.Embeddable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Représente la quantité de stock d'un produit.
 */
@Embeddable
public class Stock {
    private static final Logger logger = LoggerFactory.getLogger(Stock.class);

    private int nombre;

    /**
     * Obtient la quantité actuelle en stock.
     *
     * @return La quantité actuelle en stock.
     */
    public int getNombre() {
        return nombre;
    }

    /**
     * Définit la quantité actuelle en stock.
     *
     * @param nombre La nouvelle quantité en stock.
     */
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    /**
     * Incrémente la quantité en stock en ajoutant une valeur donnée.
     *
     * @param ajout La valeur à ajouter à la quantité en stock.
     */
    public void incremente(int ajout) {
        nombre += ajout;
    }

    /**
     * Décrémente la quantité en stock en retirant une valeur donnée.
     *
     * @param ajout La valeur à retirer de la quantité en stock.
     * @throws StockExceptions Si la quantité en stock est insuffisante pour effectuer la décrémentation.
     */
    public void decremente(int ajout) throws StockExceptions {
        logger.debug("Stock avant décrémentation : {}", nombre);
        if (ajout <= nombre) {
            nombre -= ajout;
            logger.debug("Stock après décrémentation : {}", nombre);
        } else {
            throw new StockExceptions("Stock insuffisant", "404");
        }
    }
}


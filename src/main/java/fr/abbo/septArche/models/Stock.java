package fr.abbo.septArche.models;

import fr.abbo.septArche.exceptions.StockExceptions;
import jakarta.persistence.Embeddable;

@Embeddable
public class Stock {
    private int nombre;

    public int getNombre() {
        return nombre;
    }

    /**
     * Incrémente la quantité en stock en ajoutant une valeur donnée.
     * @param ajout La valeur à ajouter à la quantité en stock.
     */

    public void incremente(int ajout) {
        nombre += ajout;
    }

    /**
     * Décrémente la quantité en stock en retirant une valeur donnée.
     * @param ajout La valeur à retirer de la quantité en stock.
     * @throws StockExceptions Si la quantité en stock est insuffisante .
     */

    public void decremente(int ajout) throws StockExceptions {
        if (ajout <= nombre) {
            nombre -= ajout;
        } else {
            throw new StockExceptions("stock insuffisant");
        }
    }

}

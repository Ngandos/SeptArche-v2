package fr.abbo.septArche.models;

import fr.abbo.septArche.exceptions.StockExceptions;
import jakarta.persistence.Embeddable;

@Embeddable
public class Stock {
    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void incremente(int ajout) {
        nombre += ajout;
    }

    public void decremente(int ajout) throws StockExceptions {
        if (ajout <= nombre) {
            nombre -= ajout;
        } else {
            throw new StockExceptions("stock insuffisant");
        }
    }

}

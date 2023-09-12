package fr.abbo.septArche.models;

import fr.abbo.septArche.exceptions.StockExceptions;
import jakarta.persistence.Embeddable;

    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;

    @Embeddable
    public class Stock {

        private static final Logger logger = LoggerFactory.getLogger(Stock.class);
        private int nombre;

        /**
         * Recupere le nombre d'Articles disponibles en Stock
         */
        public int getNombre() {
            return nombre;
        }

        /**
         * Permet de Definir le nombre d'article présent en stock au moment
         * de la persistence de ce même article.
         */

        public void setNombre(int nombre) {
            this.nombre = nombre;
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
         * @throws StockExceptions Si la quantité en stock est insuffisante.
         */

        public void decremente(int ajout) throws StockExceptions {
            logger.debug("stock avant decrementation : {}", nombre);
            if (ajout <= nombre) {
                nombre -= ajout;
                logger.debug("stock apres decrementation : {}", nombre);
            } else {
                throw new StockExceptions("stock insuffisant");
            }
        }
    }

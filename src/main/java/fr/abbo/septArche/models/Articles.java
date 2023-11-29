package fr.abbo.septArche.models;

import jakarta.persistence.*;

    @Entity
    @Table(name = "articles")
    @Inheritance(strategy = InheritanceType.JOINED)
    public class Articles {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        private Long id;
        @Column(name = "ref", nullable =  false, length = 30, unique = true)
        private String ref;
        private String designation;
        private String categorie;
        private double prixHT;
        private double tva = 0.2;
        private double prixTTC = prixHT * (1 + tva);

        // Stock est une classe embedded, sa valeur est insérée dans l'article et il n'y a pas de table associée
        @Embedded
        @AttributeOverrides({
            @AttributeOverride( name = "nombre", column = @Column(name = "stock"))
        })
        private Stock stock;
        @Column(name = "is_num")
        private boolean numerique;

        protected Articles(){}

        public Articles(Long id, String ref, String designation, String categorie, double prixHT, double tva, double prixTTC, Stock stock, boolean numerique) {
            this.id = id;
            this.ref = ref;
            this.designation = designation;
            this.categorie = categorie;
            this.prixHT = prixHT;
            this.tva = tva;
            this.prixTTC = prixTTC;
            this.stock = stock;
            this.numerique = numerique;
        }

        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getRef() {
            return ref;
        }
        public void setRef(String ref) {
            this.ref = ref;
        }
        public String getDesignation() {
            return designation;
        }
        public void setDesignation(String designation) {
            this.designation = designation;
        }
        public String getCategorie() {
            return categorie;
        }
        public void setCategorie(String categorie) {
            this.categorie = categorie;
        }
        public double getPrixHT() {
            return prixHT;
        }
        public void setPrixHT(double prixHT) {
            this.prixHT = prixHT;
        }
        public double getTva() {
            return tva;
        }
        public void setTva(double tva) {
            this.tva = tva;
        }
        public double getPrixTTC() {
            return prixTTC;
        }
        public void setPrixTTC(double prixTTC) {
            this.prixTTC = prixTTC;
        }
        public Stock getStock() {
            return stock;
        }
        public void setStock(Stock stock) {
            this.stock = stock;
        }
        public boolean isNumerique() {
            return numerique;
        }
        public void setNumerique(boolean numerique) {
            this.numerique = numerique;
        }

        @Override
        public String toString() {
            return "Articles{" + "id=" + id + ", ref='" + ref + '\'' + ", designation='" + designation + '\'' +
                    ", categorie='" + categorie + '\'' + ", prixHT=" + prixHT + ", tva=" + tva + ", prixTTC=" + prixTTC +
                    ", stock=" + stock + ", numerique=" + numerique + '}';
        }
    }

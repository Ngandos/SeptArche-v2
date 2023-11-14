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
    @Transient
    private double prixTTC = prixHT * (1 + tva);

    // Stock est une classe embedded, sa valeur est insérée dans l'article et il n'y a pas de table associée
    @Embedded
    @AttributeOverrides({
        @AttributeOverride( name = "nombre", column = @Column(name = "stock"))
    })
    private Stock stock;
    @ManyToOne()
    @JoinColumn(name = "vendeur_id")
    private Vendeur vendeur;

    protected Articles(){}

    public Articles(Long id, String categorie, double prixHT, String ref, String designation, double prixTTC) {
        this.id = id;
        this.ref = ref;
        this.designation = designation;
        this.categorie = categorie;
        this.prixHT = prixHT;
        this.stock = new Stock();
        this.prixTTC = prixTTC;
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
    public Stock getStock() {
        return stock;
    }
    public void setStock(Stock stock) {
        this.stock = stock;
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
    public double getPrixTTC() {
        return prixHT*(1+tva);
    }
    public double getTva() {
        return tva;
    }
    public void setTva(double tva) {
        this.tva = tva;
    }
    public Vendeur getVendeur() {
        return vendeur;
    }
    public void setVendeur(Vendeur vendeur) {
        this.vendeur = vendeur;
    }
    @Override
    public String toString() {
        return "Articles{" +
                "id = " + id + ", ref='" + ref + ", designation='" + designation + ", categorie='" + categorie +
                ", prixHT=" + prixHT + ", tva=" + tva + ", prixTTC = " + prixTTC + ", stock=" + stock +
                ", vendeur=" + vendeur + '}';
    }
}

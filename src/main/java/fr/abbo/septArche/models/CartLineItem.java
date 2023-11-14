package fr.abbo.septArche.models;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class CartLineItem {
    private int id;
    @OneToOne
    @JoinColumn(name= "article_id")
    private int article;
    @JoinColumn(name= "article_ref")
    private String ref;
    @JoinColumn(name= "article_categorie")
    private String categorie;
    @JoinColumn(name= "article_prixHT")
    private double prixHT;
    @JoinColumn(name= "article_prixTTC")
    private double prixTTC;
    @JoinColumn(name= "article_tva")
    private float tva;
    @JoinColumn(name= "article_designation")
    private String designation;
    @JoinColumn(name= "article_quantite")
    private long qty;
    private double lineTotal;

    public CartLineItem(){}

    public CartLineItem(int id, int article, String ref, String categorie, double prixHT, double prixTTC, float tva, String designation, long qty, double lineTotal) {
        this.id = id;
        this.article = article;
        this.ref = ref;
        this.categorie = categorie;
        this.prixHT = prixHT;
        this.prixTTC = prixTTC;
        this.tva = tva;
        this.designation = designation;
        this.qty = qty;
        this.lineTotal = lineTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
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
        return prixTTC;
    }

    public void setPrixTTC(double prixTTC) {
        this.prixTTC = prixTTC;
    }

    public float getTva() {
        return tva;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getQty() {
        return qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }

    public double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }

    @Override
    public String toString() {
        return "CartLineItem{" +
                "id=" + id +
                ", article=" + article +
                ", ref='" + ref + '\'' +
                ", categorie='" + categorie + '\'' +
                ", prixHT=" + prixHT +
                ", prixTTC=" + prixTTC +
                ", tva=" + tva +
                ", designation='" + designation + '\'' +
                ", qty=" + qty +
                ", lineTotal=" + lineTotal +
                '}';
    }
}

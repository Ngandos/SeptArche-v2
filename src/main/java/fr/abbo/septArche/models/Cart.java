package fr.abbo.septArche.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private long id;
    private double prixHT;
    private double prixTTC;
    private double tva;
    private double PrixTTC = prixHT * (1 + tva );
    private List<CartLineItem> contenu = new ArrayList<>();

    public Cart(Long id, double prixHT, double prixTTC, double tva) {
        this.id = id;
        this.prixHT = prixHT;
        this.prixTTC = prixTTC;
        this.tva = tva;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public double getTva() {
        return tva;
    }
    public void setTva(double tva) {
        this.tva = tva;
    }
    @Override
    public String toString() {
        return "Cart{" + "id=" + id + ", prixHT=" + prixHT + ", prixTTC=" + prixTTC + ", tva=" + tva + ", PrixTTC=" + PrixTTC + ", contenu=" + contenu + '}';
    }
}

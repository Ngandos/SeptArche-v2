package fr.abbo.septArche.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private long id;
    private List<CartLineItem> contenu = new ArrayList<>();
    private double prixHT;
    private double tva;
    private double prixTTC;

    public Cart() {}

    public Cart(long id, List<CartLineItem> contenu, double prixHT, double tva, double prixTTC) {
        this.id = id;
        this.contenu = contenu;
        this.prixHT = prixHT;
        this.tva = tva;
        this.prixTTC = prixTTC;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<CartLineItem> getContenu() {
        return contenu;
    }

    public void setContenu(List<CartLineItem> contenu) {
        this.contenu = contenu;
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

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", contenu=" + contenu +
                ", prixHT=" + prixHT +
                ", tva=" + tva +
                ", prixTTC=" + prixTTC +
                '}';
    }
}

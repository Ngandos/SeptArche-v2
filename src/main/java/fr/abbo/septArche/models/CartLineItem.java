package fr.abbo.septArche.models;

public class CartLineItem {
    private double prixHT;
    private double prixLineTTC;
    private String designation;
    private long qty;

    public CartLineItem(){}
    public CartLineItem(long qty, Articles article) {
        this.prixLineTTC = article.getPrixTTC() * qty;
        this.qty = qty;
    }

    public double getPrixHT() {
        return prixHT;
    }
    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
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


}

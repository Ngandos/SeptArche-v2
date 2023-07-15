package fr.abbo.septArche.models;

public class CartLineItem {
    private double prixLineHT;
    private double prixLineTTC;
    private String designation;
    private long qty;

    public CartLineItem(){}
    public CartLineItem(long qty, Articles article) {
        this.prixLineTTC = article.getPrixTTC() * qty;
        this.qty = qty;
    }

    public double getPrixLineHT() {
        return prixLineHT;
    }
    public void setPrixLineHT(double prixLineHT) {
        this.prixLineHT = prixLineHT;
    }
    public double getPrixLineTTC() {
        return prixLineTTC;
    }
    public void setPrixLineTTC(double prixLineTTC) {
        this.prixLineTTC = prixLineTTC;
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

    @Override
    public String toString() {
        return "CartLineItem{" +
                "prixLineHT=" + prixLineHT +
                ", prixLineTTC=" + prixLineTTC +
                ", designation='" + designation + '\'' +
                ", qty=" + qty +
                '}';
    }
}

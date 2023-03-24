package fr.abbo.eArche.models;
public class Articles {
    private int id;
    private String category;
    private float prixHT;
    private int tva;
    private int prixTTC;

    public Articles(int id, String category, float prixHT, int tva, int prixTTC) {
        this.id = id;
        this.category = category;
        this.prixHT = prixHT;
        this.tva = tva;
        this.prixTTC = prixTTC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(float prixHT) {
        this.prixHT = prixHT;
    }

    public int getTva() {
        return tva;
    }

    public void setTva(int tva) {
        this.tva = tva;
    }

    public int getPrixTTC() {
        return prixTTC;
    }

    public void setPrixTTC(int prixTTC) {
        this.prixTTC = prixTTC;
    }

    @Override
    public String toString() {
        return "Articles{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", prixHT=" + prixHT +
                ", tva=" + tva +
                ", prixTTC=" + prixTTC +
                '}';
    }
}

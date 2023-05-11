package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "articles")
@Inheritance(strategy = InheritanceType.JOINED)
public class Articles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String category;
    private double prixHT;
    private double tva = 0.2;
    private int prixTTC;
    private String ref;
    private String designation;

    protected Articles(){}

    public Articles(Long id, String category, double prixHT, double tva, int prixTTC, String ref, String designation) {
        this.id = id;
        this.category = category;
        this.prixHT = prixHT;
        this.tva = tva;
        this.prixTTC = prixTTC;
        this.ref = ref;
        this.designation = designation;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
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
    public int getPrixTTC() {
        return prixTTC;
    }
    public void setPrixTTC(int prixTTC) {
        this.prixTTC = prixTTC;
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
    @Override
    public String toString() {
        return "Articles{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", prixHT=" + prixHT +
                ", tva=" + tva +
                ", prixTTC=" + prixTTC +
                ", ref='" + ref + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

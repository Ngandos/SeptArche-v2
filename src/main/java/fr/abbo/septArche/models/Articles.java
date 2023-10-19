package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "articles")
@Inheritance(strategy = InheritanceType.JOINED)
public class Articles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ref",length = 50)
    private String ref;

    @Column(name = "categorie")
    private String categorie;

    @Column(name = "designation", length = 100)
    private String designation;
    @Column(name = "resume", length = 500)
    private String resume;

    @Column(name = "prixHT")
    private double prixHT;

    @Column(name = "tva")
    private double tva = 0.2;
    @Column(name = "image", length = 255)
    private String image;

    @Column(name = "format", length = 50)
    private String format;

    @Column(name = "is_num")
    private boolean numerique;


    // Stock est une classe embedded, sa valeur est insérée dans l'article et il n'y a pas de table associée
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "nombre", column = @Column(name = "stock"))
    })
    private Stock stock;

    //constructeur

    public Articles() {

    }

    public Articles(Long id, String ref, String categorie, String designation, String resume, double prixHT, double tva, String image, String format, boolean numerique, Stock stock) {
        this.id = id;
        this.ref = ref;
        this.categorie = categorie;
        this.designation = designation;
        this.resume = resume;
        this.prixHT = prixHT;
        this.tva = tva;
        this.image = image;
        this.format = format;
        this.numerique = numerique;
        this.stock = new Stock();
    }

    //getters et setters

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

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getResume() {
        return resume;
    }
    public void setResume(String resume) {
        this.resume = resume;
    }
    public double getPrixHT() {
        return prixHT;
    }
    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }
    public double getPrixTTC() {
        return prixHT * (1 + tva);
    }
    public double getTva() {
        return tva;
    }
    public void setTva(double tva) {
        this.tva = tva;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public boolean isNumerique() {
        return numerique;
    }
    public void setNumerique(boolean numerique) {
        this.numerique = numerique;
    }
    public Stock getStock() {
        return stock;
    }
    public void setStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Articles{" +
                "id=" + id +
                ", ref='" + ref + '\'' +
                ", designation='" + designation + '\'' +
                ", resume='" + resume + '\'' +
                ", prixHT=" + prixHT +
                ", tva=" + tva +
                ", image='" + image + '\'' +
                ", format='" + format + '\'' +
                ", numerique=" + numerique +
                ", stock=" + stock +
                '}';
    }
}


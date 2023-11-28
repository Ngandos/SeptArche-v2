package fr.abbo.septArche.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    /*@JoinColumn(name = "idClient")
    @OneToOne()
    private Client client;*/
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "id")
    private List<LigneCommande> contenu = new ArrayList<>();
    private Integer numComm;
    private Date dateComm;
    private String status;
    private float prixHT;
    private double tva = 0.2;
    @Transient
    private double prixTTC = prixHT * (1 + tva);
    private double tvaCom = prixTTC * (1 - prixHT);

    public Commande(){}

    public Commande(Long id, List<LigneCommande> contenu, Integer numComm, Date dateComm, String status) {
        this.id = id;
        this.contenu = contenu;
        this.numComm = numComm;
        this.dateComm = dateComm;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<LigneCommande> getContenu() {
        return contenu;
    }

    public void setContenu(List<LigneCommande> contenu) {
        this.contenu = contenu;
    }

    public Integer getNumComm() {
        return numComm;
    }

    public void setNumComm(Integer numComm) {
        this.numComm = numComm;
    }

    public Date getDateComm() {
        return dateComm;
    }

    public void setDateComm(Date dateComm) {
        this.dateComm = dateComm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(float prixHT) {
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
        return "Commande{" +
                "id=" + id +
                ", contenu=" + contenu +
                ", numComm=" + numComm +
                ", dateComm=" + dateComm +
                ", status='" + status + '\'' +
                ", prixHT=" + prixHT +
                ", tva=" + tva +
                ", prixTTC=" + prixTTC +
                '}';
    }
}
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
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "commande")
    private List<LigneCommande> contenu = new ArrayList<>();
    private String numComm;
    private Date dateComm;
    private String status;
    public Commande(){}

    public Commande(Long id, List<LigneCommande> contenu, String numComm, Date dateComm, String status) {
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

    public String getNumComm() {
        return numComm;
    }

    public void setNumComm(String numComm) {
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

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", contenu=" + contenu +
                ", numComm='" + numComm + '\'' +
                ", dateComm=" + dateComm +
                ", status='" + status + '\'' +
                '}';
    }
}
package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    String date_commande;
    String status;
    Long id_panier;
    public Commande(){}
    public Commande(Long id, String date_commande, String status, Long id_panier) {
        this.id = id;
        this.date_commande = date_commande;
        this.status = status;
        this.id_panier = id_panier;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDate_commande() {
        return date_commande;
    }
    public void setDate_commande(String date_commande) {
        this.date_commande = date_commande;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Long getId_panier() {
        return id_panier;
    }
    public void setId_panier(Long id_panier) {
        this.id_panier = id_panier;
    }
    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id + ", date_commande=" + date_commande + ", status='" + status + '\'' + ", panier=" + id_panier + '}';
    }
}
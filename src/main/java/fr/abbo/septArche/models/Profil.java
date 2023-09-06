package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "profil")
public class Profil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    Long id;

    @OneToOne
    @JoinColumn(name="utilisateur_id")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name="commande_id")
    private Commande commande;

    /*@ManyToOne
    @JoinColumn(name="cart_id")
    private Cart cart;*/

    public Profil() {}

    public Profil(Long id, Utilisateur utilisateur, Commande commande/*, Cart cart*/) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.commande = commande;
        /*this.cart = cart;*/
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public Commande getCommande() {
        return commande;
    }
    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    /*public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }*/

    @Override
    public String toString() {
        return "Profil{" + "id=" + id + ", utilisateur=" + utilisateur + ", commande=" + commande + /*", cart=" + cart*/ + '}';
    }
}
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
    @JoinColumn(name="user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name="commande_id")
    private Commande commande;

    /*@ManyToOne
    @JoinColumn(name="cart_id")
    private Cart cart;*/

    public Profil() {}

    public Profil(Long id, Users users, Commande commande/*, Cart cart*/) {
        this.id = id;
        this.users = users;
        this.commande = commande;
        /*this.cart = cart;*/
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Users getUser() {
        return users;
    }
    public void setUser(Users users) {
        this.users = users;
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
        return "Profil{" + "id=" + id + ", user=" + users + ", commande=" + commande + /*", cart=" + cart*/ + '}';
    }
}
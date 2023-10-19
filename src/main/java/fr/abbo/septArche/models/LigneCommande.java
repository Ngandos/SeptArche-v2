package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ligneCommande")
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantite")
    private int quantite;

    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    @ManyToOne  //oneToOne
    @JoinColumn(name = "article_id")
    private Articles articles;

    //constructeur
    public LigneCommande() {

    }

    public LigneCommande(Long id, int quantite, Commande commande, Articles articles) {
        this.id = id;
        this.quantite = quantite;
        this.commande = commande;
        this.articles = articles;
    }

    // getters et setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Articles getArticles() {
        return articles;
    }

    public void setArticle(Articles article) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "LigneCommande{" +
                "id=" + id +
                ", quantite=" + quantite +
                ", commande=" + commande +
                ", article=" + articles +
                '}';
    }
}

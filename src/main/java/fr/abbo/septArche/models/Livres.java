package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "livres")
@PrimaryKeyJoinColumn(name = "id")
public class Livres extends Articles {
    private String titre;
    @JoinColumn(name = "idAuteur")
    @ManyToOne
    private Auteurs auteur;
    private String editeur;
    private String isbn;

    public Livres() {
    }

    public Livres(String titre, Auteurs auteur, String editeur, String isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Auteurs getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteurs auteur) {
        this.auteur = auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livre{" +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", editeur='" + editeur + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

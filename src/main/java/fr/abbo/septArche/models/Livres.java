package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "livres")
@PrimaryKeyJoinColumn(name = "id")
public class Livres extends Articles {
    private String titre;
    @JoinColumn(name = "idAuteurs")
    @ManyToOne
    private Auteurs auteurs;
    @JoinColumn(name = "idEditeurs")
    @ManyToOne
    private Editeurs editeurs;
    private String isbn;

    public Livres() {
    }

    public Livres(String titre, Auteurs auteurs, Editeurs editeurs, String isbn) {
        this.titre = titre;
        this.auteurs = auteurs;
        this.editeurs = editeurs;
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public Auteurs getAuteurs() {
        return auteurs;
    }
    public void setAuteurs(Auteurs auteurs) {
        this.auteurs = auteurs;
    }
    public Editeurs getEditeurs() {
        return editeurs;
    }
    public void setEditeurs(Editeurs editeurs) {
        this.editeurs = editeurs;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livres{" + ", titre='" + titre + '\'' + ", auteurs=" + auteurs + ", editeurs='" + editeurs + '\'' +
                ", isbn='" + isbn + '\'' + '}';
    }
}

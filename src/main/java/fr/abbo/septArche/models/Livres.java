package fr.abbo.septArche.models;

public class Livres {

    private  String titre;
    private String editeur;
    private String auteur;
    private int ISBN;

    public Livres() {

    }

    public Livres(String titre, String editeur, String auteur, int ISBN) {
        this.titre = titre;
        this.editeur = editeur;
        this.auteur = auteur;
        this.ISBN = ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Livres{" +
                "titre='" + titre + '\'' +
                ", editeur='" + editeur + '\'' +
                ", auteur='" + auteur + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }
}

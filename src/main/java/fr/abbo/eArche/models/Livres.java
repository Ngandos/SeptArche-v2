package fr.abbo.eArche.models;

public class Livres {

    private  String titre;
    private String editeur;
    private String auteur;
    private int ISSBN;

    public Livres(String titre, String editeur, String auteur, int ISSBN) {
        this.titre = titre;
        this.editeur = editeur;
        this.auteur = auteur;
        this.ISSBN = ISSBN;
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

    public int getISSBN() {
        return ISSBN;
    }

    public void setISSBN(int ISSBN) {
        this.ISSBN = ISSBN;
    }

    @Override
    public String toString() {
        return "Livres{" +
                "titre='" + titre + '\'' +
                ", editeur='" + editeur + '\'' +
                ", auteur='" + auteur + '\'' +
                ", ISSBN=" + ISSBN +
                '}';
    }
}

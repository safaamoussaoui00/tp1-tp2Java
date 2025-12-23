package ex4tp;

public class Utilisateur {
    private String nom;
    private static int compteur = 0;

    public Utilisateur(String nom) {
        this.nom = nom;
        compteur++;
    }

    public static int getCompteurUtilisateurs() {
        return compteur;
    }

    public String getNom() {
        return nom;
    }
}

package exercice3Tp;
public class Article {
    private String nom;
    private double prix;

    public Article(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Article: " + nom + ", Prix: " + prix + "€";
    }

    public double getPrix() {
        return prix;
    }
}

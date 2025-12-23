package exercice3Tp;

public class TestPanier {
    public static void main(String[] args) {
     
        Article a1 = new Article("tricot", 50.5);
        Article a2 = new Article("sac", 20.3);
        Article a3 = new Article("chaussures", 10.0);

        Panier panier = new Panier(5);
        panier.ajouterArticle(a1);
        panier.ajouterArticle(a2);
        panier.ajouterArticle(a3);

        panier.afficherPanier();

        System.out.println("Prix total: " + panier.calculerTotal() + "€");
    }
}

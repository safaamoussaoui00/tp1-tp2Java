package exercice3Tp;

public class Panier {
    private Article[] articles;
    private int nombreArticles;

    public Panier(int taille) {
        articles = new Article[taille];  
        nombreArticles = 0;
    }

    public void ajouterArticle(Article article) {
        if (nombreArticles < articles.length) {
            articles[nombreArticles] = article;
            nombreArticles++;
        } else {
            System.out.println("Le panier est plein !");
        }
    }
    public double calculerTotal() {
        double total = 0;
        for (int i = 0; i < nombreArticles; i++) {
            total += articles[i].getPrix();
        }
        return total;
    }

   
    public void afficherPanier() {
        System.out.println("Contenu du panier :");
        for (int i = 0; i < nombreArticles; i++) {
            System.out.println(articles[i]);
        }
    }
}

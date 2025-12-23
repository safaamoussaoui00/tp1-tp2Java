package tpjavaa;

public class main {
public static void main(String[] args) {
        Voiture v1 = new Voiture("Renault", "Clio", 2020);
        v1.afficherDetails();
        v1.setAnnee(2021);
        v1.afficherDetails();
        System.out.println("obtenir marque: " + v1.getMarque());
    }
}

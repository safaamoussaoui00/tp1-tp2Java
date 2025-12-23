package tpjavaa;

public class Garage {
    public static void main(String[] args) {

        Voiture voiture1 = new Voiture("Peugeot", "208", 2021);

        Voiture voiture2 = new Voiture("Volkswagen", "Golf", 2019);
        voiture1.afficherDetails();  

        voiture2.setAnnee(2020);

        System.out.println("Modèle de voiture2: " + voiture2.getModele()); 

        voiture2.afficherDetails();  
    }
}


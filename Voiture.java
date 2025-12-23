package com.garage;

public class Voiture extends Vehicule {

   
    private int nombreDePortes;

  
    public Voiture(String marque, String modele, int annee, int nombreDePortes) {
        super(marque, modele, annee);
        this.nombreDePortes = nombreDePortes;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails(); 
        System.out.println("Nombre de portes : " + nombreDePortes);
    }
}

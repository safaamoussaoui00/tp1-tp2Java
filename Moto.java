package com.garage;

public class Moto extends Vehicule {

    
    private int cylindree;

    // Constructeur
    public Moto(String marque, String modele, int annee, int cylindree) {
        super(marque, modele, annee);
        this.cylindree = cylindree;
    }

   
    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Cylindrée : " + cylindree + " cc");
    }
}

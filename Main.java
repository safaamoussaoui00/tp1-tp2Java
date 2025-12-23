package com.geometrique;
public class Main {

    public static void main(String[] args) {

        Forme[] formes = new Forme[3];

        formes[0] = new Cercle(3);
        formes[1] = new Rectangle(4, 5);
        formes[2] = new Cercle(2);

       
        for (Forme f : formes) {
            f.afficherType();    // polymorphisme ici
            System.out.println("Aire = " + f.calculerAire());

  
            if (f instanceof Cercle) {
                Cercle c = (Cercle) f; //
                System.out.println("Rayon = " + c.getRayon());
            }
            else if (f instanceof Rectangle) {
                Rectangle r = (Rectangle) f;
                System.out.println("Longueur = " + r.getLongueur());
                System.out.println("Largeur = " + r.getLargeur());
            }


        }

        testerCast();
    }     public static void testerCast() {

        System.out.println("=== Test Cast ===");

     
        Forme f = new Cercle(5);
        System.out.println("Upcast réussi");

      
        if (f instanceof Cercle) {
            Cercle c = (Cercle) f;
            System.out.println("Downcast vers Cercle réussi");
        } else {
            System.out.println("Downcast impossible");
        }

        try {
            Rectangle r = (Rectangle) f; 
        } catch (ClassCastException e) {
            System.out.println("Erreur : downcast Cercle -> Rectangle impossible");
        }
    }
}



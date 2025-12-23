package com.geometrique;

public class Cercle extends Forme {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    @Override
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public void afficherType() {
        System.out.println("Cercle");
    }

    public double getRayon() {
        return rayon;
    }
}

package com.garage;

public class Vehicule {
	protected String marque;
	protected String modele;
	protected int annee;
	
	public Vehicule(String marque,String modele,int annee) {
		this.marque=marque;
		this.annee=annee;
		this.modele=modele;
	}
	
	public void afficherDetails() {
	System.out.println("vehicule de marque:"+ marque + " " + modele + ", Année: " + annee);
	}}	
	
	


















package com.company;

public class Project {
    private String nomProjet;
    private Developer[] equipe;
    private int nombreDeveloppeurs;
    
    public Project(String nomProjet) {
	this.nomProjet=nomProjet;
    this.equipe = new Developer[5];  
    nombreDeveloppeurs = 0;
}
    public void ajouterDeveloppeurs(Developer dev) {
	if (nombreDeveloppeurs < equipe.length) {
       equipe[nombreDeveloppeurs] = dev;
        nombreDeveloppeurs++;
    } else {
        System.out.println("capacite max atteinte !");
    }
}
public void afficherEquipe() {
	System.out.println("Projet:" + nomProjet);
	System.out.println("Equipe:");
	for(int i=0;i<nombreDeveloppeurs;i++) {
		System.out.println(" :"+equipe[i].getNom());
	}
}}























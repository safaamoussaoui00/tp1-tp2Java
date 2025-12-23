package com.company;

public class GestionProjet {
	public static void main(String[] args) {
		Developer d1=new Developer("safaa");
		Developer d2=new Developer("Yassmine");
		Developer d3=new Developer("Ahmed");
		Developer d4=new Developer("selma");
		Developer d5=new Developer("yassine");
		Developer d6=new Developer("alice");
		Project p=new Project("java");
		
		p.ajouterDeveloppeurs(d1);
		p.ajouterDeveloppeurs(d2);
		p.ajouterDeveloppeurs(d3);
		p.ajouterDeveloppeurs(d4);
		p.ajouterDeveloppeurs(d5);
		p.ajouterDeveloppeurs(d6);
		p.afficherEquipe();
		
	}
}

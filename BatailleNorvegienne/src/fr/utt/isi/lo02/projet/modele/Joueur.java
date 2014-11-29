package fr.utt.isi.lo02.projet.modele;

import java.util.Scanner;

public class Joueur {
	protected int idJoueur;
	protected String nomJoueur;
	
	// TODO rajouter le nom au joueur 
	public Joueur(int idJoueur){
		this.idJoueur=idJoueur;
		//this.nomJoueur=nomJoueur;
	}
	
	public static int choisirNbJoueur(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir un nombre de joueurs entre 1 et 10 :");
		int nbJoueur = sc.nextInt();
		System.out.println("Vous avez saisi : " + nbJoueur);
		
		if(nbJoueur > 10){
			System.out.println("Entre 1 et 10, c'est pas compliqué non ? ");
			choisirNbJoueur(); 
		}
		return nbJoueur;
	} 
	
	public static Joueur[] listJoueur(){
		int nbJoueur = choisirNbJoueur();
		Joueur[] tabJoueur = new Joueur[nbJoueur];
		for(int i = 0 ; i<nbJoueur ; i++){
			Joueur j = new Joueur(i);
			tabJoueur[i]= j;
			System.out.println(tabJoueur[i]);
		}
		return tabJoueur; 	
	}
	public void echangerLesCartes(Carte carte1, Carte carte2){
		
	}
	
}

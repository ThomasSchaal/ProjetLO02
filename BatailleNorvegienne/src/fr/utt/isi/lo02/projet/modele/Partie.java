package fr.utt.isi.lo02.projet.modele;

import java.util.Scanner;

import fr.utt.isi.lo02.projet.modele.Carte.COULEUR;
import fr.utt.isi.lo02.projet.modele.Carte.FORCE;

public class Partie {  // Cette class sera p-e dans le controleur

	private int nbJoueur;
	private int joueurActif; 
	private int nbTour;
	
	public Partie(int nbJoueur, int joueurActif, int nbTour){
		this.nbJoueur=nbJoueur;
		this.joueurActif=joueurActif;
		this.nbTour=nbTour;
	}
	
	public Partie(){
		
	}
	
	public int choisirNbJoueur(){
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
	
	public void incrementerTour(){
		
	}
	
	public void incrementerJoueurActif(){
		
	}
	
	public void obtenirNbJoueur(){
	
	}
	
	
	public static void main(String[] args) {
		/*Partie p1 = new Partie();
		p1.choisirNbJoueur();
		fr.utt.isi.lo02.projet.modele.Carte c1 = new Carte(0, "roiDeTrefle", COULEUR.Trefle, FORCE.roi, 1);*/
		JeuDeCarte jdc = new JeuDeCarte();
		jdc.battreLeJeu();
		jdc.toString();
		// poney party !!!
		
		
	}
}

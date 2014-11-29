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
	
	
	
	public void incrementerTour(){
		
	}
	
	public void incrementerJoueurActif(){
		
	}
	
	public void obtenirNbJoueur(){
	
	}
	
	
	public static void main(String[] args) {
		Partie p1 = new Partie();
		Joueur.listJoueur();
		
//		fr.utt.isi.lo02.projet.modele.Carte c1 = new Carte(0,  COULEUR.Trefle, FORCE.roi);
//		JeuDeCarte jdc = new JeuDeCarte();
//		jdc.battreLeJeu();
//		System.out.println(jdc.toString());		
	}
}

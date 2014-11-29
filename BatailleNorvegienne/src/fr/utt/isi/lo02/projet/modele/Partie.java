package fr.utt.isi.lo02.projet.modele;

import fr.utt.isi.lo02.projet.modele.Carte.COULEUR;
import fr.utt.isi.lo02.projet.modele.Carte.FORCE;

public class Partie {  // Cette class sera p-e dans le controleur

	private Joueur[] listJoueur;
	//private int joueurActif; 
	private int nbTour;
	
	public Partie(Joueur[] listJoueur){//, int joueurActif, int nbTour){
		this.listJoueur=listJoueur;
		//this.joueurActif=joueurActif;
		//this.nbTour=nbTour;
	}
		
	public void incrementerTour(){
		nbTour++; 
	}
	
	public void incrementerJoueurActif(){
		
	}
	
	public void obtenirNbJoueur(){
	
	}
	
	
	public static void main(String[] args) {
		
		Partie p1 = new Partie(Joueur.listJoueur());
//		fr.utt.isi.lo02.projet.modele.Carte c1 = new Carte(0,  COULEUR.Trefle, FORCE.roi);
//		JeuDeCarte jdc = new JeuDeCarte();
//		jdc.battreLeJeu();
//		System.out.println(jdc.toString());		
	}
}

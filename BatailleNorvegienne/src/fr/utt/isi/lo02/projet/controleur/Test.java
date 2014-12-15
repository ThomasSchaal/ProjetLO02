package fr.utt.isi.lo02.projet.controleur;

import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

import fr.utt.isi.lo02.projet.modele.Joueur;
import fr.utt.isi.lo02.projet.modele.Partie;

public class Test {

	public static void main(String[] args) {
		/**
		 *  Créé une partie avec des joueurs, une pioche et un tapis 
		 */
		Partie p1 = new Partie(Joueur.listJoueur());
		/**
		 *  Distribue les cartes en début de partie 
		 */
		p1.distribuerCarte();	
		
		
		
		while(!p1.getPioche().getCartesDeLaPioche().isEmpty()){
			for(int i=0 ; i<p1.getListJoueur().size();  i++){
				/**
				 * Affiche les cartes de la main 
				 */
				System.out.println(p1.getListJoueur().get(i).getMain().getCartesMain().toString());
				
				/**
				 * Ajoute la carte choisit au tapis // pose la carte sur le tapis
				 */
				p1.getTapis().ajouterCarteTapis(p1.getListJoueur().get(i).choisirCarteMain());
				
				/**
				 * Pioche une carte et la met dans la main
				 */
				p1.getListJoueur().get(i).getMain().ajouterCarteMain(p1.getPioche().prendreCarteDuDessus());	
				
				/**
				 * Passe au joueur suivant 
				 */
			}
		}
	}
}

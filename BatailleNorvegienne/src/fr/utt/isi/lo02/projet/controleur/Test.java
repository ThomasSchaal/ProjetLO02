package fr.utt.isi.lo02.projet.controleur;

import fr.utt.isi.lo02.projet.modele.Carte;
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
				 * Choisit une carte  // pose la carte sur le tapis
				 * Vérification que la carte est posable 
				 * Ne gère pas si le joueur n'a pas de carte posable -> CRASH
				 */
				Carte carte = p1.getListJoueur().get(i).choisirCarteMain();
				if (p1.getTapis().getCartesTapis().isEmpty()) {
					p1.getTapis().ajouterCarteTapis(carte);
					p1.getListJoueur().get(i).getMain().getCartesMain().remove(carte);
				} else {
					if (p1.verifierCartePosable(carte, p1)){
						p1.getTapis().ajouterCarteTapis(carte);
					}else {
						Carte carte2=carte;
						while(p1.verifierCartePosable(carte2, p1) == false){
							System.out.println(p1.getListJoueur().get(i).getMain().getCartesMain().toString());
							carte2 = p1.getListJoueur().get(i).choisirCarteMain();
						}
						p1.getTapis().ajouterCarteTapis(carte2);
						p1.getListJoueur().get(i).getMain().getCartesMain().remove(carte2);
					}
				}
				
				
				/**
				 * Pioche une carte et la met dans la main
				 */
				p1.getListJoueur().get(i).getMain().ajouterCarteMain(p1.getPioche().prendreCarteDuDessus());	
				
				/**
				 * Afficher la dernière carte du tapis (celle du dessus) 
				 */
				System.out.println("Affichage de la carte au dessus du tas " +p1.getTapis().getCartesTapis().getLast().toString());
			}
		}
	}
}

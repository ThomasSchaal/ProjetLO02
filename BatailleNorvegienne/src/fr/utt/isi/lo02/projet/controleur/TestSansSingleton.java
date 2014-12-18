package fr.utt.isi.lo02.projet.controleur;

import fr.utt.isi.lo02.projet.modele.Carte;
import fr.utt.isi.lo02.projet.modele.Joueur;
import fr.utt.isi.lo02.projet.modele.PartieSansSingleton;
import fr.utt.isi.lo02.projet.modele.Partie;

public class TestSansSingleton {

//	public static void main(String[] args) {
//		
//		/**
//		 *  Créé une partie avec des joueurs, une pioche et un tapis 
//		 */
//		Partie p1 = new Partie(Joueur.listJoueur());
//		
//		
//		/**
//		 *  Distribue les cartes en début de partie 
//		 */
//		p1.distribuerCarte();	
//		
//		while(!p1.getPioche().getCartesDeLaPioche().isEmpty()){
//			for(int i=0 ; i<p1.getListJoueur().size();  i++){
//				
//				/**
//				 * Affiche les cartes de la main 
//				 */
//				System.out.println(p1.getListJoueur().get(i).getMain().getCartesMain().toString());
//				
//				/**
//				 * Choisit une carte  // pose la carte sur le tapis
//				 * Vérification que la carte est posable 
//				 * TODO : Ne gère pas si le joueur n'a pas de carte posable -> CRASH plus mais ne fait rien 
//				 */
//				Carte carte = p1.getListJoueur().get(i).choisirCarteMain();
//				if (p1.getTapis().getCartesTapis().isEmpty()) {
//					p1.getTapis().ajouterCarteTapis(carte);
//					p1.getListJoueur().get(i).getMain().getCartesMain().remove(carte);
//				} else {
//					if (p1.verifierCartePosable(carte, p1)){
//						p1.getTapis().ajouterCarteTapis(carte);
//						p1.getListJoueur().get(i).getMain().getCartesMain().remove(carte);
//					} else {
//						Carte carte2=carte;
//						int compteur = 0 ; 
//						while(p1.verifierCartePosable(carte2, p1) == false && compteur<=p1.getListJoueur().get(i).getMain().getNbCarte()){
//							System.out.println("Choisissez une autre carte, voici les cartes de votre main :\n" + p1.getListJoueur().get(i).getMain().getCartesMain().toString());
//							carte2 = p1.getListJoueur().get(i).choisirCarteMain();
//							compteur++;
//						}
//						if(compteur == p1.getListJoueur().get(i).getMain().getNbCarte()){
//							// Méthode pour dire que le tour est finit 
//							p1.getTapis().cocogne(p1, i); 
//						}
//						p1.getTapis().ajouterCarteTapis(carte2);
//						p1.getListJoueur().get(i).getMain().getCartesMain().remove(carte2); 
//					}
//				}
//				
//				
//						
//				/**
//				 * Pioche une carte et la met dans la main
//				 * En commentaire : la partie qui permet de remplir si on pose plusieurs cartes et du coup qu'il faut en piocher plusieurs 
//				 */
////				System.out.println("Avant avoir tirer une carte "+p1.getListJoueur().get(i).getMain().getNbCarte());
////				if(p1.getListJoueur().get(i).getMain().getNbCarte()<3){
////					while(p1.getListJoueur().get(i).getMain().getNbCarte()==3){
//						p1.getListJoueur().get(i).getMain().ajouterCarteMain(p1.getPioche().prendreCarteDuDessus());	
////					}
////				}
////				System.out.println("Après avoir tirer une carte "+p1.getListJoueur().get(i).getMain().getNbCarte());
//				
//				/**
//				 * Afficher la dernière carte du tapis (celle du dessus) 
//				 */
//				System.out.println("Fin du tour \nAffichage de la carte au dessus du tas " +p1.getTapis().getCartesTapis().getLast().toString());
//			}
//		}
//	}
}

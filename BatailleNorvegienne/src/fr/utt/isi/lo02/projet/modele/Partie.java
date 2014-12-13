package fr.utt.isi.lo02.projet.modele;

import java.util.Iterator;
import java.util.LinkedList;

import fr.utt.isi.lo02.projet.modele.Carte.COULEUR;
import fr.utt.isi.lo02.projet.modele.Carte.FORCE;

public class Partie { // Cette class sera p-e dans le controleur

	private Joueur[] listJoueur;
	// private int joueurActif;
	private int nbTour;

	public Partie(Joueur[] listJoueur) {// , int joueurActif, int nbTour){
		this.listJoueur = listJoueur;
		// this.joueurActif=joueurActif;
		// this.nbTour=nbTour;
	}

	public void incrementerTour() {
		nbTour++;
	}

	public void incrementerJoueurActif() {

	}

	public int getNbJoueur() {
		return listJoueur.length;
	}

	public Joueur[] getListJoueur() {
		return listJoueur;
	}

	public void setListJoueur(Joueur[] listJoueur) {
		this.listJoueur = listJoueur;
	}

	public int getNbTour() {
		return nbTour;
	}

	public void setNbTour(int nbTour) {
		this.nbTour = nbTour;
	}

	public void distribuerCarte() {
		Joueur[] tabJoueur = Partie.this.getListJoueur();
		JeuDeCarte jdc = new JeuDeCarte();
		Pioche pio ;
//		jdc.battreLeJeu();
		
		for (int i = 0; i <= (tabJoueur.length-1) ; i++) {
				while (tabJoueur[i].getMain().getNbCarte() < 3) {
					tabJoueur[i].getMain().ajouterCarteMain(jdc.pop());
					tabJoueur[i].getMain().setNbCarte(tabJoueur[i].getMain().getNbCarte() + 1);
				} 
				System.out.println("Carte main " + tabJoueur[i].getMain().getCartesMain().toString());
				 while (tabJoueur[i].getCarteCachee().getNbCarte() < 3) {
					tabJoueur[i].getCarteCachee().ajouterCarteCachee(jdc.pop());
					tabJoueur[i].getCarteCachee().setNbCarte(tabJoueur[i].getCarteCachee().getNbCarte() + 1);
				} 
				 System.out.println("Carte cachee " + tabJoueur[i].getCarteCachee().getCartesCachee().toString());
				 while (tabJoueur[i].getCarteVisible().getNbCarte() < 3) {
					tabJoueur[i].getCarteVisible().ajouterCarteVisible(jdc.pop()); // no such element 
					tabJoueur[i].getCarteVisible().setNbCarte(tabJoueur[i].getCarteVisible().getNbCarte() + 1);
				}
				 System.out.println("Carte Visible "	+ tabJoueur[i].getCarteVisible().getCartesVisible().toString());
		}
		JeuDeCarte joke = new JeuDeCarte(null); 
		int nb = jdc.size();
		joke.addAll(jdc);
		pio = new Pioche(nb, joke);
		System.out.println(pio.getCartesDeLaPioche().toString());
	}

	public static void main(String[] args) {

		Partie p1 = new Partie(Joueur.listJoueur());
		p1.distribuerCarte();

		System.out.println(p1.getListJoueur().toString());

	}
}

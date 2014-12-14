package fr.utt.isi.lo02.projet.modele;

import java.util.ArrayList;
import java.util.Collections;

public class Partie { // Cette class sera p-e dans le controleur

	private ArrayList<Joueur> listJoueur;
	private Tapis tapis;
	private Pioche pioche;
	// private int joueurActif;
	private int nbTour;

	public Partie(ArrayList<Joueur> listJoueur) {// , int joueurActif, int nbTour){
		this.listJoueur = listJoueur;
		JeuDeCarte jdcTapis = new JeuDeCarte(null); 
		JeuDeCarte jdcPioche = new JeuDeCarte(null); 
		this.tapis= new Tapis(0, jdcTapis);
		this.pioche= new Pioche(0, jdcPioche);
		// this.joueurActif=joueurActif;
		// this.nbTour=nbTour;
	}

	/**
	 * @author THOMAS
	 * 
	 * Cette méthode distribue les cartes à chaque joueurs et créé une pioche 
	 * 
	 */
	public void distribuerCarte() {
		ArrayList<Joueur> tabJoueur = Partie.this.getListJoueur();
		JeuDeCarte jdc = new JeuDeCarte();
		Pioche pio ;
		
		// Mélange les cartes avant de les distribuer
		Collections.shuffle(jdc);
		
		for (int i = 0; i <= (tabJoueur.size()-1) ; i++) {
				while (tabJoueur.get(i).getMain().getNbCarte() < 3) {
					tabJoueur.get(i).getMain().ajouterCarteMain(jdc.pop());
					tabJoueur.get(i).getMain().setNbCarte(tabJoueur.get(i).getMain().getNbCarte() + 1);
				} 
				 while (tabJoueur.get(i).getCarteCachee().getNbCarte() < 3) {
					 tabJoueur.get(i).getCarteCachee().ajouterCarteCachee(jdc.pop());
					 tabJoueur.get(i).getCarteCachee().setNbCarte(tabJoueur.get(i).getCarteCachee().getNbCarte() + 1);
				} 
				 while (tabJoueur.get(i).getCarteVisible().getNbCarte() < 3) {
					 tabJoueur.get(i).getCarteVisible().ajouterCarteVisible(jdc.pop()); 
					 tabJoueur.get(i).getCarteVisible().setNbCarte(tabJoueur.get(i).getCarteVisible().getNbCarte() + 1);
				}
		}
		
		// Création de la pioche avec les restes
		JeuDeCarte joke = new JeuDeCarte(null); 
		int nb = jdc.size();
		joke.addAll(jdc);
		this.pioche.setCartesDeLaPioche(joke);
		this.pioche.setNbCartePioche(nb);
	}
	
	public void incrementerTour() {
		nbTour++;
	}

	public void incrementerJoueurActif() {

	}

	public int getNbJoueur() {
		return listJoueur.size();
	}

	public ArrayList<Joueur> getListJoueur() {
		return listJoueur;
	}

	public void setListJoueur(ArrayList<Joueur> listJoueur) {
		this.listJoueur = listJoueur;
	}

	public int getNbTour() {
		return nbTour;
	}

	public void setNbTour(int nbTour) {
		this.nbTour = nbTour;
	}

	public Tapis getTapis() {
		return tapis;
	}

	public void setTapis(Tapis tapis) {
		this.tapis = tapis;
	}

	public Pioche getPioche() {
		return pioche;
	}

	public void setPioche(Pioche pioche) {
		this.pioche = pioche;
	}

}

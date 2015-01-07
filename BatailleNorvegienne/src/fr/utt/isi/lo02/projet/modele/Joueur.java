package fr.utt.isi.lo02.projet.modele;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import fr.utt.isi.lo02.projet.controleur.PartieControler;

public abstract class Joueur {
	protected int idJoueur;
	protected String nomJoueur;
	protected Main main;
	protected CarteCachee carteCachee;
	protected CarteVisible carteVisible;

	// TODO rajouter le nom au joueur
	public Joueur(int idJoueur, Main m, CarteCachee cc, CarteVisible cv) {
		this.idJoueur = idJoueur;
		this.main = m;
		this.carteCachee = cc;
		this.carteVisible = cv;	
	}

	/**
	 * Demande un nombre de joueur 
	 * @return nbJoueur
	 */
	public static int choisirNbJoueur() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir un nombre de joueurs entre 1 et 10 :");
		int nbJoueur = sc.nextInt();
		System.out.println("Vous avez saisi : " + nbJoueur);
		if (nbJoueur > 10 || nbJoueur == 0) {
			System.out.println("Entre 1 et 10, c'est pas compliqué non ? ");
			return choisirNbJoueur();
		}
		return nbJoueur;
	}

	
	public void echangerLesCartes(Carte carte1, Carte carte2) {

	}

	public Carte choisirCarteMain(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir une des cartes de votre main (1, 2, 3, ...) :");
		int numCarte = sc.nextInt();
		
		if (numCarte > this.getMain().getNbCarte() || numCarte == 0) {
			System.out.println("Entrer un chiffre correspondant au nombre de carte de la main");
			return choisirCarteMain();
		}
		return  this.getMain().getCartesMain().get(numCarte-1);
	}
	
	public int choisirJoueur(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir un joueur cible (0, 1, 2, 3 .... ) ");
		int idJoueur = sc.nextInt();
		
		if(idJoueur > Partie.getInstance().getNbJoueur()){
			System.out.println("Entrer un chiffre correspondant au nombre de joueur dans la partie");
			return choisirJoueur();
		}
		return idJoueur;
	}
	

	public int getIdJoueur() {
		return idJoueur;
	}

	public void setIdJoueur(int idJoueur) {
		this.idJoueur = idJoueur;
	}

	public String getNomJoueur() {
		return nomJoueur;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public CarteCachee getCarteCachee() {
		return carteCachee;
	}

	public void setCarteCachee(CarteCachee carteCachee) {
		this.carteCachee = carteCachee;
	}

	public CarteVisible getCarteVisible() {
		return carteVisible;
	}

	public void setCarteVisible(CarteVisible carteVisible) {
		this.carteVisible = carteVisible;
	}

	public abstract IStrategie getStrategy();
	
	
	@Override
	public String toString() {
		return "Joueur [idJoueur=" + idJoueur + ", nomJoueur=" + nomJoueur
				+ ", main=" + main + ", carteCachee=" + carteCachee
				+ ", carteVisible=" + carteVisible + "]\n";
	}
}

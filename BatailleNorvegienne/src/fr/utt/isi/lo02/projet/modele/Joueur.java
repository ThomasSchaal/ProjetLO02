package fr.utt.isi.lo02.projet.modele;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Joueur {
	protected int idJoueur;
	protected String nomJoueur;
	private Main main;
	private CarteCachee carteCachee;
	private CarteVisible carteVisible;

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

		if (nbJoueur > 10) {
			System.out.println("Entre 1 et 10, c'est pas compliqué non ? ");
			return choisirNbJoueur();
		}
		return nbJoueur;
	}

	/**
	 * Créer un tableau de Joueur en fonction du nombre de joueur
	 * @return un tableau de joueur
	 */
	public static ArrayList<Joueur> listJoueur() {
		int nbJoueur = choisirNbJoueur();
		ArrayList<Joueur> tabJoueur = new ArrayList<>();
		for (int i = 0; i < nbJoueur; i++) {
			JeuDeCarte jdcMain = new JeuDeCarte(null); 
			JeuDeCarte jdcCC = new JeuDeCarte(null); 
			JeuDeCarte jdcCV = new JeuDeCarte(null); 
			Main m =new Main(0, jdcMain);
			CarteCachee cc = new CarteCachee(0, jdcCC);
			CarteVisible cv = new CarteVisible(0, jdcCV);
			Joueur j = new Joueur(i, m, cc, cv);
			tabJoueur.add(j);
		}
		return tabJoueur;
	}

	public void echangerLesCartes(Carte carte1, Carte carte2) {

	}

	public Carte choisirCarteMain(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez choisir une des cartes de votre main (1, 2, 3, ...) :");
		int numCarte = sc.nextInt();
		
		if (numCarte > this.getMain().getNbCarte()) {
			System.out.println("Entrer un chiffre correspondant au nombre de carte de la main");
			return choisirCarteMain();
		}
		return  this.getMain().getCartesMain().get(numCarte-1);
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

	@Override
	public String toString() {
		return "Joueur [idJoueur=" + idJoueur + ", nomJoueur=" + nomJoueur
				+ ", main=" + main + ", carteCachee=" + carteCachee
				+ ", carteVisible=" + carteVisible + "]\n";
	}
}

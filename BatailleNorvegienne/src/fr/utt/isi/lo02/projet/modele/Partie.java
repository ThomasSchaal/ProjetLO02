package fr.utt.isi.lo02.projet.modele;

import java.util.ArrayList;
import java.util.Collections;

public class Partie {

	private static Partie uniqueInstance;
	private static ArrayList<Joueur> listJoueur;
	private Tapis tapis;
	private Pioche pioche;
	private int nbTour;

	private Partie(ArrayList<Joueur> listJoueur) {
		// PartieSingleton.listJoueur = listJoueur;
		this.listJoueur = listJoueur;
		JeuDeCarte jdcTapis = new JeuDeCarte(null);
		JeuDeCarte jdcPioche = new JeuDeCarte(null);
		this.tapis = new Tapis(0, jdcTapis);
		this.pioche = new Pioche(0, jdcPioche);
	}

	public static synchronized Partie getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Partie(Joueur.listJoueur());
		}

		return uniqueInstance;
	}

	public void jouer() {
		/**
		 * Distribue les cartes en début de partie
		 */
		Partie.getInstance().distribuerCarte();

		while (!Partie.getInstance().getPioche().getCartesDeLaPioche()
				.isEmpty()) {
			for (int i = 0; i < Partie.getInstance().getListJoueur()
					.size(); i++) {

				/**
				 * Affiche les cartes de la main
				 */
				System.out.println(Partie.getInstance()
						.getListJoueur().get(i).getMain().getCartesMain()
						.toString());

				/**
				 * Choisit une carte // pose la carte sur le tapis Vérification
				 * que la carte est posable TODO : Ne gère pas si le joueur n'a
				 * pas de carte posable -> CRASH plus mais ne fait rien
				 */
				Carte carte = Partie.getInstance().getListJoueur()
						.get(i).choisirCarteMain();
				if (Partie.getInstance().getTapis().getCartesTapis()
						.isEmpty()) {
					Partie.getInstance().getTapis()
							.ajouterCarteTapis(carte);
					Partie.getInstance().getListJoueur().get(i)
							.getMain().getCartesMain().remove(carte);
				} else {
					if (Partie.getInstance().verifierCartePosable(
							carte)) {
						Partie.getInstance().getTapis()
								.ajouterCarteTapis(carte);
						Partie.getInstance().getListJoueur().get(i)
								.getMain().getCartesMain().remove(carte);
					} else {
						Carte carte2 = carte;
						int compteur = 0;
						while (Partie.getInstance()
								.verifierCartePosable(carte2) == false
								&& compteur <= Partie.getInstance()
										.getListJoueur().get(i).getMain()
										.getNbCarte()) {
							System.out
									.println("Choisissez une autre carte, voici les cartes de votre main :\n"
											+ Partie.getInstance()
													.getListJoueur().get(i)
													.getMain().getCartesMain()
													.toString());
							carte2 = Partie.getInstance()
									.getListJoueur().get(i).choisirCarteMain();
							compteur++;
						}
						if (compteur == Partie.getInstance()
								.getListJoueur().get(i).getMain().getNbCarte()) {
							// Méthode pour dire que le tour est finit
							Partie.getInstance().getTapis().cocogne(i);
						}
						Partie.getInstance().getTapis()
								.ajouterCarteTapis(carte2);
						Partie.getInstance().getListJoueur().get(i)
								.getMain().getCartesMain().remove(carte2);
					}
				}

				/**
				 * Pioche une carte et la met dans la main En commentaire : la
				 * partie qui permet de remplir si on pose plusieurs cartes et
				 * du coup qu'il faut en piocher plusieurs
				 */
				// System.out.println("Avant avoir tirer une carte "+p1.getListJoueur().get(i).getMain().getNbCarte());
				// if(p1.getListJoueur().get(i).getMain().getNbCarte()<3){
				// while(p1.getListJoueur().get(i).getMain().getNbCarte()==3){
				Partie
						.getInstance()
						.getListJoueur()
						.get(i)
						.getMain()
						.ajouterCarteMain(
								Partie.getInstance().getPioche()
										.prendreCarteDuDessus());
				// }
				// }
				// System.out.println("Après avoir tirer une carte "+p1.getListJoueur().get(i).getMain().getNbCarte());

				/**
				 * Afficher la dernière carte du tapis (celle du dessus)
				 */
				System.out
						.println("Fin du tour \nAffichage de la carte au dessus du tas "
								+ Partie.getInstance().getTapis()
										.getCartesTapis().getLast().toString());
			}
		}
	}

	/**
	 * Cette méthode distribue les cartes à chaque joueurs et créé une pioche
	 */
	public void distribuerCarte() {
		ArrayList<Joueur> tabJoueur = this.getListJoueur();
		JeuDeCarte jdc = new JeuDeCarte();
		Pioche pio;

		// Mélange les cartes avant de les distribuer
		Collections.shuffle(jdc);

		for (int i = 0; i <= (tabJoueur.size() - 1); i++) {
			while (tabJoueur.get(i).getMain().getNbCarte() < 3) {
				tabJoueur.get(i).getMain().ajouterCarteMain(jdc.pop());
				tabJoueur
						.get(i)
						.getMain()
						.setNbCarte(tabJoueur.get(i).getMain().getNbCarte() + 1);
			}
			while (tabJoueur.get(i).getCarteCachee().getNbCarte() < 3) {
				tabJoueur.get(i).getCarteCachee().ajouterCarteCachee(jdc.pop());
				tabJoueur
						.get(i)
						.getCarteCachee()
						.setNbCarte(
								tabJoueur.get(i).getCarteCachee().getNbCarte() + 1);
			}
			while (tabJoueur.get(i).getCarteVisible().getNbCarte() < 3) {
				tabJoueur.get(i).getCarteVisible()
						.ajouterCarteVisible(jdc.pop());
				tabJoueur
						.get(i)
						.getCarteVisible()
						.setNbCarte(
								tabJoueur.get(i).getCarteVisible().getNbCarte() + 1);
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

	public boolean verifierCartePosable(Carte c) {
		if (c.getForce().ordinal() >= Partie.getInstance().getTapis()
				.getCartesTapis().getLast().getForce().ordinal()) {
			System.out.println("Awesome !!");
			return true;
		} else {
			return false;
		}

	}

	public void incrementerJoueurActif() {

	}

	// public boolean aGagne(){
	// if(this.getListJoueur().get(index).getMain().getCartesMain().isEmpty()){
	// System.out.println("Le joueur "+this.getListJoueur().get(i).toString()+" a gagné !");
	// return true;
	// }
	// System.exit(0);
	// }

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

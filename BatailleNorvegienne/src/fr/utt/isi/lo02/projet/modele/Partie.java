package fr.utt.isi.lo02.projet.modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Observer;

import fr.utt.isi.lo02.projet.controleur.PartieControler;
import fr.utt.isi.lo02.projet.modele.Carte.FORCE;

import java.util.Observable;
/**
 * Classe principale de l'application 
 * Singleton Holder 
 * @author THOMAS
 *
 */
public class Partie extends Observable {

	private static Partie uniqueInstance;
	private ArrayList<Joueur> listJoueur;
	private ArrayList<Observer> listObserver = new ArrayList<Observer>();
	private Tapis tapis;
	private Pioche pioche;
	private int nbTour;
	private int nbJoueur =Joueur.choisirNbJoueur(); 
	private static PartieControler controler;

	private Partie() {
		this.listJoueur = listJoueur();
		JeuDeCarte jdcTapis = new JeuDeCarte(null);
		JeuDeCarte jdcPioche = new JeuDeCarte(null);
		this.tapis = new Tapis(0, jdcTapis);
		this.pioche = new Pioche(0, jdcPioche);
	}

	/**
	 * Holder de Partie 
	 * permet d'avoir un singleton qui s'instancie que lorsqu'il est appelé 
	 * @author THOMAS
	 *
	 */
	private static class PartieHolder{
			private final static Partie instance = new Partie();
	}
	
	/**
	 * Permet de créer une partie 
	 * @return une partie 
	 */
	public static Partie getInstance(){
		return PartieHolder.instance;
	}
	
	/**
	 * Créer un tableau de Joueur en fonction du nombre de joueur
	 * @return un tableau de joueur
	 */
	public ArrayList<Joueur> listJoueur() {
		ArrayList<Joueur> tabJoueur = new ArrayList<>();
		JeuDeCarte jdcMain = new JeuDeCarte(null); 
		JeuDeCarte jdcCC = new JeuDeCarte(null); 
		JeuDeCarte jdcCV = new JeuDeCarte(null); 
		Main m =new Main(0, jdcMain);
		CarteCachee cc = new CarteCachee(0, jdcCC);
		CarteVisible cv = new CarteVisible(0, jdcCV);
		Joueur j = new JoueurReel(0, m, cc, cv);
		tabJoueur.add(j);
		for (int i = 1; i < this.nbJoueur; i++) {
			JeuDeCarte jdcMain1 = new JeuDeCarte(null); 
			JeuDeCarte jdcCC1 = new JeuDeCarte(null); 
			JeuDeCarte jdcCV1 = new JeuDeCarte(null); 
			Main m1 =new Main(0, jdcMain1);
			CarteCachee cc1 = new CarteCachee(0, jdcCC1);
			CarteVisible cv1 = new CarteVisible(0, jdcCV1); 
			JoueurVirtuel v = new JoueurVirtuel(0, m1, cc1, cv1);
			tabJoueur.add(v);
		}
		return tabJoueur;
	}
	
	
	public void jouer() {
		
		/**
		 * Distribue les cartes en début de partie
		 */
		Partie.getInstance().distribuerCarte();

		while (!Partie.getInstance().getPioche().getCartesDeLaPioche()
				.isEmpty()) {
			for (int i = 0; i < Partie.getInstance().getListJoueur().size(); i++) {

				/**
				 * Affiche les cartes de la main
				 */
				System.out.println(Partie.getInstance().getListJoueur().get(i)
						.getMain().getCartesMain().toString());

				if (Partie.getInstance().getListJoueur().get(i) instanceof JoueurVirtuel) {
					Partie.getInstance().getListJoueur().get(i).getStrategy()
							.choisirCarteStrategie(i);
				} else {

					/**
					 * Choisit une carte // pose la carte sur le tapis
					 * Vérification que la carte est posable
					 */
					boolean jouable = true;
					if (jouable == true) {
						Carte carte = Partie.getInstance().getListJoueur()
								.get(i).choisirCarteMain();
						if (carte.estSpeciale()) {
							carte.actionCarteSpeciale(carte, i);
						}
						if (Partie.getInstance().getTapis().getCartesTapis()
								.isEmpty()) {
							Partie.getInstance().getTapis()
									.ajouterCarteTapis(carte);
							Partie.getInstance().getListJoueur().get(i)
									.getMain().getCartesMain().remove(carte);
						} else {
							if (Partie.getInstance()
									.verifierCartePosablePositif(carte)) {
								Partie.getInstance().getTapis()
										.ajouterCarteTapis(carte);
								Partie.getInstance().getListJoueur().get(i)
										.getMain().getCartesMain()
										.remove(carte);
							} else {
								Carte carte2 = carte;
								int compteur = 0;
								while (Partie.getInstance()
										.verifierCartePosablePositif(carte2) == false
										&& compteur <= Partie.getInstance()
												.getListJoueur().get(i)
												.getMain().getNbCarte()) {
									System.out
											.println("Choisissez une autre carte, voici les cartes de votre main :\n"
													+ Partie.getInstance()
															.getListJoueur()
															.get(i).getMain()
															.getCartesMain()
															.toString());
									carte2 = Partie.getInstance()
											.getListJoueur().get(i)
											.choisirCarteMain();
									compteur++;
								}
								if (compteur == Partie.getInstance()
										.getListJoueur().get(i).getMain()
										.getNbCarte()) {
									// Méthode pour dire que le tour est finit
									Partie.getInstance().getTapis().cocogne(i);
									jouable = false;
								}
								if (Partie.getInstance()
										.verifierCartePosablePositif(carte2)) {
									Partie.getInstance().getTapis()
											.ajouterCarteTapis(carte2);
									Partie.getInstance().getListJoueur().get(i)
											.getMain().getCartesMain()
											.remove(carte2);
								}
							}
						}
					}
				}

				/**
				 * Pioche une carte et la met dans la main En commentaire : la
				 * partie qui permet de remplir si on pose plusieurs cartes et
				 * du coup qu'il faut en piocher plusieurs
				 */
				if (Partie.getInstance().getListJoueur().get(i).getMain()
						.getNbCarte() <= 3) {
					Partie.getInstance()
							.getListJoueur()
							.get(i)
							.getMain()
							.ajouterCarteMain(
									Partie.getInstance().getPioche()
											.prendreCarteDuDessus());
				}

				/**
				 * Afficher la dernière carte du tapis (celle du dessus)
				 */
				System.out
						.println("Fin du tour \nAffichage de la carte au dessus du tas "
								+ Partie.getInstance().getTapis()
										.getCartesTapis().getLast().toString());

				Partie.getInstance().aGagne(i);
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

	/**
	 * Incrémnte la partie d'un tour 
	 */
	public void incrementerTour() {
		nbTour++;
	}

	/**
	 * Vérifie si la carte que l'on veut poser est supérieur à la dernière du tapis
	 * @param une carte 
	 * @return true si la carte est posable
	 */
	public boolean verifierCartePosablePositif(Carte c) {
		if (c.getForce().ordinal() >= Partie.getInstance().getTapis()
				.getCartesTapis().getLast().getForce().ordinal()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Vérifie si la carte que l'on veut poser est inférieur à la dernière du tapis
	 * @param une carte 
	 * @return true si la carte est posable
	 */
	public boolean verifierCartePosableNegatif(Carte c) {
		if (c.getForce().ordinal() <= FORCE.sept.ordinal()) {
			System.out
					.println("Vous venez de jouer une carte inférieur ou égal à 7");
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Vérifie si un joueur a gagné 
	 * @param l'index d'un joueur 
	 */
	public void aGagne(int i) {
		if (this.getListJoueur().get(i).getMain().getCartesMain().isEmpty()
				&& this.getPioche().getCartesDeLaPioche().isEmpty()) {
			System.out.println("Le joueur "
					+ this.getListJoueur().get(i).toString() + " a gagné !");
			System.exit(0);
		}

	}

	public int getNbListJoueur() {
		return listJoueur.size();
	}

	public ArrayList<Joueur> getListJoueur() {
		return listJoueur;
	}

	public void setListJoueur(ArrayList<Joueur> listJoueur) {
		this.listJoueur = listJoueur;
		setChanged();
		notifyObservers();
	}

	public int getNbJoueur(){
		return nbJoueur;
	}
	
	public void setNbJoueur(int i){
		this.nbJoueur = i; 
		setChanged();
		notifyObservers();
	}
	public int getNbTour() {
		return nbTour;
	}

	public void setNbTour(int nbTour) {
		this.nbTour = nbTour;
		setChanged();
		notifyObservers();
	}

	public Tapis getTapis() {
		return tapis;
	}

	public void setTapis(Tapis tapis) {
		this.tapis = tapis;
		setChanged();
		notifyObservers();
	}

	public Pioche getPioche() {
		return pioche;
	}

	public void setPioche(Pioche pioche) {
		this.pioche = pioche;
		setChanged();
		notifyObservers();
	}

	/**
	 * Implémentation du design patter Observer/Observable 
	 * Permet d'ajouter un observer 
	 */
	public void addObserver(Observer obs) {
		this.listObserver.add(obs);
	}

	/**
	 * Notifie un changement aux observers 
	 * @param un texte 
	 */
	public void notifyObserver(String str) {
		if (str.matches("^0[0-9]+"))
			str = str.substring(1, str.length());

		for (Observer obs : listObserver)
			obs.update(null, str);
	}

	/**
	 * Permet de supprimer un observer 
	 */
	public void removeObserver() {
		listObserver = new ArrayList<Observer>();
	}
	

}

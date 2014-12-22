package fr.utt.isi.lo02.projet.modele;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public abstract class AbstractPartie extends Observable {

	protected Tapis tapis;
	protected Pioche pioche;
	protected int nbTour;
	private ArrayList<Observer> listObserver = new ArrayList<Observer>();

	public abstract void jouer();

	public abstract void distribuerCarte();

	public abstract void incrementerTour();

	public abstract boolean verifierCartePosablePositif(Carte c);

	public abstract boolean verifierCartePosableNegatif(Carte c);

	public abstract void aGagne(int i);

	public abstract int getNbJoueur();

	public abstract ArrayList<Joueur> getListJoueur();

	public abstract void setListJoueur(ArrayList<Joueur> listJoueur);

	public abstract int getNbTour();

	public abstract void setNbTour(int nbTour);

	public abstract Tapis getTapis();

	public abstract void setTapis(Tapis tapis);

	public abstract Pioche getPioche();

	public abstract void setPioche(Pioche pioche);

	// Implémentation du pattern observer
	public void addObserver(Observer obs) {
		this.listObserver.add(obs);
	}

	public void notifyObserver(String str) {
		if (str.matches("^0[0-9]+"))
			str = str.substring(1, str.length());

		for (Observer obs : listObserver)
			obs.update(null, str);
	}

	public void removeObserver() {
		listObserver = new ArrayList<Observer>();
	}

}

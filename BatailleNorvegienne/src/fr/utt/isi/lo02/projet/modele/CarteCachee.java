package fr.utt.isi.lo02.projet.modele;

public class CarteCachee extends ZoneDeJeu {
	private int nbCarte; 
	private JeuDeCarte cartesCachee; 
	
	public CarteCachee(int nbCarte, JeuDeCarte cartesCachee){
		super(nbCarte, cartesCachee);
	}

	public int getNbCarte() {
		return nbCarte;
	}

	public void setNbCarte(int nbCarte) {
		this.nbCarte = nbCarte;
	}

	public JeuDeCarte getCartesCachee() {
		return cartesCachee;
	}

	public void setCartesCachee(JeuDeCarte cartesCachee) {
		this.cartesCachee = cartesCachee;
	}

}

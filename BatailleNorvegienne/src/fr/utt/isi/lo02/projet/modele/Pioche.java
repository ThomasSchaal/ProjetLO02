package fr.utt.isi.lo02.projet.modele;

public class Pioche extends ZoneDeJeu{
	private int nbCartePioche;
	private JeuDeCarte cartesDeLaPioche; 
	
	public Pioche(int nbCartePioche, JeuDeCarte jeuCartePioche){ 
		super(nbCartePioche, jeuCartePioche);
	}
	
	public void ajouterCartePioche(Carte c){
		super.ajouterCarte(c);
	}

	public int getNbCartePioche() {
		return nbCartePioche;
	}

	public void setNbCartePioche(int nbCartePioche) {
		this.nbCartePioche = nbCartePioche;
	}

	public JeuDeCarte getCartesDeLaPioche() {
		return cartesDeLaPioche;
	}

	public void setCartesDeLaPioche(JeuDeCarte cartesDeLaPioche) {
		this.cartesDeLaPioche = cartesDeLaPioche;
	}
}

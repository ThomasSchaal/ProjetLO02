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
		return super.getNbCarte();
	}

	public void setNbCartePioche(int nbCartePioche) {
		super.setNbCarte(nbCartePioche);
	}

	public JeuDeCarte getCartesDeLaPioche() {
		return super.getJeuDeCarteMelange();
	}

	public void setCartesDeLaPioche(JeuDeCarte cartesDeLaPioche) {
		super.setJeuDeCarteMelange(cartesDeLaPioche);
	}
}

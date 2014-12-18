package fr.utt.isi.lo02.projet.modele;

public class CarteCachee extends ZoneDeJeu {
	private int nbCarte; 
	private JeuDeCarte cartesCachee; 
	
	public CarteCachee(int nbCarte, JeuDeCarte cartesCachee){
		super(nbCarte, cartesCachee);
	}

	public void afficherCarteCachee(Joueur j){
		j.getCarteCachee().toString();
	}
	
	public void ajouterCarteCachee(Carte c){
		super.ajouterCarte(c);
	}
	
	public void ajouterCarteCachee(JeuDeCarte jdc){
		super.ajouterCarte(jdc);
	}
	
	public int getNbCarte() {
		return super.getNbCarte();
	}

	public void setNbCarte(int nbCarte) {
		super.setNbCarte(nbCarte);
	}

	public JeuDeCarte getCartesCachee() {
		return super.getJeuDeCarteMelange();
	}

	public void setCartesCachee(JeuDeCarte cartesCachee) {
		super.setJeuDeCarteMelange(cartesCachee);
	}

}

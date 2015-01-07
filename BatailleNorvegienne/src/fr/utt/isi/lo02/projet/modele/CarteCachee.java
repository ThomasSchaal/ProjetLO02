package fr.utt.isi.lo02.projet.modele;

public class CarteCachee extends ZoneDeJeu {

	private int nbCarte; 
	private JeuDeCarte cartesCachee;
	
	
	public CarteCachee(int nbCarte, JeuDeCarte carteCachee) {
		super(nbCarte, carteCachee);
		// TODO Auto-generated constructor stub
	}
	
	public Carte prendreCarteCachee(){
		return getCartesCachee().pollFirst();
	}
	
	public void afficherCarteCachee(Joueur j){
		j.getCarteCachee().toString();
	}
	
	public void ajouterCarteCachee(Carte c) {
		// TODO Auto-generated method stub
		super.ajouterCarte(c);
	}
	public void ajouterCarteCachee(JeuDeCarte jdc) {
		// TODO Auto-generated method stub
		super.ajouterCarte(jdc);
	}
	
	@Override
	public int getNbCarte() {
		// TODO Auto-generated method stub
		return super.getNbCarte();
	}
	
	@Override
	public void setNbCarte(int nbCarte) {
		// TODO Auto-generated method stub
		super.setNbCarte(nbCarte);
	}
	
	public JeuDeCarte getCartesCachee(){
		return super.getJeuDeCarteMelange();
	}
	
	public void setCarteCachee(JeuDeCarte jdc){
		super.setJeuDeCarteMelange(jdc);
	} 
	
}


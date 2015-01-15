package fr.utt.isi.lo02.projet.modele;
/**
 * Zone de jeu qui contient les cartes cachées 
 * @author THOMAS
 *
 */
public class CarteCachee extends ZoneDeJeu {

	private int nbCarte; 
	private JeuDeCarte cartesCachee;
	
	
	public CarteCachee(int nbCarte, JeuDeCarte carteCachee) {
		super(nbCarte, carteCachee);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Permet de prendre une carte parmis les cartes cachées 
	 * donne la première carte 
	 * @return
	 */
	public Carte prendreCarteCachee(){
		return getCartesCachee().pollFirst();
	}
	
	/**
	 * Affiche les cartes cachées d'un joueur 
	 * @param un joueur 
	 */
	public void afficherCarteCachee(Joueur j){
		j.getCarteCachee().toString();
	}
	
	/**
	 * Permet d'ajouter une carte aux cartes cachées 
	 *@param la carte que l'on veut ajouter aux cartes cachées 
	 */
	public void ajouterCarteCachee(Carte c) {
		// TODO Auto-generated method stub
		super.ajouterCarte(c);
	}
	
	/**
	 * Permet d'ajouter une liste de cartes aux cartes cachées 
	 * @param une liste de cartes / un jeu de cartes 
	 */
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


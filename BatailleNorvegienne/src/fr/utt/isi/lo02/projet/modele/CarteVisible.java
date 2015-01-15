package fr.utt.isi.lo02.projet.modele;

/**
 * Classe qui contient la zone de jeu carte visible 
 * 
 * @author THOMAS
 *
 */
public class CarteVisible extends ZoneDeJeu {
	
	private int nbCarte; 
	private JeuDeCarte cartesVisible; 
	
	public CarteVisible(int nbCarte, JeuDeCarte cartesVisible){
		super(nbCarte, cartesVisible);
	}
	
	/**
	 * Permet de prendre la première carte visible 
	 * @return la première carte visible 
	 */
	public Carte prendreCarteVisible(){	
		return getCartesVisible().pollFirst();
	}
	
	/**
	 * Affiche les cartes visibles d'un joueur 
	 * @param un joueur
	 */
	public void afficherCarteVisible(Joueur j){
		j.getCarteVisible().toString();
	}
	
	/**
	 * Permet d'ajouter une carte aux cartes visibles 
	 * @param une carte 
	 */
	public void ajouterCarteVisible(Carte c){
		super.ajouterCarte(c);
	}
	
	/**
	 * Permet d'ajouter un jeu de cartes aux cartes visibles 
	 * @param jdc
	 */
	public void ajouterCarteVisible(JeuDeCarte jdc){
		super.ajouterCarte(jdc);
	}
	
	public int getNbCarteVisible(){
		return super.getNbCarte();
	}
	
	public void setNbCarteVisible(int i){
		super.setNbCarte(i);
	}
	
	public JeuDeCarte getCartesVisible(){
		return super.getJeuDeCarteMelange();
	}
	
	public void setCarteVisible(JeuDeCarte jdc){
		super.setJeuDeCarteMelange(jdc);
	}
}

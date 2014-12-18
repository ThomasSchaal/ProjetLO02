package fr.utt.isi.lo02.projet.modele;

public class CarteVisible extends ZoneDeJeu {
	
	private int nbCarte; 
	private JeuDeCarte cartesVisible; 
	
	public CarteVisible(int nbCarte, JeuDeCarte cartesVisible){
		super(nbCarte, cartesVisible);
	}
	
	public Carte prendreCarteVisible(){	
		return getCartesVisible().pollFirst();
	}
	
	public void afficherCarteVisible(Joueur j){
		j.getCarteVisible().toString();
	}
	
	public void ajouterCarteVisible(Carte c){
		super.ajouterCarte(c);
	}
	
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

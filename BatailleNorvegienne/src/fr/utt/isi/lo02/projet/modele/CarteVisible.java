package fr.utt.isi.lo02.projet.modele;

public class CarteVisible extends ZoneDeJeu {
	
	private int nbCarte; 
	private JeuDeCarte cartesVisible; 
	
	public CarteVisible(int nbCarte, JeuDeCarte cartesVisible){
		super(nbCarte, cartesVisible);
	}
}

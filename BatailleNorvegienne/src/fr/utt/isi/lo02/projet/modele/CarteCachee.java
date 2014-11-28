package fr.utt.isi.lo02.projet.modele;

public class CarteCachee extends ZoneDeJeu {
	private int nbCarte; 
	private JeuDeCarte cartesCachee; 
	
	public CarteCachee(int nbCarte, JeuDeCarte cartesCachee){
		super(nbCarte, cartesCachee);
	}

}

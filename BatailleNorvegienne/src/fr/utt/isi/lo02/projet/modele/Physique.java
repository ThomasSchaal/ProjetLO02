package fr.utt.isi.lo02.projet.modele;

public class Physique extends Joueur{
	
	private int idJoueur; 
	private Main main; 
	private CarteCachee carteCachee;
	private CarteVisible carteVisible;
	//private String nomJoueur; 
	
	public Physique(int idJoueur, Main main, CarteCachee carteCachee, CarteVisible carteVisible){
		super(idJoueur, main, carteCachee, carteVisible);
	}

}

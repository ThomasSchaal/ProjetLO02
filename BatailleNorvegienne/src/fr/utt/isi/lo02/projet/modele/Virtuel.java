package fr.utt.isi.lo02.projet.modele;

public class Virtuel extends Joueur {
	
	private int idJoueur;
	//private String nomJoueur; 
	private String difficulte; 
	
	public Virtuel(int idJoueur,Main main, CarteCachee carteCachee, CarteVisible carteVisible , String difficulte){
		super(idJoueur, main, carteCachee, carteVisible);
		this.difficulte=difficulte;
	}

	public void choixDifficulte(String niveau){
		
	}
}

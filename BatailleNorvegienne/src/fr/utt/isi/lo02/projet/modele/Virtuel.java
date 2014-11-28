package fr.utt.isi.lo02.projet.modele;

public class Virtuel extends Joueur {
	
	private int idJoueur;
	private String nomJoueur; 
	private String difficulte; 
	
	public Virtuel(int idJoueur, String nomJoueur, String difficulte){
		super(idJoueur, nomJoueur);
		this.difficulte=difficulte;
	}

	public void choixDifficulte(String niveau){
		
	}
}

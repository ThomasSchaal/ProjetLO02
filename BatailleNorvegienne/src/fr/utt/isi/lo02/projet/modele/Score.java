package fr.utt.isi.lo02.projet.modele;

public class Score {
	private int nbTour; 
	private String nomJoueur; 
	private Score tableauDeScore;
	
	public Score(int nbTour, String nomJoueur){
		this.nbTour=nbTour;
		this.nomJoueur=nomJoueur;
	}
	
	public int getNbTour() {
		return nbTour;
	}

	public void setNbTour(int nbTour) {
		this.nbTour = nbTour;
	}

	public String getNomJoueur() {
		return nomJoueur;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	public Score getTableauDeScore() {
		return tableauDeScore;
	}

	public void setTableauDeScore(Score tableauDeScore) {
		this.tableauDeScore = tableauDeScore;
	}

	public void enregistrerScore(){
		
	}
}

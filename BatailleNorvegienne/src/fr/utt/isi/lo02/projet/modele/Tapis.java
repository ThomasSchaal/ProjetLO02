package fr.utt.isi.lo02.projet.modele;

public class Tapis extends ZoneDeJeu {
	 private int nbCarte; 
	 private JeuDeCarte cartesTapis; 
	 
	 public Tapis(int nbCarte, JeuDeCarte cartesTapis){
		 super(nbCarte, cartesTapis);
	 }

	 public void ramasserLeTas(){
		 
	 }
	 
	 public int getNbCarte() {
		return nbCarte;
	}

	public void setNbCarte(int nbCarte) {
		this.nbCarte = nbCarte;
	}

	public JeuDeCarte getCartesTapis() {
		return cartesTapis;
	}

	public void setCartesTapis(JeuDeCarte cartesTapis) {
		this.cartesTapis = cartesTapis;
	}

	public void becher(){
		 
	 }
}

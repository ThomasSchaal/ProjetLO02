package fr.utt.isi.lo02.projet.modele;

public class Tapis extends ZoneDeJeu {
	 private int nbCarte; 
	 private JeuDeCarte cartesTapis; 
	 
	 public Tapis(int nbCarte, JeuDeCarte cartesTapis){
		 super(nbCarte, cartesTapis);
	 }

	 public void ramasserLeTas(){
		 
	 }
	 
	 public void ajouterCarteTapis(Carte c){
		 super.ajouterCarte(c);
	 }
	 
	 public int getNbCarte() {
		return super.getNbCarte();
	}

	public void setNbCarte(int nbCarte) {
		super.setNbCarte(nbCarte);
	}

	public JeuDeCarte getCartesTapis() {
		return super.getJeuDeCarteMelange();
	}

	public void setCartesTapis(JeuDeCarte cartesTapis) {
		super.setJeuDeCarteMelange(cartesTapis);
	}

	public void becher(){
		 
	 }
}

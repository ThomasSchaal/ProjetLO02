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
	 
	 public void ajouterCarteTapis(JeuDeCarte jdc){
		 super.ajouterCarte(jdc);
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

	public void cocogne(int joueurActuel){
		Carte c = Partie.getInstance().getTapis().getCartesTapis().getLast();
		Partie.getInstance().getListJoueur().get(joueurActuel).getMain().ajouterCarte(Partie.getInstance().getTapis().getCartesTapis());
		Partie.getInstance().getTapis().getCartesTapis().clear();
		Partie.getInstance().getTapis().ajouterCarte(c);
	 }
	
	public void becher(PartieSansSingleton p){
		Partie.getInstance().getTapis().getCartesTapis().clear();
	}
}

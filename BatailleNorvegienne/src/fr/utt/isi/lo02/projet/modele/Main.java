package fr.utt.isi.lo02.projet.modele;


public class Main extends ZoneDeJeu{
	
	private int nbCarte; 
	private JeuDeCarte cartesMain;
	
	public Main(int nbCarte, JeuDeCarte cartesMain){
		super(nbCarte, cartesMain);
	}

	public void afficherCarteMain(Joueur j){
		j.getMain().getCartesMain().toString();
	}
	
	public void ajouterCarteMain(Carte c){
		super.ajouterCarte(c);
	}
	
	public void ajouterCarteMain(JeuDeCarte jdc){
		super.ajouterCarte(jdc);
	}
	
	public int getNbCarte() {
		return super.getNbCarte();
	}

	public void setNbCarte(int nbCarte) {
		super.setNbCarte(nbCarte);
	}

	public JeuDeCarte getCartesMain() {
		return super.getJeuDeCarteMelange();
	}

	public void setCartesMain(JeuDeCarte cartesMain) {
		super.setJeuDeCarteMelange(cartesMain);
	}	
}

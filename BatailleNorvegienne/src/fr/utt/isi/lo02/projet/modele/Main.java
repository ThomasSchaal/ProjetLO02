package fr.utt.isi.lo02.projet.modele;

public class Main extends ZoneDeJeu{
	
	private int nbCarte; 
	private JeuDeCarte cartesMain;
	
	public Main(int nbCarte, JeuDeCarte cartesMain){
		super(nbCarte, cartesMain);
	}

	public void ajouterCarteMain(Carte c){
		super.ajouterCarte(c);
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

	public void choisirCarte(JeuDeCarte carte){
		
	}
	
	public void piocher(){
		
	}
}

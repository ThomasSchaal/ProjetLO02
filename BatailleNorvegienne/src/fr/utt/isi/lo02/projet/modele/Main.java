package fr.utt.isi.lo02.projet.modele;

public class Main extends ZoneDeJeu{
	
	private int nbCarte; 
	private JeuDeCarte cartesMain;
	
	public Main(int nbCarte, JeuDeCarte cartesMain){
		super(nbCarte, cartesMain);
	}

	public int getNbCarte() {
		return nbCarte;
	}

	public void setNbCarte(int nbCarte) {
		this.nbCarte = nbCarte;
	}

	public JeuDeCarte getCartesMain() {
		return cartesMain;
	}

	public void setCartesMain(JeuDeCarte cartesMain) {
		this.cartesMain = cartesMain;
	}

	public void choisirCarte(JeuDeCarte carte){
		
	}
	
	public void piocher(){
		
	}
}

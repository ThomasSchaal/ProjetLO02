package fr.utt.isi.lo02.projet.modele;

/**
 * Zone de jeu qui est la main d'un joueur 
 * @author THOMAS
 *
 */
public class Main extends ZoneDeJeu{
	
	private int nbCarte; 
	private JeuDeCarte cartesMain;
	
	public Main(int nbCarte, JeuDeCarte cartesMain){
		super(nbCarte, cartesMain);
	}

	/**
	 * Affiche les cartes de la main d'un joueur 
	 * @param un joueur 
	 */
	public void afficherCarteMain(Joueur j){
		j.getMain().getCartesMain().toString();
	}
	
	/**
	 * Permet d'ajouter une carte a la main
	 * @param une carte 
	 */
	public void ajouterCarteMain(Carte c){
		super.ajouterCarte(c);
	}
	
	/**
	 * Permet d'ajouter une liste de carte dans la main d'un joueur 
	 * @param une liste de carte 
	 */
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

package fr.utt.isi.lo02.projet.modele;

/**
 * Zone de jeu qui est la pioche 
 * @author THOMAS
 *
 */
public class Pioche extends ZoneDeJeu{
	private int nbCartePioche;
	private JeuDeCarte cartesDeLaPioche; 
	
	public Pioche(int nbCartePioche, JeuDeCarte jeuCartePioche){ 
		super(nbCartePioche, jeuCartePioche);
	}
	
	/**
	 * Permet de prendre la carte du dessus de la pioche 
	 * @return
	 */
	public Carte prendreCarteDuDessus(){	
		return getCartesDeLaPioche().pollFirst();
	}
	
	/**
	 * Vérifie si la pioche est vide 
	 * @param un jeu de carte 
	 * @return vrai si la pioche est vide 
	 */
	public boolean piocheVide(JeuDeCarte jdc){
		boolean estVide=false; 
		if (jdc.isEmpty()){
			estVide = true; 
		}
		return estVide;
	}
		
	/**
	 * Permet d'ajouter une carte à la pioche
	 * @param une carte 
	 */
	public void ajouterCartePioche(Carte c){
		super.ajouterCarte(c);
	}
	
	/**
	 * Permet d'ajouter une liste de carte à la pioche 
	 * Utiliser après avoir distribuer les cartes à tout les joueurs 
	 * @param un jeu de carte
	 */
	public void ajouterCartePioche(JeuDeCarte jdc){
		super.ajouterCarte(jdc);
	}

	public int getNbCartePioche() {
		return super.getNbCarte();
	}

	public void setNbCartePioche(int nbCartePioche) {
		super.setNbCarte(nbCartePioche);
	}

	public JeuDeCarte getCartesDeLaPioche() {
		return super.getJeuDeCarteMelange();
	}

	public void setCartesDeLaPioche(JeuDeCarte cartesDeLaPioche) {
		super.setJeuDeCarteMelange(cartesDeLaPioche);
	}
}

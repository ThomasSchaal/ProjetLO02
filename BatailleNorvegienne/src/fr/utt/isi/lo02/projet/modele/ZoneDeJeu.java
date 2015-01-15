package fr.utt.isi.lo02.projet.modele;
/**
 * Classe qui permet de créer les différentes zone de jeu 
 * Comme carte, n'est pas directement utiliser dans la partie
 * @author THOMAS
 *
 */
public class ZoneDeJeu {

	protected int nbCarte;
	private JeuDeCarte jeuDeCarteMelange;
	
	public ZoneDeJeu(int nbCarte, JeuDeCarte jeuDeCarteMelange){
		this.nbCarte=nbCarte;
		this.jeuDeCarteMelange=jeuDeCarteMelange;
	}
	
	/**
	 * Permet d'ajouter une carte a une zone de jeu 
	 * @param une carte 
	 */
	public void ajouterCarte(Carte c){
		this.getJeuDeCarteMelange().add(c);
	}
	
	/**
	 * Permet d'ajouter une liste de carte a une zone de jeu
	 * @param une liste de carte 
	 */
	public void ajouterCarte(JeuDeCarte jdc){
		this.getJeuDeCarteMelange().addAll(jdc);
	}
	
	public int getNbCarte(){
		return nbCarte; 
	}
	
	public void setNbCarte(int nbCarte){
		 this.nbCarte=nbCarte;
	}

	public JeuDeCarte getJeuDeCarteMelange() {
		return jeuDeCarteMelange;
	}

	public void setJeuDeCarteMelange(JeuDeCarte jeuDeCarteMelange) {
		this.jeuDeCarteMelange = jeuDeCarteMelange;
	}
}

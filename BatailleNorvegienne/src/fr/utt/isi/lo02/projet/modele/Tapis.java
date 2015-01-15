package fr.utt.isi.lo02.projet.modele;

/**
 * Zone de jeu qui contient le tapis 
 * @author THOMAS
 *
 */
public class Tapis extends ZoneDeJeu {
	 private int nbCarte; 
	 private JeuDeCarte cartesTapis; 
	 
	 public Tapis(int nbCarte, JeuDeCarte cartesTapis){
		 super(nbCarte, cartesTapis);
	 }
	 
	 /**
	  * Permet d'ajouter une carte au tapis 
	  * @param une carte 
	  */
	 public void ajouterCarteTapis(Carte c){
		 super.ajouterCarte(c);
	 }
	 
	 /**
	  * Permet d'ajouter une liste de carte au tapis
	  * @param une liste de carte 
	  */
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

	/**
	 * Donne le contenu du tas du tapis au joueur courant, garde toujours la carte supérieur du tas en référence 
	 * @param joueurActuel
	 */
	public void cocogne(int joueurActuel){
		Carte c = Partie.getInstance().getTapis().getCartesTapis().getLast();
		Partie.getInstance().getListJoueur().get(joueurActuel).getMain().ajouterCarte(Partie.getInstance().getTapis().getCartesTapis());
		Partie.getInstance().getTapis().getCartesTapis().clear();
		Partie.getInstance().getTapis().ajouterCarte(c);
	 }
	
	/**.
	 * Vide la liste de carte du tapis
	 */
	public void becher(){
		Partie.getInstance().getTapis().getCartesTapis().clear();
	}
}

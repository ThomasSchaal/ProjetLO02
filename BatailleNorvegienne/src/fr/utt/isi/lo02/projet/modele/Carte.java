package fr.utt.isi.lo02.projet.modele;

import java.util.Iterator;

import fr.utt.isi.lo02.projet.modele.Carte.FORCE;
/**
 * Classe qui crée les cartes 
 * Cette classe n'est pas utiliser directement par la classe principale Partie 
 * Cette classe est utilisé par JeuDeCarte pour créer un jeu de cartes 
 * @author THOMAS
 *
 */
public class Carte implements Comparable{

	protected int idCarte;

	private COULEUR couleurCarte;
	private FORCE force;
	
	/**
	 * Enum des couleurs pour les cartes, a de l'importance dans la création du jeu de cartes 
	 * @author THOMAS
	 *
	 */
	public enum COULEUR {
		Pique, Coeur, Carreau, Trefle;
	}

	/**
	 * Enum de la force de chaque carte, utile pour comparer deux cartes 
	 * @author THOMAS
	 *
	 */
	public enum FORCE {
		deux(2) , trois(3), quatre(4), cinq(5), six(6), sept(7), huit(8), neuf(9), dix(10), valet(11), dame(12), roi(13), as(14);
		private int value;
		
		private FORCE(int value){
			this.value =value;
		}
	};

	/**
	 * Constructeur d'une carte 
	 * @param idCarte
	 * @param couleurCarte
	 * @param force
	 */
	public Carte(int idCarte,  COULEUR couleurCarte,
			FORCE force) {
		this.idCarte = idCarte;
		this.couleurCarte = couleurCarte;
		this.force = force;
		
	}

	/**
	 * Méthode qui dit quelles cartes sont spéciales 
	 * @return un boolean, true si la carte est spéciale
	 */
	public boolean estSpeciale() {
		boolean resultat = false;
		switch (this.getForce()) {
		case deux:
			resultat = true;
			break;
		case sept:
			resultat = true;
			break;
		case huit:
			resultat = true;
			break;
		case dix:
			resultat = true;
			break;
		case as:
			resultat = true;
			break;
		default:
			resultat = false;
			break;
		}
		return resultat;
	}
	
	/**
	 * Méthode qui donne des actions aux cartes spéciales
	 * @param une carte 
	 * @param un index pour choisir un joueur ou avoir le joueur en cours 
	 */
	public void actionCarteSpeciale(Carte c, int i){
		switch(c.getForce()){
		case deux:
			break;
		case sept:
			actionSept(c);
			break;
		case huit:
			actionHuit();
			break;
		case dix:
			actionDix();
			break;
		case as:
			actionAs(Partie.getInstance().getListJoueur().get(Partie.getInstance().getListJoueur().get(i).choisirJoueur()));
			break;
		default:
			break;
		}
	}

	/**
	 * Méthode qui contient l'action de l'as 
	 * Envoie les cartes du tapis a un joueur 
	 * @param un joueur choisit 
	 */
	public static void actionAs(Joueur j){
		Partie.getInstance().getListJoueur().get(j.getIdJoueur()).getMain().ajouterCarte(Partie.getInstance().getTapis().getCartesTapis());
	}
	
	/**
	 * Métode qui contient l'acion du dix 
	 * Bèche le tapis (littéralement) 
	 */
	public static void actionDix(){
		Partie.getInstance().getTapis().becher();
	}
	
	/**
	 * Méthode qui contient l'action du huit
	 * Passe au joueur suivant 
	 */
	public static  void actionHuit(){
		Iterator<Joueur> it = Partie.getInstance().getListJoueur().iterator();
		it.next();
	}
	
	/**
	 * Contient l'acion du sept 
	 * Vérifie si une carte est inférieur a un sept
	 * @param un carte 
	 */
	public static void actionSept(Carte c){
		Partie.getInstance().verifierCartePosableNegatif(c);
	}
	
	public int getIdCarte() {
		return idCarte;
	}

	public void setIdCarte(int idCarte) {
		this.idCarte = idCarte;
	}

	
	public COULEUR getCouleurCarte() {
		return couleurCarte;
	}

	public void setCouleurCarte(COULEUR couleurCarte) {
		this.couleurCarte = couleurCarte;
	}

	public FORCE getForce() {
		return force;
	}

	public void setForce(FORCE force) {
		this.force = force;
	}

	@Override
	public String toString() {
		return "\nCarte [idCarte=" + idCarte  + ", couleurCarte="
				+ couleurCarte + ", force=" + force + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int valeur = -2; 
		if(((Carte) o).getForce().ordinal() > this.getForce().ordinal()) valeur = -1;
		if(((Carte) o).getForce().ordinal() == this.getForce().ordinal())  valeur = 0;
		if(((Carte) o ).getForce().ordinal() < this.getForce().ordinal()) valeur =  1;
		return valeur ;
	}


}

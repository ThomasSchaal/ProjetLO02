package fr.utt.isi.lo02.projet.modele;

import java.util.Iterator;

import fr.utt.isi.lo02.projet.modele.Carte.FORCE;

public class Carte {

	protected int idCarte;

	private COULEUR couleurCarte;
	private FORCE force;

	public enum COULEUR {
		Pique, Coeur, Carreau, Trefle;
	}

	public enum FORCE {
		deux(2) , trois(3), quatre(4), cinq(5), six(6), sept(7), huit(8), neuf(9), dix(10), valet(11), dame(12), roi(13), as(14);
		private int value;
		
		private FORCE(int value){
			this.value =value;
		}
	};


	public Carte(int idCarte,  COULEUR couleurCarte,
			FORCE force) {
		this.idCarte = idCarte;
		this.couleurCarte = couleurCarte;
		this.force = force;
		
	}

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
	
	public void actionCarteSpeciale(Carte c, int i){
		
		switch(c.getForce()){
		case deux:
			// TODO Action carte 2, annule un vérifier posable et se pose dans tout les cas 
			
			break;
		case sept:
			// TODO Action carte 7, créer un vérifier posable alternatif / fonctionne mais pas avec la bonne carte 
			actionSept(c); // faux, doit prendre la carte du joueur suivant et pas la carte spéciale
			break;
		case huit:
			// Fonctionne pas
			actionHuit();
			break;
		case dix:
			//Fonctionne 
			actionDix();
			break;
		case as:
			//Fonctionne
			actionAs(Partie.getInstance().getListJoueur().get(Partie.getInstance().getListJoueur().get(i).choisirJoueur()));
			break;
		default:
			break;
		}
	}
	
	public static void actionAs(Joueur j){
		Partie.getInstance().getListJoueur().get(j.getIdJoueur()).getMain().ajouterCarte(Partie.getInstance().getTapis().getCartesTapis());
	}
	
	public static void actionDix(){
		Partie.getInstance().getTapis().becher();
	}
	
	public static  void actionHuit(){
		Iterator<Joueur> it = Partie.getInstance().getListJoueur().iterator();
		it.next();
	}
	
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

}

package fr.utt.isi.lo02.projet.modele;

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

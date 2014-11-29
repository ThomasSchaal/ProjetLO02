package fr.utt.isi.lo02.projet.modele;

public class Carte {

	protected int idCarte;

	private COULEUR couleurCarte;
	private FORCE force;

	public enum COULEUR {
		Pique, Coeur, Carreau, Trefle;
	}

	public enum FORCE {
		deux, trois, quatre, cinq, six, sept, huit, neuf, dix, valet, dame, roi, as;
	}

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
		return "Carte [idCarte=" + idCarte  + ", couleurCarte="
				+ couleurCarte + ", force=" + force + "]";
	}

}

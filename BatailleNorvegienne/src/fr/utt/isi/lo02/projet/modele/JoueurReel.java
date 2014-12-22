package fr.utt.isi.lo02.projet.modele;

public class JoueurReel extends Joueur{

	public JoueurReel(int idJoueur, Main m, CarteCachee cc, CarteVisible cv) {
		super(idJoueur, m, cc, cv);
		// TODO Auto-generated constructor stub
	}
	
	public int getIdJoueur() {
		return super.getIdJoueur();
	}

	public void setIdJoueur(int idJoueur) {
		super.setIdJoueur(idJoueur);
	}

	public String getNomJoueur() {
		return super.getNomJoueur();
	}

	public void setNomJoueur(String nomJoueur) {
		super.setNomJoueur(nomJoueur);
	}

	public Main getMain() {
		return super.getMain();
	}

	public void setMain(Main main) {
		super.setMain(main);
	}

	public CarteCachee getCarteCachee() {
		return super.getCarteCachee();
	}

	public void setCarteCachee(CarteCachee carteCachee) {
		super.setCarteCachee(carteCachee);
	}

	public CarteVisible getCarteVisible() {
		return super.getCarteVisible();
	}

	public void setCarteVisible(CarteVisible carteVisible) {
		super.setCarteVisible(carteVisible);
	}

	@Override
	public String toString() {
		return "JoueurReel [getIdJoueur()=" + getIdJoueur()
				+ ", getNomJoueur()=" + getNomJoueur() + ", getMain()="
				+ getMain() + ", getCarteCachee()=" + getCarteCachee()
				+ ", getCarteVisible()=" + getCarteVisible() + "]";
	}

	@Override
	public IStrategie getStrategy() {
		// TODO Auto-generated method stub
		return null;
	}

}

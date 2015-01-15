package fr.utt.isi.lo02.projet.modele;

/**
 * Classe qui permet de créer un joueur virtuelle avec sa stratégie 
 * @author THOMAS
 *
 */
public class JoueurVirtuel extends Joueur {

	private IStrategie strategy;
	
	
	public JoueurVirtuel(int idJoueur,Main main, CarteCachee carteCachee, CarteVisible carteVisible){
		super(idJoueur, main, carteCachee, carteVisible);
		this.strategy= new EasyStrategy();
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

	/**
	 * Implémentation de la méthode abstraite de Joueur 
	 */
	public IStrategie getStrategy() {
		return strategy;
	}

	public void setStrategy(IStrategie strategy) {
		this.strategy = strategy;
	}

	@Override
	public String toString() {
		return "JoueurVirtuel ["+super.toString()+" strategy=" + strategy + "]";
	}
	
	public void choixDifficulte(){
		
	}
}

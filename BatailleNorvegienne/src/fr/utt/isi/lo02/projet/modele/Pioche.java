package fr.utt.isi.lo02.projet.modele;

public class Pioche extends ZoneDeJeu{
	private int nbCartePioche;
	private JeuDeCarte cartesDeLaPioche; 
	
	public Pioche(int nbCartePioche, JeuDeCarte jeuCartePioche){ 
		super(nbCartePioche, jeuCartePioche);
	}
	
	public Carte prendreCarteDuDessus(){	
		return getCartesDeLaPioche().pollFirst();
	}
	
	public boolean piocheVide(JeuDeCarte jdc){
		boolean estVide=false; 
		if (jdc.isEmpty()){
			estVide = true; 
		}
		return estVide;
	}
		
	public void ajouterCartePioche(Carte c){
		super.ajouterCarte(c);
	}
	
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

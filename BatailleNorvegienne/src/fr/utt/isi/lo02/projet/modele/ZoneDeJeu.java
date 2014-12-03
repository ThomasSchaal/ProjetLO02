package fr.utt.isi.lo02.projet.modele;

public class ZoneDeJeu {

	protected int nbCarte;
	private JeuDeCarte jeuDeCarteMelange;
	
	public ZoneDeJeu(int nbCarte, JeuDeCarte jeuDeCarteMelange){
		this.nbCarte=nbCarte;
		this.setJeuDeCarteMelange(jeuDeCarteMelange);
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

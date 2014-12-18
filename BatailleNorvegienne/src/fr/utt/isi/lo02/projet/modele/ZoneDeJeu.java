package fr.utt.isi.lo02.projet.modele;

public class ZoneDeJeu {

	protected int nbCarte;
	private JeuDeCarte jeuDeCarteMelange;
	
	public ZoneDeJeu(int nbCarte, JeuDeCarte jeuDeCarteMelange){
		this.nbCarte=nbCarte;
		this.jeuDeCarteMelange=jeuDeCarteMelange;
	}
	
	public void ajouterCarte(Carte c){
		this.getJeuDeCarteMelange().add(c);
	}
	
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

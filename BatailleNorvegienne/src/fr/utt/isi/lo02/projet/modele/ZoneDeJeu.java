package fr.utt.isi.lo02.projet.modele;

public class ZoneDeJeu {

	protected int nbCarte;
	private JeuDeCarte jeuDeCarteMelange;
	
	public ZoneDeJeu(int nbCarte, JeuDeCarte jeuDeCarteMelange){
		this.nbCarte=nbCarte;
		this.jeuDeCarteMelange=jeuDeCarteMelange;
	}
}

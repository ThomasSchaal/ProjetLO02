package fr.utt.isi.lo02.projet.modele;

import java.util.LinkedList;

public class Pioche extends ZoneDeJeu{
	private int nbCartePioche;
	private JeuDeCarte cartesDeLaPioche; 
	
	public Pioche(int nbCartePioche, JeuDeCarte jeuCartePioche){ 
		super(nbCartePioche, jeuCartePioche);
		
	}
}

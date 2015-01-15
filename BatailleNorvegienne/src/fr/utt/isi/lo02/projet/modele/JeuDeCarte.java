package fr.utt.isi.lo02.projet.modele;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import fr.utt.isi.lo02.projet.modele.Carte.COULEUR;
import fr.utt.isi.lo02.projet.modele.Carte.FORCE;
/**
 * Classe qui construit le jeu de carte 
 * JeuDeCarte est littéralement un liste de carte 
 * @author THOMAS
 *
 */
public class JeuDeCarte extends LinkedList<Carte> {

	/**
	 * Permet de creer un jeu de cartes 
	 */
	public JeuDeCarte() {
		int idCarte = 0;
		for (COULEUR c : COULEUR.values()) {
			for (FORCE f : FORCE.values()) {
				idCarte++;
				Carte carte = new Carte(idCarte, c, f);
				add(carte);
			}
		}
	}

	/**
	 * Permet de créer un jeu de cartes avec une liste de cartes données 
	 * @param une liste de cartes 
	 */
	public JeuDeCarte(LinkedList<Carte> jdc ){
		
	}
	
	/**
	 * Affiche un jeu de cartes complet 
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Carte c : this)
			sb.append(c + "\n");
		return sb.toString();
	}

	

	
}

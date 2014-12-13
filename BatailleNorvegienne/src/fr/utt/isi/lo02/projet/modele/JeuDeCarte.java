package fr.utt.isi.lo02.projet.modele;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import fr.utt.isi.lo02.projet.modele.Carte.COULEUR;
import fr.utt.isi.lo02.projet.modele.Carte.FORCE;

public class JeuDeCarte extends LinkedList<Carte> {

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
	
	public JeuDeCarte(LinkedList<Carte> jeuDeCarte){
		//this.jeuDeCarte=jeuDeCarte;
	}

	public void battreLeJeu() {
	//	Collections.shuffle(jeuDeCarte);
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Carte c : this)
			sb.append(c + "\n");
		return sb.toString();
	}

	

	
}

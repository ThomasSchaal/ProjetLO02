package fr.utt.isi.lo02.projet.modele;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import fr.utt.isi.lo02.projet.modele.Carte.COULEUR;
import fr.utt.isi.lo02.projet.modele.Carte.FORCE;

public class JeuDeCarte {
	private LinkedList<Carte> jeuDeCarte;

	public JeuDeCarte() {
		jeuDeCarte = new LinkedList<Carte>();
		int idCarte = 0;
		for (COULEUR c : COULEUR.values()) {
			for (FORCE f : FORCE.values()) {
				idCarte++;
				Carte carte = new Carte(idCarte, c, f);
				jeuDeCarte.add(carte);
			}
		}
	}

	public void battreLeJeu() {
		// shuffle it !
		Collections.shuffle(jeuDeCarte);
	}

	public void distribuerCarte(JeuDeCarte jdc) {
		/* ListIterator li = ((List<Carte>) jdc).listIterator();
		 
	      while(li.hasNext())
	        System.out.println(li.next());
		
		*/
	}

	@Override
	public String toString() {
		return "JeuDeCarte [jeuDeCarte=" + jeuDeCarte + "]";
	}

}

package fr.utt.isi.lo02.projet.modele;

import java.util.LinkedList;
import java.util.Collections;

import fr.utt.isi.lo02.projet.modele.Carte.COULEUR;
import fr.utt.isi.lo02.projet.modele.Carte.FORCE;


public class JeuDeCarte{
	private LinkedList<Carte> jeuDeCarte;
	private static int nbCartes = 52; // compter le nombre de composants d'un enum  
	
	public JeuDeCarte(){
		jeuDeCarte = new LinkedList<Carte>();
		
		//for(0->4)
		// for(2->as) instancier carte et ajouter carte au jeudecarte
		
		/*for(int i = 0 ; i <= nbCartes ; i++){
			for(COULEUR c : COULEUR.values()){
				for(FORCE f : FORCE.values()){
					Carte carte = new Carte(i, c, f);
					jeuDeCarte.add(carte);
				}
			}
		}*/
	}
	
	
	

	public void battreLeJeu(){
		// shuffle it ! 
		Collections.shuffle(jeuDeCarte);
	}
	
	public void distribuerCarte(){
		
	}
	
	public void echangerLesCartes(int idJoueur){
		
	}
	
	@Override
	public String toString() {
		return "JeuDeCarte [jeuDeCarte=" + jeuDeCarte + "]";
	}

}

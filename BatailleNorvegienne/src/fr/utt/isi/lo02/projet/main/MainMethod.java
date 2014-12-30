package fr.utt.isi.lo02.projet.main;

import fr.utt.isi.lo02.projet.controleur.AbstractControler;
import fr.utt.isi.lo02.projet.controleur.PartieControler;
import fr.utt.isi.lo02.projet.vue.VuePartie;

public class MainMethod {
	/**
	 * Méthode main pour l'ensemble de l'application 
	 * @param args
	 */
	public static void main(String[] args) {
		//Partie.getInstance().jouer();
		
		AbstractControler controler = new PartieControler();
		 VuePartie vue = new VuePartie(controler);
//		VuePartie vue = new VuePartie();
		//Partie.getInstance().addObserver(vue);
		
		
		
	}
}

package fr.utt.isi.lo02.projet.main;

import javax.swing.JFrame;

import fr.utt.isi.lo02.projet.controleur.AbstractControler;
import fr.utt.isi.lo02.projet.controleur.PartieControler;
import fr.utt.isi.lo02.projet.modele.Partie;
import fr.utt.isi.lo02.projet.vue.VuePartie;

public class MainMethod {

	public static void main(String[] args) {
		//Partie.getInstance().jouer();
		
		AbstractControler controler = new PartieControler();
		 VuePartie vue = new VuePartie(controler);
//		VuePartie vue = new VuePartie();
		//Partie.getInstance().addObserver(vue);
		
		
		
	}
}

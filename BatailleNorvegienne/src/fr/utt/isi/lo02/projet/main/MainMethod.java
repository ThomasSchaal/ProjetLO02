package fr.utt.isi.lo02.projet.main;

import fr.utt.isi.lo02.projet.controleur.PartieControler;
import fr.utt.isi.lo02.projet.modele.Partie;
import fr.utt.isi.lo02.projet.vue.VueJeuDeCarte;
import fr.utt.isi.lo02.projet.vue.VueJoueur;
import fr.utt.isi.lo02.projet.vue.VueNarrateur;
import fr.utt.isi.lo02.projet.vue.VuePartie;
import fr.utt.isi.lo02.projet.vue.VuePioche;
import fr.utt.isi.lo02.projet.vue.VueTapis;

public class MainMethod {
	
	/**
	 * Méthode main pour l'ensemble de l'application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Partie partie = Partie.getInstance();
		PartieControler controller = new PartieControler();

		VuePartie vuePartie = new VuePartie(controller);
		Partie.getInstance().addObserver(vuePartie);

		Partie.getInstance().addObserver(vuePartie.getVueJdc());

		Partie.getInstance().addObserver(vuePartie.getVueJoueur());

		Partie.getInstance().addObserver(vuePartie.getVueNar());

		Partie.getInstance().addObserver(vuePartie.getVuePioche());

		Partie.getInstance().addObserver(vuePartie.getVueTapis());

		controller.lancerPartie();
	}
}

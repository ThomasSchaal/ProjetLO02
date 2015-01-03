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
	 * @param args
	 */
	public static void main(String[] args) {
		//Partie partie = Partie.getInstance();
		PartieControler controler = new PartieControler();
		
		VuePartie vuePartie = new VuePartie(controler);
		Partie.getInstance().addObserver(vuePartie);
		VueTapis vueTapis = new VueTapis(controler);
		Partie.getInstance().addObserver(vueTapis);
		VueJeuDeCarte vueJdc = new VueJeuDeCarte(controler);
		Partie.getInstance().addObserver(vueJdc);
		VueJoueur vueJoueur = new VueJoueur(controler);
		Partie.getInstance().addObserver(vueJoueur);
		VueNarrateur vueNar = new VueNarrateur(controler);
		Partie.getInstance().addObserver(vueNar);
		VuePioche vuePioche = new VuePioche(controler);
		Partie.getInstance().addObserver(vuePioche);
		
	}
}

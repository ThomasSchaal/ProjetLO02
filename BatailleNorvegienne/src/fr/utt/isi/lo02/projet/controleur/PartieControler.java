package fr.utt.isi.lo02.projet.controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fr.utt.isi.lo02.projet.modele.Carte;
import fr.utt.isi.lo02.projet.modele.Partie;
import fr.utt.isi.lo02.projet.vue.VueJeuDeCarte;
import fr.utt.isi.lo02.projet.vue.VueJoueur;
import fr.utt.isi.lo02.projet.vue.VueNarrateur;
import fr.utt.isi.lo02.projet.vue.VuePartie;
import fr.utt.isi.lo02.projet.vue.VuePioche;
import fr.utt.isi.lo02.projet.vue.VueTapis;

public class PartieControler implements ActionListener{

	private Partie partie; 
	private VuePartie vuePartie; 
	private VueJeuDeCarte vueJdc; 
	private VueJoueur vueJoueur; 
	private VueNarrateur vueNar; 
	private VuePioche vuePioche; 
	private VueTapis vueTapis; 
	
	public PartieControler(Partie partie) {
		this.partie=partie; 
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Controler de la partie 
	 */
	public void demanderNbJoueur(){
		
	}

	public Partie getPartie(){
		return this.partie ; 
	}
	
	/** 
	 * Controler du tapis 
	 * @return la dernière carte du tapis 
	 */
	public int controlerGetCarteTapis(){
		return partie.getTapis().getCartesTapis().getFirst().getForce().ordinal();
	}
	
	/**
	 * Controler du Joueur 
	 * @return le nombre de joueur 
	 */
	public int controlerGetNbJoueur(){
		return partie.getNbJoueur();
	}
	
	public int controlerGetNbCarteJoueur(int position){
		return partie.getListJoueur().get(position).getMain().getNbCarte();
	}
	
	/** 
	 * Controler de la pioche 
	 * @return vrai si la pioche est vide 
	 */
	public boolean controlerPiocheVide(){
		if(partie.getPioche().getNbCartePioche()==0){
			return true;
		}
		else 
			return false; 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// vueGetNbJoueur(); 
		
		String s = e.getActionCommand();

		if (s.startsWith("OK")) {
			System.out.println(vueNar.vueGetNbJoueur()); 
		}
	}
}

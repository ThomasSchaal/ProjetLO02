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

	private Partie partie = Partie.getInstance(); 
	private VueJeuDeCarte vueJdc = new VueJeuDeCarte(this); 
	private VueJoueur vueJoueur = new VueJoueur(this); 
	private VueNarrateur vueNar = new VueNarrateur(this); 
	private VuePioche vuePioche = new VuePioche(this); 
	private VueTapis vueTapis = new VueTapis(this); 
	
//	public PartieControler(Partie partie) {
//		this.partie=partie ; //Partie.getInstance(); 	
//	}
	
	public void lancerPartie(){
	
	//	choisirNbJoueur(demanderNbJoueur());
	//	partie = Partie.getInstance();
		this.getPartie().jouer();
	}
	
	/**
	 * Controler de la partie 
	 * Marche pas 
	 * TODO envoyer l'info au model 
	 */
	public int demanderNbJoueur(){
		return vueNar.vueGetNbJoueur();
	}

	public Partie getPartie(){
		return this.partie ; 
	}
	
	public void choisirNbJoueur(int nbJoueur){
		System.out.println(this.partie.getNbJoueur());
		this.partie.setNbJoueur(nbJoueur);
	}
	
	/** 
	 * Controler du tapis 
	 * @return la dernière carte du tapis 
	 */
	public Carte controlerGetCarteTapis(){
		return this.partie.getTapis().getCartesTapis().getFirst();
	}
	
	public boolean controlerTapisVide(){
		if(this.partie.getTapis().getNbCarte()==0){
			return true;
		}
		else 
			return false; 
	}
	
	/**
	 * Controler du Joueur 
	 * @return le nombre de joueur 
	 */
	public int controlerGetNbJoueur(){
		return this.partie.getNbJoueur();
	}
	
	public int controlerGetNbCarteJoueur(int position){
		return this.partie.getListJoueur().get(position).getMain().getNbCarte();
	}
	
	/** 
	 * Controler de la pioche 
	 * @return vrai si la pioche est vide 
	 */
	public boolean controlerPiocheVide(){
		if(this.partie.getPioche().getNbCartePioche()==0){
			return true;
		}
		else 
			return false; 
	}
	
	/**
	 * Controler pour le jeudecarte
	 * 
	 */
	public Carte controlerGetCarteMainJoueurPrincipal(int i ){
		return this.partie.getListJoueur().get(0).getMain().getCartesMain().get(i); 
	}
	
	public int controlerGetNbCarteMainJoueurPrincipal(){
		return this.partie.getListJoueur().get(0).getMain().getNbCarte();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

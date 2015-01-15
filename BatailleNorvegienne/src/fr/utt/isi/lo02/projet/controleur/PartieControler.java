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
/*
 * Controler du modele MVC 
 * Classe qui fait l'intermédiaire entre le model et les vues 
 * @author THOMAS
 *
 */
public class PartieControler implements ActionListener{

	private Partie partie = Partie.getInstance(); 
	private VueJeuDeCarte vueJdc = new VueJeuDeCarte(this); 
	private VueJoueur vueJoueur = new VueJoueur(this); 
	private VueNarrateur vueNar = new VueNarrateur(this); 
	private VuePioche vuePioche = new VuePioche(this); 
	private VueTapis vueTapis = new VueTapis(this); 
	
	/**
	 * Methode qui lance une partie 
	 * utilise le singleton Partie et sa méthode jouer
	 */
	public void lancerPartie(){
		this.getPartie().jouer();
	}
	
	/**
	 * Methode qui récupère le nombre de joueur demander sur la vue narrateur
	 * @return le nombre de joueur
	 */
	public int demanderNbJoueur(){
		return vueNar.vueGetNbJoueur();
	}

	/**
	 * Methode qui permet de récuperer une partie en cours dans le controler 
	 * @return une partie
	 */
	public Partie getPartie(){
		return this.partie ; 
	}
	
	/**
	 * Methode qui est censé prendre le nombre de joueur choisit dans la vue narrateur et modifier le model en conséquence
	 * @param nbJoueur
	 */
	public void choisirNbJoueur(int nbJoueur){
		System.out.println(this.partie.getNbJoueur());
		this.partie.setNbJoueur(nbJoueur);
	}
	
	/** 
	 * Méthode qui récupère la dernière carte du tapis dans le model
	 * @return la dernière carte du tapis 
	 */
	public Carte controlerGetCarteTapis(){
		return this.partie.getTapis().getCartesTapis().getFirst();
	}
	
	/**
	 * Méthode qui vérifie si le tapis n'est pas vide 
	 * @return boolean true si le tapis est vide 
	 */
	public boolean controlerTapisVide(){
		if(this.partie.getTapis().getNbCarte()==0){
			return true;
		}
		else 
			return false; 
	}
	
	/**
	 *	Methode qui récupère le nombre de joueur dans le model 
	 * @return le nombre de joueur 
	 */
	public int controlerGetNbJoueur(){
		return this.partie.getNbJoueur();
	}
	
	/**
	 * Méthode qui récupère le nombre de carte d'un joueur 
	 * @param position dans la liste des joueurs 
	 * @return le nombre de carte du joueur demander 
	 */
	public int controlerGetNbCarteJoueur(int position){
		return this.partie.getListJoueur().get(position).getMain().getNbCarte();
	}
	
	/** 
	 * Méthode qui vérifie si la pioche est vide 
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
	 * Méthode qui récupère une carte dans la main du joueur physique 
	 * @return une carte de la main du joueur physique 
	 */
	public Carte controlerGetCarteMainJoueurPrincipal(int i ){
		return this.partie.getListJoueur().get(0).getMain().getCartesMain().get(i); 
	}
	
	/**
	 * Méthode qui récupère le nombre de carte dans la main du joueur physique 
	 * @return le nombre de carte du joueur physique 
	 */
	public int controlerGetNbCarteMainJoueurPrincipal(){
		return this.partie.getListJoueur().get(0).getMain().getNbCarte();
	}
	
	/**
	 * Methode associé à actionListener 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

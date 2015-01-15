package fr.utt.isi.lo02.projet.vue;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import fr.utt.isi.lo02.projet.controleur.PartieControler;

public class VuePartie extends JFrame implements Observer {

	private static final long serialVersionUID = 8412438911738266478L;

	private PartieControler controler;
	private VueJeuDeCarte vueJdc = new VueJeuDeCarte(this.controler);
	private VueJoueur vueJoueur = new VueJoueur(this.controler);
	private VuePioche vuePioche = new VuePioche(this.controler);
	private VueTapis vueTapis = new VueTapis(this.controler);
	private VueNarrateur vueNar  = new VueNarrateur(this.controler);

	/**
	 * Vue qui représente la partie en entier, elle contient les autres vues et intéragie avec le controller 
	 * @param controler
	 */
	public VuePartie(PartieControler controler) {
		this.controler = controler;
		vueJdc = new VueJeuDeCarte(this.controler);
		vueJoueur = new VueJoueur(controler);
		vuePioche = new VuePioche(controler);
		vueTapis = new VueTapis(controler);
		vueNar  = new VueNarrateur(controler);
		this.setTitle("Jeu de bataille norvégienne");
		this.setSize(1280, 768);
		this.setLocationRelativeTo(null);

		// Instanciation d'un objet JPanel
		JPanel pan = new JPanel();
		pan.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		// Contraintes communes 
		gbc.weightx=3;
		gbc.weighty=2;
		gbc.ipady = 384;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		// Contraintes pour le panel Joueur 
		gbc.gridx = 0;
		gbc.gridy = 0;
		pan.add(vueJoueur, gbc);
		
		// Contraintes pour le panel Tapis  
		gbc.gridx = 1;
		gbc.gridy = 0;
		pan.add(vueTapis, gbc);
		
		// Contraintes pour le panel Pioche 
		gbc.gridx = 2;
		gbc.gridy = 0;
		pan.add(vuePioche, gbc);
		
		// Contraintes pour le panel JeuDeCarte 
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth=2;
		pan.add(vueJdc, gbc);
		
		// Contraintes pour le panel Narrateur 
		gbc.gridx = 2;
		gbc.gridy = 1;
		pan.add(vueNar, gbc);
		
		this.setContentPane(pan);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public PartieControler getControler() {
		return controler;
	}

	public void setControler(PartieControler controler) {
		this.controler = controler;
	}

	public VueJeuDeCarte getVueJdc() {
		return vueJdc;
	}

	public void setVueJdc(VueJeuDeCarte vueJdc) {
		this.vueJdc = vueJdc;
	}

	public VueJoueur getVueJoueur() {
		return vueJoueur;
	}

	public void setVueJoueur(VueJoueur vueJoueur) {
		this.vueJoueur = vueJoueur;
	}

	public VuePioche getVuePioche() {
		return vuePioche;
	}

	public void setVuePioche(VuePioche vuePioche) {
		this.vuePioche = vuePioche;
	}

	public VueTapis getVueTapis() {
		return vueTapis;
	}

	public void setVueTapis(VueTapis vueTapis) {
		this.vueTapis = vueTapis;
	}

	public VueNarrateur getVueNar() {
		return vueNar;
	}

	public void setVueNar(VueNarrateur vueNar) {
		this.vueNar = vueNar;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}

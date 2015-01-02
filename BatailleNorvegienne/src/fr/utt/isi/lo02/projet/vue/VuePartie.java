package fr.utt.isi.lo02.projet.vue;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import fr.utt.isi.lo02.projet.controleur.PartieControler;

public class VuePartie extends JFrame implements Observer {

	private static final long serialVersionUID = 8412438911738266478L;

	private PartieControler controler;

	/**
	 * Vue qui représente la partie en entier, elle contient les autres vues et intéragie avec le controller 
	 * @param controler
	 */
	public VuePartie(PartieControler controler) {
		this.controler = controler;
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
		
		// Contraintes pour le panel Joueur NOIR
		gbc.gridx = 0;
		gbc.gridy = 0;
		pan.add(new VueJoueur(controler), gbc);
		
		// Contraintes pour le panel Tapis VERT 
		gbc.gridx = 1;
		gbc.gridy = 0;
		pan.add(new VueTapis(controler), gbc);
		
		// Contraintes pour le panel Pioche GRIS
		gbc.gridx = 2;
		gbc.gridy = 0;
		pan.add(new VuePioche(controler), gbc);
		
		// Contraintes pour le panel Carte BLEU 
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth=2;
		pan.add(new VueJeuDeCarte(controler), gbc);
		
		// Contraintes pour le panel Narrateur ORANGE 
		gbc.gridx = 2;
		gbc.gridy = 1;
		pan.add(new VueNarrateur(controler), gbc);
		
		this.setContentPane(pan);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Pas de this.pack au début, compacte la page au max et du coup ne l'affiche pas en entier 
		//this.pack();
		this.setVisible(true);

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}

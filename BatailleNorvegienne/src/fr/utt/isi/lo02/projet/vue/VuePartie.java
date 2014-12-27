package fr.utt.isi.lo02.projet.vue;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import fr.utt.isi.lo02.projet.controleur.AbstractControler;

public class VuePartie extends JFrame implements Observer {

	private static final long serialVersionUID = 8412438911738266478L;

	private AbstractControler controler;

	public VuePartie(AbstractControler controler) {
		this.controler = controler;
		this.setTitle("Ma premi�re fen�tre Java");
		this.setSize(1280, 768);
		this.setLocationRelativeTo(null);

		// Instanciation d'un objet JPanel
		JPanel pan = new JPanel();
		pan.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		// Contraintes communes 
		gbc.weightx=3;
		gbc.weighty=2;
		gbc.fill = GridBagConstraints.BOTH;
		
		// Contraintes pour le panel Joueur NOIR
		gbc.gridx = 0;
		gbc.gridy = 0;
		pan.add(new VueJoueur(), gbc);
		
		// Contraintes pour le panel Tapis VERT 
		gbc.gridx = 1;
		gbc.gridy = 0;
		pan.add(new VueTapis(), gbc);
		
		// Contraintes pour le panel Pioche GRIS
		gbc.gridx = 2;
		gbc.gridy = 0;
		pan.add(new VuePioche(), gbc);
		
		// Contraintes pour le panel Carte BLEU 
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth=2;
		pan.add(new VueCarte(), gbc);
		
		// Contraintes pour le panel Narrateur ORANGE 
		gbc.gridx = 2;
		gbc.gridy = 1;
		pan.add(new VueNarrateur(), gbc);
		
		this.setContentPane(pan);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Pas de this.pack au d�but, compacte la page au max et du coup ne l'affiche pas en entier 
		//this.pack();
		this.setVisible(true);

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

}

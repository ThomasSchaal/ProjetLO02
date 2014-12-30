package fr.utt.isi.lo02.projet.vue;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import fr.utt.isi.lo02.projet.modele.Carte;
import fr.utt.isi.lo02.projet.modele.Carte.COULEUR;
import fr.utt.isi.lo02.projet.modele.Carte.FORCE;

public class VueJeuDeCarte extends JPanel {
	/**
	 * Cette vue contient la main du joueur physique 
	 * Chaque cartes est modélisée par un bouton, le joueur clique sur le bouton de la carte qu'il a choisit 
	 */
	public VueJeuDeCarte() {
		this.setBackground(Color.CYAN);
		// Créer un bouton pour chaque carte avec la force de la carte et son id
		// for (int i = 0 ; i <= Partie.getInstance().getNbJoueur() ; i++){
		// Iterator<Carte> it =
		// Partie.getInstance().getListJoueur().get(i).getMain().getCartesMain().iterator();
		// JButton c1 = new JButton(String.valueOf(it.next().getForce()));
		// this.add(c1);
		// }

		Dimension dimCarte = new Dimension(250 ,340); 
		JPanel panelBoutons = new JPanel();
		
		ImageIcon img1 = new ImageIcon("C:/Users/THOMAS/Documents/GitHub/ProjetLO02/BatailleNorvegienne/src/Cartes/T1.png");//createImageIcon("C:/Users/THOMAS/Documents/GitHub/ProjetLO02/BatailleNorvegienne/src/Cartes/T1.png", "As de trèfle");
		JButton b1 = new JButton(img1);
		b1.setPreferredSize(dimCarte);
		panelBoutons.add(b1);
		
		// créer une méthode pour la génération de carte en fonction de ce qu'il y a dans la main 
		JButton b2 = new JButton("Deux de trefle");
		b2.setPreferredSize(dimCarte);
		panelBoutons.add(b2);
		
		JButton b3 = new JButton("Trois de trefle");
		b3.setPreferredSize(dimCarte);
		panelBoutons.add(b3);
		
		// JScrollPane permet d'avoir un curseur de navigation pour les boutons
		JScrollPane scrollPane = new JScrollPane(panelBoutons);
		scrollPane.setPreferredSize(new Dimension(700,370));
		this.add(scrollPane);
	}
	
	public void creerBoutonCarte(){
		/**
		 * Iterer les cartes de la main
		 * Créer un bouton en fonction de la force de la carte de la main 
		 * 
		 */
	}
	
}

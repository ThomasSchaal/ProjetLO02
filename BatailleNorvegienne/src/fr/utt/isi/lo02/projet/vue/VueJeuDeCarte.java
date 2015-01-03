package fr.utt.isi.lo02.projet.vue;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import fr.utt.isi.lo02.projet.controleur.PartieControler;
import fr.utt.isi.lo02.projet.modele.Carte;
import fr.utt.isi.lo02.projet.modele.Carte.COULEUR;
import fr.utt.isi.lo02.projet.modele.Carte.FORCE;

public class VueJeuDeCarte extends JPanel implements Observer{
	
	private PartieControler controler;

	/**
	 * Cette vue contient la main du joueur physique 
	 * Chaque cartes est modélisée par un bouton, le joueur clique sur le bouton de la carte qu'il a choisit 
	 */
	public VueJeuDeCarte(PartieControler controler) {
		this.controler = controler;
		this.setBackground(Color.CYAN);
		// Créer un bouton pour chaque carte avec la force de la carte et son id
		// for (int i = 0 ; i <= Partie.getInstance().getNbJoueur() ; i++){
		// Iterator<Carte> it =
		// Partie.getInstance().getListJoueur().get(i).getMain().getCartesMain().iterator();
		// JButton c1 = new JButton(String.valueOf(it.next().getForce()));
		// this.add(c1);
		// }
		
		Dimension dimCarte = new Dimension(250 ,320); 
		JPanel panelBoutons = new JPanel();
		
		for(int i = 0 ; i < controler.controlerGetNbCarteMainJoueurPrincipal() ; i++){
			JButton b = new JButton(controler.controlerGetCarteMainJoueurPrincipal(i).getForce()+" de  "+controler.controlerGetCarteMainJoueurPrincipal(i).getCouleurCarte());
			b.setPreferredSize(dimCarte);
			panelBoutons.add(b);		
		}
		
//		ImageIcon img1 = new ImageIcon("C:/Users/THOMAS/Documents/GitHub/ProjetLO02/BatailleNorvegienne/src/Cartes/T1.png");
//		JButton b1 = new JButton(img1);
//		b1.setPreferredSize(dimCarte);
//		panelBoutons.add(b1);
//		
//		// créer une méthode pour la génération de carte en fonction de ce qu'il y a dans la main 
//		JButton b2 = new JButton("Deux de trefle");
//		b2.setPreferredSize(dimCarte);
//		panelBoutons.add(b2);
//		
//		JButton b3 = new JButton("Trois de trefle");
//		b3.setPreferredSize(dimCarte);
//		panelBoutons.add(b3);
		
		// JScrollPane permet d'avoir un curseur de navigation
		JScrollPane scrollPane = new JScrollPane(panelBoutons);
		scrollPane.setPreferredSize(new Dimension(700,350));
		this.add(scrollPane);
	}
	
	public void creerBoutonCarte(){
		/**
		 * Iterer les cartes de la main
		 * Créer un bouton en fonction de la force de la carte de la main 
		 */
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
}

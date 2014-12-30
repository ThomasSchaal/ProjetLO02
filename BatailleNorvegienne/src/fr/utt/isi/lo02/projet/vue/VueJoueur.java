package fr.utt.isi.lo02.projet.vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VueJoueur extends JPanel {

	/**
	 * Vue qui représente une liste de tous les joueurs et le nombre de carte dans la main de chaque joueur
	 */
	public VueJoueur(){
		this.setBackground(Color.BLACK);
		
		Dimension dimLabel = new Dimension(150, 20);
		JPanel panelJoueur = new JPanel();
		panelJoueur.setPreferredSize(new Dimension(370, 350));
		panelJoueur.setLayout(new GridLayout(0,1));
		
		JLabel lblJ1 = new JLabel();
		lblJ1.setPreferredSize(dimLabel);
		lblJ1.setText("Joueur 1 : ");
		panelJoueur.add(lblJ1);
		
		JLabel lblJ2 = new JLabel();
		lblJ2.setMaximumSize(dimLabel);
		lblJ2.setText("Joueur 2 : ");
		panelJoueur.add(lblJ2);
		
		JLabel lblJ3 = new JLabel();
		lblJ3.setMaximumSize(dimLabel);
		lblJ3.setText("Joueur 3 : ");
		panelJoueur.add(lblJ3);
		
		JScrollPane scrollPane = new JScrollPane(panelJoueur);
		this.add(scrollPane);

	}
}

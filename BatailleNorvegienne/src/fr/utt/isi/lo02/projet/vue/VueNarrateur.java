package fr.utt.isi.lo02.projet.vue;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VueNarrateur extends JPanel{
	
	/**
	 * Vue qui représente les différents affichage texte du jeu, comme "Vous avez gagné" ou "Piochez svp"
	 */
	public VueNarrateur(){
		this.setBackground(Color.ORANGE);
		
		JPanel panelNarrateur = new JPanel(); 
		panelNarrateur.setPreferredSize(new Dimension(300, 340));
		JLabel lblText = new JLabel();
		lblText.setText("Vous avez gagné !");
		panelNarrateur.add(lblText);
		
		JScrollPane scrollPane = new JScrollPane(panelNarrateur);
		
		this.add(scrollPane);
	}

}

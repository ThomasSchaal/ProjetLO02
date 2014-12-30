package fr.utt.isi.lo02.projet.vue;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VueNarrateur extends JPanel{
	
	/**
	 * Vue qui repr�sente les diff�rents affichage texte du jeu, comme "Vous avez gagn�" ou "Piochez svp"
	 */
	public VueNarrateur(){
		this.setBackground(Color.ORANGE);
		
		JPanel panelNarrateur = new JPanel(); 
		panelNarrateur.setPreferredSize(new Dimension(300, 340));
		JLabel lblText = new JLabel();
		lblText.setText("Vous avez gagn� !");
		panelNarrateur.add(lblText);
		
		JScrollPane scrollPane = new JScrollPane(panelNarrateur);
		
		this.add(scrollPane);
	}

}

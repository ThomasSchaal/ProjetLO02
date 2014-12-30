package fr.utt.isi.lo02.projet.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VuePioche extends JPanel {

	/**
	 * Vue qui représente la pioche, la vue doit changer quand la pioche est vide
	 * On peut cliquer sur le bouton de la pioche pour piocher des cartes 
	 */
	public VuePioche(){
		this.setBackground(Color.DARK_GRAY);
		
//		this.setLayout(new BorderLayout());
//		
//		JLabel lblPioche = new JLabel();
//		lblPioche.setText("Pioche :");
//		this.add(lblPioche, BorderLayout.CENTER);
		
		JButton btnPioche = new JButton("PIOCHE");
		btnPioche.setPreferredSize(new Dimension(200,340));
		this.add(btnPioche);
		
	}
}

package fr.utt.isi.lo02.projet.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueTapis extends JPanel{

	/**
	 * Cette vue représente la dernière carte qui a été posée sur le tapis 
	 */
	public VueTapis(){
		this.setBackground(Color.GREEN);
		
		this.setLayout(new BorderLayout());
		
		JLabel lblCarte = new JLabel();
		lblCarte.setText("Carte");

		lblCarte.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
		lblCarte.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.BLACK));
		lblCarte.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		lblCarte.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
		
		lblCarte.setPreferredSize(new Dimension(100, 100));
		this.add(lblCarte, BorderLayout.CENTER); 
	}
	
}

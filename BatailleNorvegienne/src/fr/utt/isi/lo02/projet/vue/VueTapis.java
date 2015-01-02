package fr.utt.isi.lo02.projet.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.utt.isi.lo02.projet.controleur.PartieControler;

public class VueTapis extends JPanel implements Observer{

	private PartieControler controler;
	/**
	 * Cette vue repr�sente la derni�re carte qui a �t� pos�e sur le tapis 
	 */
	public VueTapis(PartieControler controler){
		this.controler = controler;
		this.setBackground(Color.GREEN);
		
		this.setLayout(new BorderLayout());
		
		JLabel lblCarte = new JLabel();
		// d'abord lancer une partie 
	//	lblCarte.setText("Carte tapis :" + controler.controlerGetCarteTapis());

//		lblCarte.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
//		lblCarte.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.BLACK));
//		lblCarte.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
//		lblCarte.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
		
		lblCarte.setPreferredSize(new Dimension(100, 100));
		this.add(lblCarte, BorderLayout.CENTER); 
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
}

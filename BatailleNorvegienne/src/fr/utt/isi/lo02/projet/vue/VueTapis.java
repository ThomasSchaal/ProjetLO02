package fr.utt.isi.lo02.projet.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.utt.isi.lo02.projet.controleur.PartieControler;

public class VueTapis extends JPanel implements Observer{

	private PartieControler controler;
	private JLabel lblCarte ; 
	
	/**
	 * Cette vue représente la dernière carte qui a été posée sur le tapis 
	 */
	public VueTapis(PartieControler controler){
		this.controler = controler;
		this.setBackground(Color.LIGHT_GRAY);
		
		this.setLayout(new BorderLayout());
		lblCarte = new JLabel();

//		if(controler.controlerTapisVide() == true){
//			lblCarte.setText("Le tapis est vide ");
//		}else {
//			lblCarte.setText(controler.controlerGetCarteTapis().getForce()+" de "+controler.controlerGetCarteTapis().getCouleurCarte());
//		}
		
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
		if(this.controler.controlerTapisVide() == true){
			lblCarte.setText("Le tapis est vide ");
		}else {
			lblCarte.setText(controler.controlerGetCarteTapis().getForce()+" de "+this.controler.controlerGetCarteTapis().getCouleurCarte());
		}
	}
	
}

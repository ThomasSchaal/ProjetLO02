package fr.utt.isi.lo02.projet.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.utt.isi.lo02.projet.controleur.PartieControler;

public class VuePioche extends JPanel implements Observer {

	private PartieControler controler;
	private Dimension dimPioche = new Dimension(200,340);
	/**
	 * Vue qui représente la pioche, la vue doit changer quand la pioche est vide
	 * On peut cliquer sur le bouton de la pioche pour piocher des cartes 
	 */
	public VuePioche(PartieControler controler){
		this.controler = controler;
		this.setBackground(Color.LIGHT_GRAY);
		
		
//		this.setLayout(new BorderLayout());
//		
		JLabel lblPioche = new JLabel();
		lblPioche.setText("Pioche :");
		this.add(lblPioche, BorderLayout.CENTER);
		
//		if(controler.controlerPiocheVide() == true){
//			JLabel lblVide = new JLabel();
//			lblVide.setText("La pioche est vide " );
//			lblVide.setPreferredSize(dimPioche);
//			this.add(lblVide);
//		}else {
//			JButton btnPioche = new JButton("PIOCHE");
//			btnPioche.setPreferredSize(dimPioche);
//			this.add(btnPioche);
//		}
		
		
		
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(controler.controlerPiocheVide() == true){
			JLabel lblVide = new JLabel();
			lblVide.setText("La pioche est vide " );
			lblVide.setPreferredSize(dimPioche);
			this.add(lblVide);
		}else {
			JButton btnPioche = new JButton("PIOCHE");
			btnPioche.setPreferredSize(dimPioche);
			this.add(btnPioche);
		}
	}
}

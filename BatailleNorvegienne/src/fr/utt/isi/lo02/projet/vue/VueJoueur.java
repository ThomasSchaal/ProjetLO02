package fr.utt.isi.lo02.projet.vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import fr.utt.isi.lo02.projet.controleur.PartieControler;

public class VueJoueur extends JPanel implements Observer {

	private PartieControler controler;
	/**
	 * Vue qui représente une liste de tous les joueurs et le nombre de carte dans la main de chaque joueur
	 */
	public VueJoueur(PartieControler controler){
		this.controler = controler;
		this.setBackground(Color.LIGHT_GRAY);
		
		Dimension dimLabel = new Dimension(150, 20);
		JPanel panelJoueur = new JPanel();
		panelJoueur.setPreferredSize(new Dimension(370, 350));
		panelJoueur.setLayout(new GridLayout(0,1));
		
		
		for(int i = 0 ; i < this.controler.controlerGetNbJoueur() ; i ++ ){
			JLabel lbl = new JLabel(); 
			lbl.setPreferredSize(dimLabel);
			lbl.setText("Joueur "+i+ " : "+ this.controler.controlerGetNbCarteJoueur(i));
			panelJoueur.add(lbl);
		}

		
		JScrollPane scrollPane = new JScrollPane(panelJoueur);
		this.add(scrollPane);

	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}

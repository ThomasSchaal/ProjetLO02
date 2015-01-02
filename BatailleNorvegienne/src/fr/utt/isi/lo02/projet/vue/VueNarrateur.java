package fr.utt.isi.lo02.projet.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import fr.utt.isi.lo02.projet.controleur.PartieControler;

public class VueNarrateur extends JPanel implements Observer{
	
	private PartieControler controler;
	private int nbJoueur = 0 ; 
	
	/**
	 * Vue qui représente les différents affichage texte du jeu, comme "Vous avez gagné" ou "Piochez svp"
	 */
	public VueNarrateur(PartieControler controler){
		this.controler = controler;
		this.setBackground(Color.ORANGE);
		
		this.setLayout(new BorderLayout());
		
		JPanel panelNarrateur = new JPanel(); 
		panelNarrateur.setPreferredSize(new Dimension(300, 340));
		JLabel lblText = new JLabel();
		lblText.setText("Vous avez gagné !");
		panelNarrateur.add(lblText);
		JScrollPane scrollPane = new JScrollPane(panelNarrateur);
		
		JPanel panelJoueur = new JPanel();
		JTextField text = new JTextField();
		text.setPreferredSize(new Dimension(200,30));
		JButton bOk = new JButton("OK");
		bOk.setPreferredSize(new Dimension(55,30));
		bOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				nbJoueur = Integer.parseInt(text.getText());
			}
		});
		panelJoueur.add(text);
		panelJoueur.add(bOk);
		
		
		
		this.add(scrollPane, BorderLayout.CENTER);
		this.add(panelJoueur, BorderLayout.SOUTH);
	}
	
	public int vueGetNbJoueur(){
		return nbJoueur;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}

package fr.utt.isi.lo02.projet.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.sound.midi.ControllerEventListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import fr.utt.isi.lo02.projet.controleur.PartieControler;

public class VueNarrateur extends JPanel implements Observer{
	
	private PartieControler controler;
	private JButton bOk; 
	private JLabel lblText;
	private JTextField text; 
	
	/**
	 * Vue qui représente les différents affichage texte du jeu, comme "Vous avez gagné" ou "Piochez svp"
	 */
	public VueNarrateur(PartieControler controler){
		this.controler = controler;
		this.setBackground(Color.ORANGE);
		
		this.setLayout(new BorderLayout());
		
		JPanel panelNarrateur = new JPanel(); 
		panelNarrateur.setPreferredSize(new Dimension(300, 340));
		lblText = new JLabel();
		lblText.setText("Entrez un nombre de joueur entre 2 et 10 !");
		panelNarrateur.add(lblText);
		JScrollPane scrollPane = new JScrollPane(panelNarrateur);
		JPanel panelJoueur = new JPanel();
		text = new JTextField();
		text.setPreferredSize(new Dimension(200,30));
		bOk = new JButton("OK");
		bOk.setPreferredSize(new Dimension(55,30));
		// bOk.addActionListener(controler);
		panelJoueur.add(text);
		panelJoueur.add(bOk);
		
		this.add(scrollPane, BorderLayout.CENTER);
		this.add(panelJoueur, BorderLayout.SOUTH);
		
		/**
		 * D'abord mettre tout dans la vue avant de faire le actionlistener
		 */
		bOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String s = e.getActionCommand();
				if (s.equals("OK")) { 
						setLblTextNbJoueur();
				}
			}	
		});

		
	}
	
	public int vueGetNbJoueur(){
		return Integer.parseInt(text.getText().trim());
	}
	
	public void setLblTextNbJoueur(){
		this.lblText.setText("Vous avez demandé "+this.vueGetNbJoueur()+" joueurs");
	} 
	
//	public Long vueGetNbJoueur(){
//		return Long.parseLong(text.getText().trim());
//	}
	
	public JButton getBOk(){
		return this.bOk;
	}
	
	public JLabel getLblText(){
		return this.lblText;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		arg = Integer.parseInt(text.getText().trim());
	}

}

package fr.utt.isi.lo02.projet.vue;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import fr.utt.isi.lo02.projet.controleur.PartieControler;
import fr.utt.isi.lo02.projet.modele.Carte;
import fr.utt.isi.lo02.projet.modele.Carte.COULEUR;
import fr.utt.isi.lo02.projet.modele.Carte.FORCE;
/**
 * Classe qui contient le panel jeu de carte 
 * @author THOMAS
 *
 */
public class VueJeuDeCarte extends JPanel implements Observer{
	
	private static final long serialVersionUID = 8841553275060728682L;
	private PartieControler controler;
	private JPanel panelBoutons = new JPanel();
	private Dimension dimCarte = new Dimension(250 ,320); 

	/**
	 * Cette vue contient la main du joueur physique 
	 * Chaque cartes est modélisée par un bouton, le joueur clique sur le bouton de la carte qu'il a choisit 
	 */
	public VueJeuDeCarte(PartieControler controler) {
		this.controler = controler;
		this.setBackground(Color.LIGHT_GRAY);
		
		for(int i = 0 ; i < controler.controlerGetNbCarteMainJoueurPrincipal() ; i++){
			JButton b = new JButton(carteCourante(i));
			b.setPreferredSize(dimCarte);
			panelBoutons.add(b);		
		}
		
		// JScrollPane permet d'avoir un curseur de navigation
		JScrollPane scrollPane = new JScrollPane(panelBoutons);
		scrollPane.setPreferredSize(new Dimension(700,350));
		this.add(scrollPane);
	}
	
	/**
	 * Permet de connaitre la carte courant du joueur physique 
	 * @param l'index d'un joueur 
	 * @return une carte 
	 */
	public String carteCourante(int i){
		return controler.controlerGetCarteMainJoueurPrincipal(i).getForce()+" de  "+controler.controlerGetCarteMainJoueurPrincipal(i).getCouleurCarte();
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
}

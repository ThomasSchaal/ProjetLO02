package fr.utt.isi.lo02.projet.modele;

public class CarteSpeciale extends Carte{

	public CarteSpeciale(int idCarte, COULEUR couleurCarte, FORCE force){
		super(idCarte, couleurCarte, force);
		
	}
	
	
	public boolean estSpeciale() {
		boolean resultat = false;
		switch (this.getForce()) {
		case deux:
			resultat = true;
			break;
		case sept:
			resultat = true;
			break;
		case huit:
			resultat = true;
			break;
		case dix:
			resultat = true;
			break;
		case as:
			resultat = true;
			break;
		default:
			resultat = false;
			break;
		}
		return resultat;
	}
	
	public void actionCarteSpeciale(Carte c){
		
		switch(this.getForce()){
		case deux:
			// TODO Action carte 2, annule un vérifier posable et se pose dans tout les cas 
			break;
		case sept:
			// TODO Action carte 7, créer un vérifier posable alternatif
			break;
		case huit:
			// TODO Action carte 8, i+1 passer au joueur suivant
			break;
		case dix:
			//TODO Action carte 10, becher 
			break;
		case as:
			//TODO Action as, donner le tas a un autre joueur 
			break;
		default:
	
			break;
		}
	}
	
	public void actionAs(Joueur j){
		Partie.getInstance().getListJoueur().get(j.getIdJoueur()).getMain().ajouterCarte(Partie.getInstance().getTapis().getCartesTapis());
	}
}

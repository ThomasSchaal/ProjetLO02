package fr.utt.isi.lo02.projet.modele;

import java.util.Iterator;

public class EasyStrategy implements IStrategie {

	public void choisirCarteStrategie(int i) {
		JeuDeCarte jdc = new JeuDeCarte(Partie.getInstance().getListJoueur()
				.get(i).getMain().getCartesMain());
		Iterator<Carte> it = jdc.iterator();
		boolean jouable = true;
		while (it.hasNext() && jouable == true) {
			Carte carte =it.next();
			if (Partie.getInstance().verifierCartePosablePositif(carte)) {
				Partie.getInstance().getTapis().ajouterCarteTapis(carte);
				Partie.getInstance().getListJoueur().get(i).getMain()
						.getCartesMain().remove(carte);

			} else {
				int compteur = 0;
				while (Partie.getInstance().verifierCartePosablePositif(
						carte) == false
						&& compteur <= Partie.getInstance().getListJoueur()
								.get(i).getMain().getNbCarte()) {
					compteur++;
				}
				if (Partie.getInstance().verifierCartePosablePositif(carte)) {
					Partie.getInstance().getTapis().ajouterCarte(carte);
					Partie.getInstance().getListJoueur().get(i).getMain()
							.getCartesMain().remove(carte);

				} else {
					Partie.getInstance().getTapis().cocogne(i);
					jouable = false;
				}
			}
		}
	}
}

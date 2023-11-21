package produit;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private int poids;
	private Gaulois chasseur;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", "kg");
		this.poids = poids;
		this.chasseur = chasseur;
	}
	@Override	
	public String description() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("sanglier de " + poids + " kg chassé par " + chasseur.getNom());
		return chaine.toString();
	}
	
	public double calculerPrix(int prix) {
		return poids * prix / 1000.0;
	}
}

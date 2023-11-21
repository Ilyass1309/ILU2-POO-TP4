package produit;

public class Poisson extends Produit{
	private String date;

	public Poisson(String date) {
		super("poisson", "piece");
		this.date = date;
	}
	
	@Override
	public String description() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("poisson pêchés " + date);
		return chaine.toString();
	}
	
	public double calculerPrix(int prix) {
		return prix;
	}
}

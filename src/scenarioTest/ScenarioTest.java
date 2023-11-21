package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
//		IEtal[] etals = new IEtal[3];
//		Etal<Sanglier> etalSanglier = new Etal<>();
//		etals[0] = etalSanglier;
//		etals[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson("lundi"), 10);
		
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};
		
		Etal<Sanglier> etal1 = new Etal<>();
		etal1.installerVendeur(asterix, sangliersAsterix, 10);
		Etal<Sanglier> etal2 = new Etal<>();
		etal2.installerVendeur(obelix, sangliersObelix, 8);
		Etal<Poisson> etal3 = new Etal<>();
		etal3.installerVendeur(ordralfabetix, poissons, 7);
		Etal[] etals = {etal1, etal2, etal3};
		
		System.out.println(etal1.etatEtal());
		System.out.println(etal2.etatEtal());
		System.out.println(etal3.etatEtal());
		
		int nbProdAchetes = 3;
		int i = 0;
		int nbProd;
		double prix;
		while (nbProdAchetes != 0 || i < 3) {
			nbProd = etals[i].contientProduit("sanglier", 3);
			nbProdAchetes-= nbProd;
			if (nbProd > 0) {
				prix = etals[i].acheterProduit(i);
				System.out.println("A l'etal " + i + " je paye " + prix + " sous.");
				i+=1;
			}
			
		}
	}
	
}

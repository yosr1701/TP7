package tp7Interface;

public class Testt {

	public static void main(String[] args) {
		Agence agence = new Agence(5);

        agence.ajout(new Voiture("Clio", "Renault", 2020, 90));
        agence.ajout(new Voiture("Toyota", "Yaris", 2019, 120));
        agence.ajout(new Voiture("Clio", "Renault", 2021, 95));
        agence.ajout(new Voiture("Polo", "Volkswagen", 2018, 180));
        agence.ajout(new Voiture("Sportage", "KIA", 2022, 200));

        
        System.out.println("Voitures avec un prix de location inférieur à 100DT:");
        agence.afficheSelection(new CriterePrix(100));

        
        System.out.println("\nVoitures de marque 'Clio':");
        agence.afficheSelection(new CritereMarque("Clio"));
	
	}

}

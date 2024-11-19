package tp7Interface;

public class Voiture {
	private String marque ;
	private String modele ;
	private int anneeProd ;
	private int prixLoc ;
	
	public Voiture(String marque, String modele, int anneeProd, int prixLoc) {
		this.marque=marque ;
		this.modele=modele;
		this.anneeProd=anneeProd;
		this.prixLoc=prixLoc;
	}
	
	public String toString()
	{
		return "Marque: " + marque + ", Modèle: " + modele + ", Prix de location: " + prixLoc + "DT/jour";
	}
	public String getMarque(){
		return this.marque;
	}
	 public int getPrixLocation() {
	        return this.prixLoc;
	    }
}

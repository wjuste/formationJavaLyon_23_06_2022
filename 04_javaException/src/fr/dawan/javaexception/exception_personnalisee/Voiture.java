package fr.dawan.javaexception.exception_personnalisee;

public class Voiture {
	
	private String marque; 
	private int vitesse;
	
	public Voiture() {
		super();
	}

	public Voiture(String marque, int vitesse) {
		super();
		this.marque = marque;
		this.vitesse = vitesse;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", vitesse=" + vitesse + "]";
	}
	
	

}

package fr.dawan.javaexception.exception_personnalisee;

public class Application {

	public static void main(String[] args) {
		Parking parc = new Parking();
		
		try {
			parc.garerVoiture(new Voiture());
			parc.garerVoiture(new Voiture());
			parc.garerVoiture(new Voiture());
			parc.garerVoiture(new Voiture());
			parc.garerVoiture(new Voiture());
			parc.garerVoiture(new Voiture());
			
		} catch (ParkingPleinsException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		try {
			garerVoiture(12);
		} catch (MonException e) {
		//	e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
	
	
	
	public static void garerVoiture(int nbreVoitureGarer) throws MonException {
		int placeParking = 10;
		if(nbreVoitureGarer > placeParking) {
			throw new MonException("Plus de place sur le parking");
		}
	}

}

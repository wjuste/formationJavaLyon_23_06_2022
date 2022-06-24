package fr.dawan.javaexception.exception_personnalisee;

public class Parking {
	
	
	private Voiture tabVoiture[] = new Voiture[5];
	
	private int compteur;
	
	
	/*
	 * throw : permet de lever une exception manuellement en instanciant un objet de type ParkingPleinsException (par exemple)
	 * throws : Ce mot clé permet de signaler à la JVM qu'un morceau de code , une méthode, une classe.. est potentiellement 
	 * dangereux, et qu'il FAUT utiliser un try{...]catch{...}
	 */
	public void garerVoiture(Voiture voiture) throws ParkingPleinsException {
		if(compteur < 5) {
			tabVoiture[compteur] = voiture;
			compteur++;
		} else {
			throw new ParkingPleinsException();
		}
	}

}

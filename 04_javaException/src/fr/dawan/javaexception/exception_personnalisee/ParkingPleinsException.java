package fr.dawan.javaexception.exception_personnalisee;


/*
 * Pour créer ses propres exceptions : 
 *  1- Heriter de la classe Exception 
 *  2-Appeler le constructeur de classe exception
 */
public class ParkingPleinsException extends Exception {

	public ParkingPleinsException() {
		super("Il n'y a plus de places sur le parking");
	}


}

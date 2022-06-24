package fr.dawan.javaexception.exception_;

public class Application {

	public static void main(String[] args) {
		
		Utilisateur user3 = new Utilisateur("Rudd", "Emily", 27);
	
		//Diviser un nombre par zero 
		int nbre = 0;
		
		/*
		 * Le bloc try-catch permet de traiter les exceptions 
		 * le bloc try permet de definir un ensemble d'instructions à surveiller susceptible de 
		 * lever une exception
		 * Le bloc catch va intercepter les exceptions générées par les instructions du bloc try
		 * Le bloc finally est executé qu'une exception intervienne ou pas
		 */
		try {
			System.out.println(nbre / 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Bloc finnaly");
		}
		
		try {
			user3.setAge(12);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("Continue.....");
	}

}

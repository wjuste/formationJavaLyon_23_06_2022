package fr.dawan.javaio.serialisation_perf;

import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		Produit p = new Produit(1, "Ordinateur", 500.0);
		String path = "c:/tempData20/produit.txt";
		try {
			TestSerialisation.toBin(p, path);  //Ecriture dans un fichier 
			Produit p1 = TestSerialisation.fromBin(path); //Lecture
			System.out.println(p1);
			System.out.println("OK");
		} catch (IOException e) {
			System.out.println("Not Ok");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

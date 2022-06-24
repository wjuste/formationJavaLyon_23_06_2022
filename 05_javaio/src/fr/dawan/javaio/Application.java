package fr.dawan.javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Application {

	public static void main(String[] args) {
		
		String path = "c:/tempData20/adress.txt";
		
		//Serialisation d'un objet adresse
		 Adresse adr = new Adresse("Place occitanie", "Toulouse", 31000);
		 FileOutputStream fos = null;
		 ObjectOutputStream oos = null;
	
		 try {
			 
			 /*
			  * 1- Ouverture du flux (en sortie)
			  * Creation d'un de sortie vers le chemin du fichier 
			  * S'il existe pas ils sera crée sinon il sera écrasé
			  */
			 fos = new FileOutputStream(path);
			/*
			 * La classe ObjectOutputStream permet de serialiser un Objet 
			 * Crée une instance qui va écrire le resultat de la serialisation... 
			 * 
			 */
			 oos = new ObjectOutputStream(fos);
			
			
			/*
			 * 2-Ecriture de l'information , de l'objet adresse
			 * 
			 */
			oos.writeObject(adr);
			System.out.println("OK");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not OK");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not OK");
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

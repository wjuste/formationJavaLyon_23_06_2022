package fr.dawan.javaio.serialisation_perf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import fr.dawan.javaio.Adresse;

/*
 * L'utilisation d'un buffer permet une anette amelioration des performances de notre code 
 * Exemple : Lecture d'un fichier texte (3.6Mo)
 */
public class TestSerialisation {
	
	/**
	 * Serialisation : Ecriture dans un fichier 
	 * @param p
	 * @param path
	 * @throws IOException
	 */
	public static void toBin(Produit p, String path) throws IOException {
		FileOutputStream fos = null; 
		BufferedOutputStream bos = null; 
		ObjectOutputStream oos = null;
		
		//1-Ouverture du flux 
		fos = new FileOutputStream(path);
		bos = new BufferedOutputStream(fos);
		oos = new ObjectOutputStream(bos);
		
		//2-Ecriture 
		oos.writeObject(p);
		
		//3-Fermeture du flux
		oos.close();
		bos.close();
		fos.close();
	}
	
	public static Produit fromBin(String path) throws IOException, ClassNotFoundException {
		Object o = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null; 
		ObjectInputStream ois = null;
		
		//1-Ouverture du flux
		fis = new FileInputStream(path);
		bis = new BufferedInputStream(fis);
		ois = new ObjectInputStream(bis);
		
		//2-Lecture
		o = ois.readObject();
		
		//3-fermeture du flux
		ois.close();
		bis.close();
		fis.close();
		
		if(o instanceof Produit) {
			return (Produit) o;
		} else {
			return null;
		}
		
	
		
	}
	
}

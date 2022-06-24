package fr.dawan.javapoo.tp_concept_objet;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
	
	List<Employe> employes;
	
	public Personnel() {
		employes = new ArrayList<>();
	}
	
	public void ajouterEmploye(Employe employe) {
		employes.add(employe);
	}
	
	public void afficherSalaires() {
		for (Employe employe : employes) {
			System.out.println(employe.getNom() + " gagne " + employe.calculerSalaire() + " euros");
		}
	}
	
	public double salaireMoyen() {
		double somme = 0.0;
		for (int i = 0; i < employes.size(); i++) {
			somme += employes.get(i).calculerSalaire();
		}
		return somme / employes.size();
	}

}

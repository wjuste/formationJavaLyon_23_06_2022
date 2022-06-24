package fr.dawan.javapoo.tp_concept_objet;

public abstract class Commercial extends Employe{
	
	protected double chiffreAffaire;

	public Commercial() {
		super();
	}

	public Commercial(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
		super(nom, prenom, age, dateEntree);
		this.chiffreAffaire = chiffreAffaire;
	}

	
}

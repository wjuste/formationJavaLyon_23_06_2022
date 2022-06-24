package fr.dawan.javapoo.tp_concept_objet;

public abstract class Employe {
	
	private String nom; 
	private String prenom;
	private int age;
	private String dateEntree;
	
	public Employe() {
		super();
	}

	public Employe(String nom, String prenom, int age, String dateEntree) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateEntree = dateEntree;
	}
	
	public abstract double calculerSalaire();
	
	public String getNom() {
		return this.getTitre()+ this.prenom + " " + this.nom;
	}
	
	public String getTitre() {
		return "L'employe ";
	}
	
}

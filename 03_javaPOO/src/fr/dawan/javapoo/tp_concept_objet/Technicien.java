package fr.dawan.javapoo.tp_concept_objet;

public class Technicien  extends Employe{

	private int nombreUnites; 
	private final static double FACTEUR_UNITES = 5.0;
	
	
	public Technicien() {
		super();
	}

	public Technicien(String nom, String prenom, int age, String dateEntree, int nombreUnites) {
		super(nom, prenom, age, dateEntree);
		this.nombreUnites = nombreUnites;
	}




	@Override
	public double calculerSalaire() {
		return FACTEUR_UNITES * nombreUnites;
	}





	@Override
	public String getTitre() {
		return "Le technicien ";
	}
	
	

}

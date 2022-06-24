package fr.dawan.javapoo.tp_concept_objet;

public class TechnARisque extends Technicien{

	private final static double PRIME = 200;


	public TechnARisque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TechnARisque(String nom, String prenom, int age, String dateEntree, int nombreUnites) {
		super(nom, prenom, age, dateEntree, nombreUnites);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSalaire() {
		return super.calculerSalaire() + PRIME;
	}

	@Override
	public String getTitre() {
		return super.getTitre();
	}
	
	
	
}

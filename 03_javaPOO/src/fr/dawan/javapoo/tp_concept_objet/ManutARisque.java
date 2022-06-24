package fr.dawan.javapoo.tp_concept_objet;

public class ManutARisque extends Manutentionnaire {
	
	private final static double PRIME = 200;

	public ManutARisque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ManutARisque(String nom, String prenom, int age, String dateEntree, int heures) {
		super(nom, prenom, age, dateEntree, heures);
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

package fr.dawan.javapoo.tp_concept_objet;

public class Representant extends Commercial{
	
	private final static double POURCENT_REPRESENTANT = 0.2;
	private final static double BONUS_REPRESENTANT = 800;
	

	public Representant() {
		super();
	}


	public Representant(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
		super(nom, prenom, age, dateEntree, chiffreAffaire);
	}



	@Override
	public double calculerSalaire() {
		return chiffreAffaire*POURCENT_REPRESENTANT + BONUS_REPRESENTANT;
	}


	@Override
	public String getTitre() {
		return "Le representant ";
	}
	
	

}

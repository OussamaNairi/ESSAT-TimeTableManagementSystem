package tn.essatin.model;

public class Affectation {
	private int id;
	private Enseignant enseignant;
	private ChargeHoraire chargeHoraire;
	public Affectation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Affectation(int id, Enseignant enseignant, ChargeHoraire chargeHoraire) {
		super();
		this.id = id;
		this.enseignant = enseignant;
		this.chargeHoraire = chargeHoraire;
	}
	public Affectation(Enseignant enseignant, ChargeHoraire chargeHoraire) {
		super();
		this.enseignant = enseignant;
		this.chargeHoraire = chargeHoraire;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	public ChargeHoraire getChargeHoraire() {
		return chargeHoraire;
	}
	public void setChargeHoraire(ChargeHoraire chargeHoraire) {
		this.chargeHoraire = chargeHoraire;
	}
	

}

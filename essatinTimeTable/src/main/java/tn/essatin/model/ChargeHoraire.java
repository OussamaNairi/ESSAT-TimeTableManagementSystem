package tn.essatin.model;

public class ChargeHoraire {
	private int id;
	private String nom;
	private int valeur;
	private TypeMatiere typematiere;
	private Matiere matiere;
	public ChargeHoraire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChargeHoraire(int id, String nom, int valeur, TypeMatiere typematiere, Matiere matiere) {
		super();
		this.id = id;
		this.nom = nom;
		this.valeur = valeur;
		this.typematiere = typematiere;
		this.matiere = matiere;
	}
	public ChargeHoraire(String nom, int valeur, TypeMatiere typematiere, Matiere matiere) {
		super();
		this.nom = nom;
		this.valeur = valeur;
		this.typematiere = typematiere;
		this.matiere = matiere;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	public TypeMatiere getTypematiere() {
		return typematiere;
	}
	public void setTypematiere(TypeMatiere typematiere) {
		this.typematiere = typematiere;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	@Override
	public String toString() {
		return matiere +" "+nom;
	}
	

}

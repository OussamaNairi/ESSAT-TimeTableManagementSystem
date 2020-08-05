package tn.essatin.model;

public class Matiere {
	private int id;
	private String nom;
	private int coefficient;
	private int volumeHoraire;
	private TypeMatiere typeMatiere;
	private Niveau niveau;
	private Semestre semestre;
	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Matiere(int id, String nom, int coefficient, int volumeHoraire, TypeMatiere typeMatiere, Niveau niveau,
			Semestre semestre) {
		super();
		this.id = id;
		this.nom = nom;
		this.coefficient = coefficient;
		this.volumeHoraire = volumeHoraire;
		this.typeMatiere = typeMatiere;
		this.niveau = niveau;
		this.semestre = semestre;
	}
	public Matiere(String nom, int coefficient, int volumeHoraire, TypeMatiere typeMatiere, Niveau niveau,
			Semestre semestre) {
		super();
		this.nom = nom;
		this.coefficient = coefficient;
		this.volumeHoraire = volumeHoraire;
		this.typeMatiere = typeMatiere;
		this.niveau = niveau;
		this.semestre = semestre;
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
	public int getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	public int getVolumeHoraire() {
		return volumeHoraire;
	}
	public void setVolumeHoraire(int volumeHoraire) {
		this.volumeHoraire = volumeHoraire;
	}
	public TypeMatiere getTypeMatiere() {
		return typeMatiere;
	}
	public void setTypeMatiere(TypeMatiere typeMatiere) {
		this.typeMatiere = typeMatiere;
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	public Semestre getSemestre() {
		return semestre;
	}
	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}
	@Override
	public String toString() {
		return nom ;
	}
	
}

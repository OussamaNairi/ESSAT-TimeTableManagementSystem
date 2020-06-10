package tn.essatin.model;


public class Salle {

	private int id;
	private String nom;
	private int capacite;
	private TypeSalle typesalle;
	private Etage etage;
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Salle(int id, String nom, int capacite, TypeSalle typesalle, Etage etage) {
		super();
		this.id = id;
		this.nom = nom;
		this.capacite = capacite;
		this.typesalle = typesalle;
		this.etage = etage;
	}

	public Salle(String nom, int capacite, TypeSalle typesalle, Etage etage) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.typesalle = typesalle;
		this.etage = etage;
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
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public TypeSalle getTypesalle() {
		return typesalle;
	}
	public void setTypesalle(TypeSalle typesalle) {
		this.typesalle = typesalle;
	}
	public Etage getEtage() {
		return etage;
	}
	public void setEtage(Etage etage) {
		this.etage = etage;
	}
	

}

package tn.essatin.model;

public class Departement {
	private int id;
	private String nom;
	private String description;
	private String chefDepartement;
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(String nom, String description, String chefDepartement) {
		super();
		this.nom = nom;
		this.description = description;
		this.chefDepartement = chefDepartement;
	}
	public Departement(int id, String nom, String description, String chefDepartement) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.chefDepartement = chefDepartement;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getChefDepartement() {
		return chefDepartement;
	}
	public void setChefDepartement(String chefDepartement) {
		this.chefDepartement = chefDepartement;
	}
	

}

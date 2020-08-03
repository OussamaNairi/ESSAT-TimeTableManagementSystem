package tn.essatin.model;

public class Parcours {
	private int id;
	private String designation;
	private String description;
	private Specialite specialite;
	public Parcours() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parcours(String designation, String description, Specialite specialite) {
		super();
		this.designation = designation;
		this.description = description;
		this.specialite = specialite;
	}
	public Parcours(int id, String designation, String description, Specialite specialite) {
		super();
		this.id = id;
		this.designation = designation;
		this.description = description;
		this.specialite = specialite;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Specialite getSpecialite() {
		return specialite;
	}
	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}
	@Override
	public String toString() {
		return designation ;
	}
	

}

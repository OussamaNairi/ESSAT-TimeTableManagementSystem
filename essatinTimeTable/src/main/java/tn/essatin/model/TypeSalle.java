package tn.essatin.model;




public class TypeSalle {

	private int id;
	private String nom;
	public TypeSalle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TypeSalle(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public TypeSalle(String nom) {
		super();
		this.nom = nom;
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
	

}

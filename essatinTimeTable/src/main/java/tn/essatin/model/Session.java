package tn.essatin.model;

public class Session {
	private int id;
	private String nom;
	public Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Session(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public Session(String nom) {
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

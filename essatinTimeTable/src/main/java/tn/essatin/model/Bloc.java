package tn.essatin.model;


public class Bloc {

	private int id;
	private String nom;
	private Batiment bat;
	public Bloc() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bloc(int id, String nom, Batiment bat) {
		super();
		this.id = id;
		this.nom = nom;
		this.bat = bat;
	}

	public Bloc(String nom, Batiment bat) {
		super();
		this.nom = nom;
		this.bat = bat;
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
	public Batiment getBat() {
		return bat;
	}
	public void setBat(Batiment bat) {
		this.bat = bat;
	}
	@Override
	public String toString() {
		return nom ;
	}
	
}

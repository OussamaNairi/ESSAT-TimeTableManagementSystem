package tn.essatin.model;


public class Batiment {

	private int id;
	private String nom;
	private Faculte fac;
	public Batiment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Batiment(int id, String nom, Faculte fac) {
		super();
		this.id = id;
		this.nom = nom;
		this.fac = fac;
	}

	public Batiment(String nom, Faculte fac) {
		super();
		this.nom = nom;
		this.fac = fac;
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
	public Faculte getFac() {
		return fac;
	}
	public void setFac(Faculte fac) {
		this.fac = fac;
	}
	

}

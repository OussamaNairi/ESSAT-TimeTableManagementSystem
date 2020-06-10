package tn.essatin.model;



public class Nationalite {
	
	private int id;
    private String nom;
	public Nationalite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Nationalite(String nom) {
		super();
		this.nom = nom;
	}

	public Nationalite(int id, String nom) {
		super();
		this.id = id;
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
	@Override
	public String toString() {
		return nom;
	}
    

}

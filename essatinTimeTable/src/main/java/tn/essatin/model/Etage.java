package tn.essatin.model;


public class Etage {

	private int id;
	private String nom;
	private Bloc bloc;
	public Etage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Etage(int id, String nom, Bloc bloc) {
		super();
		this.id = id;
		this.nom = nom;
		this.bloc = bloc;
	}

	public Etage(String nom, Bloc bloc) {
		super();
		this.nom = nom;
		this.bloc = bloc;
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
	public Bloc getBloc() {
		return bloc;
	}
	public void setBloc(Bloc bloc) {
		this.bloc = bloc;
	}
	

}

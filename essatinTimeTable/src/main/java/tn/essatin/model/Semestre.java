package tn.essatin.model;

public class Semestre {
	private int id;
	private String nom;
	private Session session;
	public Semestre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Semestre(int id, String nom, Session session) {
		super();
		this.id = id;
		this.nom = nom;
		this.session = session;
	}
	public Semestre(String nom, Session session) {
		super();
		this.nom = nom;
		this.session = session;
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
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	

}

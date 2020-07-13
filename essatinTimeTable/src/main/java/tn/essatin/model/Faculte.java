package tn.essatin.model;

public class Faculte {

	private int id;
	private String nom;
	private String adresse;
	private int nombreEffectif;
	public Faculte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Faculte(int id, String nom, String adresse, int nombreEffectif) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.nombreEffectif = nombreEffectif;
	}

	public Faculte(String nom, String adresse, int nombreEffectif) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.nombreEffectif = nombreEffectif;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNombreEffectif() {
		return nombreEffectif;
	}
	public void setNombreEffectif(int nombreEffectif) {
		this.nombreEffectif = nombreEffectif;
	}
	
	@Override
	public String toString() {
		return nom ;
	}
	
}

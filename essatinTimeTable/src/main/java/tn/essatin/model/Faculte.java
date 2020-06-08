package tn.essatin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="faculte")
public class Faculte {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Faculte")
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
	

}

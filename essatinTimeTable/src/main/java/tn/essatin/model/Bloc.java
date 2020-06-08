package tn.essatin.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="bloc")
public class Bloc {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Bloc")
	private int id;
	private String nom;
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "ID_Batiment")
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

}

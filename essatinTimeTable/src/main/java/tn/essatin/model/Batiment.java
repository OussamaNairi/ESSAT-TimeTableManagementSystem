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
@Table(name="batiment")
public class Batiment {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Batiment")
	private int id;
	private String nom;
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "ID_Faculte")
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

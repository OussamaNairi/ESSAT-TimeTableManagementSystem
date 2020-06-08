package tn.essatin.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="salle")
public class Salle {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Salle")
	private int id;
	private String nom;
	private int capacite;
	@OneToOne
	@JoinColumn(name="ID_TypeSalle" ,nullable=false)
	private TypeSalle typesalle;
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "ID_Etage")
	private Etage etage;
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Salle(int id, String nom, int capacite, TypeSalle typesalle, Etage etage) {
		super();
		this.id = id;
		this.nom = nom;
		this.capacite = capacite;
		this.typesalle = typesalle;
		this.etage = etage;
	}

	public Salle(String nom, int capacite, TypeSalle typesalle, Etage etage) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.typesalle = typesalle;
		this.etage = etage;
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
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public TypeSalle getTypesalle() {
		return typesalle;
	}
	public void setTypesalle(TypeSalle typesalle) {
		this.typesalle = typesalle;
	}
	public Etage getEtage() {
		return etage;
	}
	public void setEtage(Etage etage) {
		this.etage = etage;
	}
	

}

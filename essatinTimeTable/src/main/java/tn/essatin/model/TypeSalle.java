package tn.essatin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="typesalle")
public class TypeSalle {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TypeSalle")
	private int id;
	private String nom;
	public TypeSalle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeSalle(String nom) {
		super();
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
	

}

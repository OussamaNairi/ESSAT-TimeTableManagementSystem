package tn.essatin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="semaine")
public class Semaine {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Semaine")
	private int id;
    private String nom;
	public Semaine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Semaine(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public Semaine(String nom) {
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

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
@Table(name="etage")
public class Etage {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Etage")
	private int id;
	private String nom;
	@ManyToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "ID_Bloc")
	private Bloc bloc;
	public Etage() {
		super();
		// TODO Auto-generated constructor stub
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

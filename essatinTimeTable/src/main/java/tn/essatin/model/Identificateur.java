package tn.essatin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="typeidentificateur")
public class Identificateur {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_TypeIdentificateur")
	private int id;
	@Column(name="TypeIdentificateur")
    private String designation;
	public Identificateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Identificateur(int id, String designation) {
		super();
		this.id = id;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return designation;
	}
    

}

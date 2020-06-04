package tn.essatin.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="etudiant")
@PrimaryKeyJoinColumn(name="ID_Personne")
public class Etudiant extends Personne{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String description;

	public Etudiant() {
		
	}

	public Etudiant(String nom, String prenom, String mail, String adresse, String tel,
			String dateDeNaissance, String lieuDeNaissance, Identificateur identificateur, String numeroIdentificateur,
			String sexe, Nationalite nationalite,String description) {
		super(nom, prenom, mail, adresse, tel, dateDeNaissance, lieuDeNaissance, identificateur,
				numeroIdentificateur, sexe, nationalite);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
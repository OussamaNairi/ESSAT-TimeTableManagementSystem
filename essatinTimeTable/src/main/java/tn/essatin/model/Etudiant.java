package tn.essatin.model;


public class Etudiant extends Personne{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String description;

	public Etudiant() {
		
	}
	public Etudiant(int id,String nom, String prenom, String mail, String adresse, String tel,
			String dateDeNaissance, String lieuDeNaissance, Identificateur identificateur, String numeroIdentificateur,
			String sexe, Nationalite nationalite,String description) {
		super(id,nom, prenom, mail, adresse, tel, dateDeNaissance, lieuDeNaissance, identificateur,
				numeroIdentificateur, sexe, nationalite);
		this.description = description;
	}

	public Etudiant(String nom, String prenom, String mail, String adresse, String tel,
			String dateDeNaissance, String lieuDeNaissance, Identificateur identificateur, String numeroIdentificateur,
			String sexe, Nationalite nationalite,String description) {
		super(nom, prenom, mail, adresse, tel, dateDeNaissance, lieuDeNaissance, identificateur,
				numeroIdentificateur, sexe, nationalite);
		this.description = description;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
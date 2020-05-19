package tn.essatin.model;

public class Etudiant extends Personne{
	private int id;
    private Personne personne;
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(int idPersonne, String nom, String prenom, String mail, String adresse, String tel,
			String dateDeNaissance, Identificateur identificateur, String sexe, Nationalite nationalite) {
		super(idPersonne, nom, prenom, mail, adresse, tel, dateDeNaissance, identificateur, sexe, nationalite);
		// TODO Auto-generated constructor stub
	}
	public Etudiant(int id, Personne personne) {
		super();
		this.id = id;
		this.personne = personne;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
    

}

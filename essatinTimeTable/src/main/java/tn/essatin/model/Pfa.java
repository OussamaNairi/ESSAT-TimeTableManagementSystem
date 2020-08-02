package tn.essatin.model;

public class Pfa {
	private int id;
	  private String titre;
	  private String description;
	  private String motCle;
	  private String technologie;
	  private Enseignant idenseignant;
	  private Departement idepartement;
	public Pfa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pfa(int id, String titre, String description, String motCle, String technologie, Enseignant idenseignant,
			Departement idepartement) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.motCle = motCle;
		this.technologie = technologie;
		this.idenseignant = idenseignant;
		this.idepartement = idepartement;
	}
	public Pfa(String titre, String description, String motCle, String technologie, Enseignant idenseignant,
			Departement idepartement) {
		super();
		this.titre = titre;
		this.description = description;
		this.motCle = motCle;
		this.technologie = technologie;
		this.idenseignant = idenseignant;
		this.idepartement = idepartement;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public String getTechnologie() {
		return technologie;
	}
	public void setTechnologie(String technologie) {
		this.technologie = technologie;
	}
	public Enseignant getIdenseignant() {
		return idenseignant;
	}
	public void setIdenseignant(Enseignant idenseignant) {
		this.idenseignant = idenseignant;
	}
	public Departement getIdepartement() {
		return idepartement;
	}
	public void setIdepartement(Departement idepartement) {
		this.idepartement = idepartement;
	}
	  

}

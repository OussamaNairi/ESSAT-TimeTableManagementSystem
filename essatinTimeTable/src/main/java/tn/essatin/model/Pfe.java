package tn.essatin.model;

public class Pfe {
  private int id;
  private String titre;
  private String description;
  private String motCle;
  private String technologie;
  private String dateDebut;
  private String dateFin;
  private Boolean projetExterne;
  private String nomSociete;
  private Enseignant idenseignant;
  private Departement idepartement;
public Pfe() {
	super();
	// TODO Auto-generated constructor stub
}
public Pfe(int id, String titre,String description, String motCle, String technologie, String dateDebut, String dateFin,
		Boolean projetExterne, String nomSociete, Enseignant idenseignant, Departement idepartement) {
	super();
	this.id = id;
	this.titre = titre;
	this.description = description;
	this.motCle = motCle;
	this.technologie = technologie;
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
	this.projetExterne = projetExterne;
	this.nomSociete = nomSociete;
	this.idenseignant = idenseignant;
	this.idepartement = idepartement;
}
public Pfe(String titre,String description, String motCle, String technologie, String dateDebut, String dateFin, Boolean projetExterne,
		String nomSociete, Enseignant idenseignant, Departement idepartement) {
	super();
	this.titre = titre;
	this.description = description;
	this.motCle = motCle;
	this.technologie = technologie;
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
	this.projetExterne = projetExterne;
	this.nomSociete = nomSociete;
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
public String getDateDebut() {
	return dateDebut;
}
public void setDateDebut(String dateDebut) {
	this.dateDebut = dateDebut;
}
public String getDateFin() {
	return dateFin;
}
public void setDateFin(String dateFin) {
	this.dateFin = dateFin;
}
public Boolean getProjetExterne() {
	return projetExterne;
}
public void setProjetExterne(Boolean projetExterne) {
	this.projetExterne = projetExterne;
}
public String getNomSociete() {
	return nomSociete;
}
public void setNomSociete(String nomSociete) {
	this.nomSociete = nomSociete;
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

package tn.essatin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="enseignant")
@PrimaryKeyJoinColumn(name="ID_Personne")
public class Enseignant extends Personne{

	@Column(name="CNSS")
	private String cnss;
	@Column(name="CNRPS")
	private String cnrps;
	@Column(name="DateEntree")
	private String dateEntree;
	@Column(name="Observation")
	private String observation;
	@Column(name="SituationM")
	private String situationM;
	@Column(name="NBEnfants")
	private int nombreEnfants;
	@Column(name="Diplome")
	private String diplome;
	@Column(name="RIB_IBAN")
	private String ribIban;
	@Column(name="IMG")
	private String image;
	@Column(name="Poste")
	private String poste;
	@Column(name="EtablissementOrigine")
	private String etablissementOrigine;
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Enseignant(int idPersonne, String nom, String prenom, String mail, String adresse, String tel,
			String dateDeNaissance, String lieuDeNaissance, Identificateur identificateur, String numeroIdentificateur,
			String sexe, Nationalite nationalite) {
		super(idPersonne, nom, prenom, mail, adresse, tel, dateDeNaissance, lieuDeNaissance, identificateur,
				numeroIdentificateur, sexe, nationalite);
		// TODO Auto-generated constructor stub
	}
	public String getCnss() {
		return cnss;
	}
	public void setCnss(String cnss) {
		this.cnss = cnss;
	}
	public String getCnrps() {
		return cnrps;
	}
	public void setCnrps(String cnrps) {
		this.cnrps = cnrps;
	}
	public String getDateEntree() {
		return dateEntree;
	}
	public void setDateEntree(String dateEntree) {
		this.dateEntree = dateEntree;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public String getSituationM() {
		return situationM;
	}
	public void setSituationM(String situationM) {
		this.situationM = situationM;
	}
	public int getNombreEnfants() {
		return nombreEnfants;
	}
	public void setNombreEnfants(int nombreEnfants) {
		this.nombreEnfants = nombreEnfants;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public String getRibIban() {
		return ribIban;
	}
	public void setRibIban(String ribIban) {
		this.ribIban = ribIban;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public String getEtablissementOrigine() {
		return etablissementOrigine;
	}
	public void setEtablissementOrigine(String etablissementOrigine) {
		this.etablissementOrigine = etablissementOrigine;
	}
	
	
}
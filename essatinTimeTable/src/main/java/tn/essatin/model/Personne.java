package tn.essatin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="personne")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Personne {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Personne")
	private int idPersonne;
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private String tel;
	private String dateDeNaissance;
	private String lieuDeNaissance;
	@OneToOne
	@JoinColumn(name="ID_TypeIdentificateur" ,nullable=false)
	private Identificateur identificateur;
	private String numeroIdentificateur;
	private String sexe;
	@OneToOne
	@JoinColumn(name="ID_Nationalite" ,nullable=false)
	private Nationalite nationalite;
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Personne(String nom, String prenom, String mail, String adresse, String tel, String dateDeNaissance,
			String lieuDeNaissance, Identificateur identificateur, String numeroIdentificateur, String sexe,
			Nationalite nationalite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.tel = tel;
		this.dateDeNaissance = dateDeNaissance;
		this.lieuDeNaissance = lieuDeNaissance;
		this.identificateur = identificateur;
		this.numeroIdentificateur = numeroIdentificateur;
		this.sexe = sexe;
		this.nationalite = nationalite;
	}

	public Personne(int idPersonne, String nom, String prenom, String mail, String adresse, String tel,
			String dateDeNaissance,String lieuDeNaissance, Identificateur identificateur,String numeroIdentificateur, String sexe, Nationalite nationalite) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
		this.tel = tel;
		this.dateDeNaissance = dateDeNaissance;
		this.lieuDeNaissance = lieuDeNaissance;
		this.identificateur = identificateur;
		this.numeroIdentificateur = numeroIdentificateur;
		this.sexe = sexe;
		this.nationalite = nationalite;
	}
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public Identificateur getIdentificateur() {
		return identificateur;
	}
	public void setIdentificateur(Identificateur identificateur) {
		this.identificateur = identificateur;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Nationalite getNationalite() {
		return nationalite;
	}
	public void setNationalite(Nationalite nationalite) {
		this.nationalite = nationalite;
	}
	public String getNumeroIdentificateur() {
		return numeroIdentificateur;
	}
	public void setNumeroIdentificateur(String numeroIdentificateur) {
		this.numeroIdentificateur = numeroIdentificateur;
	}
	public String getLieuDeNaissance() {
		return lieuDeNaissance;
	}
	public void setLieuDeNaissance(String lieuDeNaissance) {
		this.lieuDeNaissance = lieuDeNaissance;
	}
	

}

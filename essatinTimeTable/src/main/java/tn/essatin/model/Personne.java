package tn.essatin.model;

import java.io.Serializable;

public abstract class Personne implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private int id;
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private String tel;
	private String dateDeNaissance;
	private String lieuDeNaissance;
	private Identificateur identificateur;
	private String numeroIdentificateur;
	private String sexe;
	private Nationalite nationalite;
	public Personne() {
			}
	
	public Personne(String nom, String prenom, String mail, String adresse, String tel, String dateDeNaissance,
			String lieuDeNaissance, Identificateur identificateur, String numeroIdentificateur, String sexe,
			Nationalite nationalite) {
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

	public Personne(int id, String nom, String prenom, String mail, String adresse, String tel,
			String dateDeNaissance,String lieuDeNaissance, Identificateur identificateur,String numeroIdentificateur, String sexe, Nationalite nationalite) {
		this.id = id;
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

	@Override
	public String toString() {
		return  prenom+" "+nom;
	}
	

}

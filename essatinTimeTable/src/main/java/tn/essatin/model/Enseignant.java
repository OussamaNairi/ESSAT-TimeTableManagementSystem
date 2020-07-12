package tn.essatin.model;




public class Enseignant extends Personne{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cnss;
	private String cnrps;
	private String dateEntree;
	private String observation;
	private String situationM;
	private int nombreEnfants;
	private String diplome;
	private String ribIban;
	private String image;
	private String poste;
	private String etablissementOrigine;
	private Boolean responsableDepartement;
	public Enseignant() {
		
	}

	public Enseignant(int id,String nom, String prenom, String mail, String adresse, String tel, String dateDeNaissance,
			String lieuDeNaissance, Identificateur identificateur, String numeroIdentificateur, String sexe,
			Nationalite nationalite,String cnss, String cnrps, String dateEntree, String observation, String situationM,
			int nombreEnfants, String diplome, String ribIban, String image, String poste,
			String etablissementOrigine,Boolean responsableDepartement) {
		super(id,nom, prenom, mail, adresse, tel, dateDeNaissance, lieuDeNaissance, identificateur, numeroIdentificateur, sexe,
				nationalite);
		this.cnss = cnss;
		this.cnrps = cnrps;
		this.dateEntree = dateEntree;
		this.observation = observation;
		this.situationM = situationM;
		this.nombreEnfants = nombreEnfants;
		this.diplome = diplome;
		this.ribIban = ribIban;
		this.image = image;
		this.poste = poste;
		this.etablissementOrigine = etablissementOrigine;
		this.responsableDepartement = responsableDepartement;
		
		// TODO Auto-generated constructor stub
	}
	public Enseignant(String nom, String prenom, String mail, String adresse, String tel, String dateDeNaissance,
			String lieuDeNaissance, Identificateur identificateur, String numeroIdentificateur, String sexe,
			Nationalite nationalite,String cnss, String cnrps, String dateEntree, String observation, String situationM,
			int nombreEnfants, String diplome, String ribIban, String image, String poste,
			String etablissementOrigine,Boolean responsableDepartement) {
		super(nom, prenom, mail, adresse, tel, dateDeNaissance, lieuDeNaissance, identificateur, numeroIdentificateur, sexe,
				nationalite);
		this.cnss = cnss;
		this.cnrps = cnrps;
		this.dateEntree = dateEntree;
		this.observation = observation;
		this.situationM = situationM;
		this.nombreEnfants = nombreEnfants;
		this.diplome = diplome;
		this.ribIban = ribIban;
		this.image = image;
		this.poste = poste;
		this.etablissementOrigine = etablissementOrigine;
		this.responsableDepartement = responsableDepartement;
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

	public Boolean getResponsableDepartement() {
		return responsableDepartement;
	}

	public void setResponsableDepartement(Boolean responsableDepartement) {
		this.responsableDepartement = responsableDepartement;
	}
	
	
}
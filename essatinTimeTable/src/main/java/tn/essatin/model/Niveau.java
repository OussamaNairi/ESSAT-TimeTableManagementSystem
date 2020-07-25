package tn.essatin.model;

public class Niveau {
	private int id;
	private String designation;
	private String description;
	private Parcours parcours;
	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Niveau(int id, String designation, String description, Parcours parcours) {
		super();
		this.id = id;
		this.designation = designation;
		this.description = description;
		this.parcours = parcours;
	}
	public Niveau(String designation, String description, Parcours parcours) {
		super();
		this.designation = designation;
		this.description = description;
		this.parcours = parcours;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Parcours getParcours() {
		return parcours;
	}
	public void setParcours(Parcours parcours) {
		this.parcours = parcours;
	}

}

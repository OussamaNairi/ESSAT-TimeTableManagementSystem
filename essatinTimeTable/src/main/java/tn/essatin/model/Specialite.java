package tn.essatin.model;

public class Specialite {
	private int id;
	private String designation;
	private String description;
	private Cycle cycle;
	public Specialite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Specialite(int id, String designation, String description, Cycle cycle) {
		super();
		this.id = id;
		this.designation = designation;
		this.description = description;
		this.cycle = cycle;
	}
	public Specialite(String designation, String description, Cycle cycle) {
		super();
		this.designation = designation;
		this.description = description;
		this.cycle = cycle;
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
	public Cycle getCycle() {
		return cycle;
	}
	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	}

}

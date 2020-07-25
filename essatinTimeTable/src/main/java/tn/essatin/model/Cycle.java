package tn.essatin.model;

public class Cycle {
	private int id;
	private String designation;
	private String description;
	public Cycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cycle(int id, String designation, String description) {
		super();
		this.id = id;
		this.designation = designation;
		this.description = description;
	}
	public Cycle(String designation, String description) {
		super();
		this.designation = designation;
		this.description = description;
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
	
}

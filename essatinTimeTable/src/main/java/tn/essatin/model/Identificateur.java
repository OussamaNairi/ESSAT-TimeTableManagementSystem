package tn.essatin.model;

public class Identificateur {

	private int id;
    private String designation;
	public Identificateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Identificateur(int id, String designation) {
		super();
		this.id = id;
		this.designation = designation;
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
	@Override
	public String toString() {
		return designation;
	}
    

}

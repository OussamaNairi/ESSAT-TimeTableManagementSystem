package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Departement;



public interface IDepartementDao {
	public List<Departement> getAllDepartements();
	public Departement getDepartement(int id);
	public void addDepartement(Departement d);
	public void updateDepartement(Departement d);
	public void deleteDepartement(int id);

}

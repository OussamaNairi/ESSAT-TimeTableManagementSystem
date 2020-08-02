package tn.essatin.dao;

import java.util.List;


import tn.essatin.model.Specialite;

public interface ISpecialiteDao {
	public List<Specialite> getAllSpecialites();
	public Specialite getSpecialite(int id);
	public void addSpecialite(Specialite s);
	public void updateSpecialite(Specialite s);
	public void deleteSpecialite(int id);
	

}

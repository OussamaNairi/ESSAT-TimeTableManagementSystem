package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Faculte;


public interface IFaculteDao {
	public List<Faculte> getAllFacultes();
	public Faculte getFaculte(int id);
	public void addFaculte(Faculte f);
	public void updateFaculte(Faculte f);
	public void deleteFaculte(int id);

}

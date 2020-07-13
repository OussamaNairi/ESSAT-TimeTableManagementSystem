package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Etage;


public interface IEtageDao {
	public List<Etage> getAllEtages();
	public Etage getEtage(int id);
	public void addEtage(Etage e);
	public void updateEtage(Etage e);
	public void deleteEtage(int id);

}

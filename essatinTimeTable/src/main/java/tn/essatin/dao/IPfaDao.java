package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Pfa;

public interface IPfaDao {
	public List<Pfa> getAllPfas();
	public Pfa getPfa(int id);
	public void addPfa(Pfa p);
	public void updatePfa(Pfa p);
	public void deletePfa(int id);


}

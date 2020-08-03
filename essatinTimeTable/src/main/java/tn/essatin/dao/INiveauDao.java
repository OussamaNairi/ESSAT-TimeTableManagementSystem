package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Niveau;


public interface INiveauDao {
	public List<Niveau> getAllNiveaus();
	public Niveau getNiveau(int id);
	public void addNiveau(Niveau n);
	public void updateNiveau(Niveau n);
	public void deleteNiveau(int id);


}

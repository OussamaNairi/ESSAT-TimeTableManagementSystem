package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Enseignant;

public interface IEnseignantDao {
	public List<Enseignant> getAllEnseignants();
	public Enseignant getEnseignant(int id);
	public void addEnseignant(Enseignant e);
	public void updateEnseignant(Enseignant e);
	public void deleteEnseignant(int id);

}

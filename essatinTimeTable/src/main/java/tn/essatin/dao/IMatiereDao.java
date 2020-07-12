package tn.essatin.dao;

import java.util.List;


import tn.essatin.model.Matiere;

public interface IMatiereDao {
	public List<Matiere> getAllMatieres();
	public Matiere getMatiere(int id);
	public void addMatiere(Matiere d);
	public void updateMatiere(Matiere d);
	public void deleteMatiere(int id);

}

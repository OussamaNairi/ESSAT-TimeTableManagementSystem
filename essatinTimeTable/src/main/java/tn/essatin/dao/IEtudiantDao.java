package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Etudiant;



public interface IEtudiantDao {
	public List<Etudiant> getAllEtudiants();
	public Etudiant getEtudiant(int id);
	public void addEtudiant(Etudiant e);
	public void updateEtudiant(Etudiant e);
	public void deleteEtudiant(int id);

}

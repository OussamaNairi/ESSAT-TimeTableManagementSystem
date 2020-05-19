package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Personne;



public interface IPersonneDao {
	public List<Personne> getAllPersonnes();
	public Personne getPersonne(int id);
	public void addPersonne(Personne p);
	public void updatePersonne(Personne p);
	public void deletePersonne(int id);

}

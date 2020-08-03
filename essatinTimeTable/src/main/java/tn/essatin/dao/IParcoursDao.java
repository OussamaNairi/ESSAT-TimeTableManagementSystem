package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Parcours;


public interface IParcoursDao {
	public List<Parcours> getAllParcourss();
	public Parcours getParcours(int id);
	public void addParcours(Parcours p);
	public void updateParcours(Parcours p);
	public void deleteParcours(int id);

}

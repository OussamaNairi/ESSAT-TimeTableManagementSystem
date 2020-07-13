package tn.essatin.dao;

import java.util.List;


import tn.essatin.model.Salle;

public interface ISalleDao {
	public List<Salle> getAllSalles();
	public Salle getSalle(int id);
	public void addSalle(Salle s);
	public void updateSalle(Salle s);
	public void deleteSalle(int id);


}

package tn.essatin.dao;

import java.util.List;


import tn.essatin.model.Semaine;

public interface ISemaineDao {
	public List<Semaine> getAllSemaines();
	public Semaine getSemaine(int id);
	public void addSemaine(Semaine s);
	public void updateSemaine(Semaine s);
	public void deleteSemaine(int id);

}

package tn.essatin.dao;

import java.util.List;


import tn.essatin.model.Semestre;

public interface ISemestreDao {
	public List<Semestre> getAllSemestres();
	public Semestre getSemestre(int id);
	public void addSemestre(Semestre s);
	public void updateSemestre(Semestre s);
	public void deleteSemestre(int id);

}

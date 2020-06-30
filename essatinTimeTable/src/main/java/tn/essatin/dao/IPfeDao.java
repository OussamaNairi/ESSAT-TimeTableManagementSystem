package tn.essatin.dao;

import java.util.List;


import tn.essatin.model.Pfe;

public interface IPfeDao {
	public List<Pfe> getAllPfes();
	public Pfe getPfe(int id);
	public void addPfe(Pfe p);
	public void updatePfe(Pfe p);
	public void deletePfe(int id);

}

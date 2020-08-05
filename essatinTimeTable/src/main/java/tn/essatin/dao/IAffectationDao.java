package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Affectation;


public interface IAffectationDao {
	public List<Affectation> getAllAffectations();
	public Affectation getAffectation(int id);
	public void addAffectation(Affectation a);
	public void updateAffectation(Affectation a);
	public void deleteAffectation(int id);

}

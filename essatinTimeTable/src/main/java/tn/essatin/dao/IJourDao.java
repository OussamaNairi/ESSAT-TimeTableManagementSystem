package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Jour;


public interface IJourDao {
	public List<Jour> getAllJours();
	public Jour getJour(int id);
	public void addJour(Jour j);
	public void updateJour(Jour j);
	public void deleteJour(int id);

}

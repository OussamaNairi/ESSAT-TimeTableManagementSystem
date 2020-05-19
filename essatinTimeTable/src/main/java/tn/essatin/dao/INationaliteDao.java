package tn.essatin.dao;

import java.util.List;


import tn.essatin.model.Nationalite;

public interface INationaliteDao {
	public List<Nationalite> getAllNationalites();
	public Nationalite getNationalite(int id);
	public void addNationalite(Nationalite n);
	public void updateNationalite(Nationalite n);
	public void deleteNationalite(int id);


}

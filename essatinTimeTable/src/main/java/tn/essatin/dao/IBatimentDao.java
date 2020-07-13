package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Batiment;


public interface IBatimentDao {
	public List<Batiment> getAllBatiments();
	public Batiment getBatiment(int id);
	public void addBatiment(Batiment b);
	public void updateBatiment(Batiment b);
	public void deleteBatiment(int id);

}

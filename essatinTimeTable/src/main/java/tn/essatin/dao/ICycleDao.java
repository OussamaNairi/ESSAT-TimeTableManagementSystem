package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Cycle;


public interface ICycleDao {
	public List<Cycle> getAllCycles();
	public Cycle getCycle(int id);
	public void addCycle(Cycle c);
	public void updateCycle(Cycle c);
	public void deleteCycle(int id);


}

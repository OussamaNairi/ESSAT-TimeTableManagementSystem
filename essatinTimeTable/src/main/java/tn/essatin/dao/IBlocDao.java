package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Bloc;


public interface IBlocDao {
	public List<Bloc> getAllBlocs();
	public Bloc getBloc(int id);
	public void addBloc(Bloc b);
	public void updateBloc(Bloc b);
	public void deleteBloc(int id);

}

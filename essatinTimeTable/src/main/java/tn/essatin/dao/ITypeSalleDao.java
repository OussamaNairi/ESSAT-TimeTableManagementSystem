package tn.essatin.dao;

import java.util.List;


import tn.essatin.model.TypeSalle;

public interface ITypeSalleDao {
	public List<TypeSalle> getAllTypeSalles();
	public TypeSalle getTypeSalle(int id);
	public void addTypeSalle(TypeSalle t);
	public void updateTypeSalle(TypeSalle t);
	public void deleteTypeSalle(int id);

}

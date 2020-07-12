package tn.essatin.dao;

import java.util.List;


import tn.essatin.model.TypeMatiere;

public interface ITypeMatiereDao {
	public List<TypeMatiere> getAllTypeMatieres();
	public TypeMatiere getTypeMatiere(int id);
	public void addTypeMatiere(TypeMatiere d);
	public void updateTypeMatiere(TypeMatiere d);
	public void deleteTypeMatiere(int id);

}

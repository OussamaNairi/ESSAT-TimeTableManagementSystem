package tn.essatin.dao;

import java.util.List;

import tn.essatin.model.Identificateur;



public interface IIdentificateurDao {
	public List<Identificateur> getAllIdentificateurs();
	public Identificateur getIdentificateur(int id);
	public void addIdentificateur(Identificateur i);
	public void updateIdentificateur(Identificateur i);
	public void deleteIdentificateur(int id);


}

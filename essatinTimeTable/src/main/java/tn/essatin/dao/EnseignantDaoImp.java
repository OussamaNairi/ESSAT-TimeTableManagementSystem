package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.essatin.model.Enseignant;
import tn.essatin.model.Personne;

public class EnseignantDaoImp implements IEnseignantDao{

	@Override
	public List<Enseignant> getAllEnseignants() {
		Connection cnx=SingletonConnection.getConnection();
		List<Enseignant> liste = new ArrayList<Enseignant>();
		try {
			PreparedStatement pre=cnx.prepareStatement("SELECT personne.ID_Personne,personne.nom,personne.prenom,personne.mail,personne.adresse, enseignant.IMG, enseignant.Poste, enseignant.EtablissementOrigine FROM personne, enseignant WHERE personne.ID_Personne = enseignant.ID_Enseignant");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Enseignant p=new Enseignant();
				p.setIdPersonne(res.getInt("ID_Personne"));
				p.setNom(res.getString("nom"));
				p.setPrenom(res.getString("prenom"));
				p.setMail(res.getString("mail"));
				p.setAdresse(res.getString("adresse"));
				p.setImage(res.getString("IMG"));
				p.setPoste(res.getString("poste"));
				p.setEtablissementOrigine(res.getString("etablissementOrigine"));
				liste.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public Enseignant getEnseignant(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEnseignant(Enseignant e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEnseignant(Enseignant e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEnseignant(int id) {
		// TODO Auto-generated method stub
		
	}

}

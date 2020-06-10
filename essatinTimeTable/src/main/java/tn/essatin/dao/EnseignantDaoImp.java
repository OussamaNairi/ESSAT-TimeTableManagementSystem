package tn.essatin.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.essatin.model.Enseignant;
import tn.essatin.singleton.SingletonConnection;




public class EnseignantDaoImp implements IEnseignantDao{
	@Override
	public List<Enseignant> getAllEnseignants() {
		Connection cnx=SingletonConnection.getConnection();
		List<Enseignant> liste = new ArrayList<Enseignant>();
		try {
			PreparedStatement pre=cnx.prepareStatement("SELECT personne.ID_Personne,personne.nom,personne.prenom,personne.mail,personne.adresse, enseignant.IMG, enseignant.Poste, enseignant.EtablissementOrigine FROM personne, enseignant WHERE personne.ID_Personne = enseignant.ID_Enseignant");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Enseignant e=new Enseignant();
				e.setId(res.getInt("ID_Personne"));
				e.setNom(res.getString("nom"));
				e.setPrenom(res.getString("prenom"));
				e.setMail(res.getString("mail"));
				e.setAdresse(res.getString("adresse"));
				e.setImage(res.getString("IMG"));
				e.setPoste(res.getString("poste"));
				e.setEtablissementOrigine(res.getString("etablissementOrigine"));
				liste.add(e);
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


	
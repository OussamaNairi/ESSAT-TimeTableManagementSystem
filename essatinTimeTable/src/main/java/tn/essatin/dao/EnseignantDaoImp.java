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
		List<Personne> liste = new ArrayList<Personne>();
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from enseignant");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Enseignant p=new Enseignant();
				p.setId(res.getInt("id"));
				p.setCnss(res.getString("cnss"));
				p.setCnrps(res.getString("cnrps"));
				p.setObservation(res.getString("observation"));
				p.setSituationM(res.getString("situationM"));
				p.setNombreEnfants(res.getInt("nombreEnfants"));
				p.setCnss(res.getString("cnss"));
				p.setCnrps(res.getString("cnrps"));
				p.setObservation(res.getString("observation"));
				p.setSituationM(res.getString("situationM"));
				p.setNombreEnfants(res.getInt("nombreEnfants"));
				p.setDiplome(res.getString("diplome"));
				p.setRibIban(res.getString("ribIban"));
				p.setImage(res.getString("image"));
				p.setPoste(res.getString("poste"));
				p.setEtablissementOrigine(res.getString("etablissementOrigine"));
				
				
				p.setIdPersonne(res.getInt("ID_Personne"));
				p.setNom(res.getString("nom"));
				p.setPrenom(res.getString("prenom"));
				p.setMail(res.getString("mail"));
				p.setAdresse(res.getString("adresse"));
				p.setTel(res.getString("tel"));
				p.setDateDeNaissance(res.getString("dateDeNaissance "));
				p.setDateDeNaissance(res.getString("lieuDeNaissance "));
				
				p.setNumeroIdentificateur(res.getString("numeroIdentificateur"));
				p.setSexe(res.getString("sexe"));
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

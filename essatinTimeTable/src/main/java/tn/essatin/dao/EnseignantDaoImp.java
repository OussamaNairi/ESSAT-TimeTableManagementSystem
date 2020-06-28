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
			PreparedStatement pre=cnx.prepareStatement("SELECT personne.ID_Personne,personne.nom,personne.prenom,personne.mail,personne.adresse, enseignant.IMG, enseignant.Poste, enseignant.EtablissementOrigine FROM personne, enseignant WHERE personne.ID_Personne = enseignant.ID_Personne");
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
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("insert into personne values(null,?,?,?,?,?,?,?,?,?,?,?)");
			pre.setString(1,e.getNom());
			pre.setString(2,e.getPrenom());
			pre.setString(3,e.getMail());
			pre.setString(4,e.getAdresse());
			pre.setString(5,e.getTel());
			pre.setString(6,e.getDateDeNaissance());
			pre.setString(7,e.getLieuDeNaissance());
			pre.setInt(8,e.getIdentificateur().getId());
			pre.setString(9,e.getNumeroIdentificateur());
			pre.setString(10,e.getSexe());
			pre.setInt(11,e.getNationalite().getId());
			pre.executeUpdate();
			PreparedStatement pre2=cnx.prepareStatement("insert into enseignant values(null,?,?,?,?,?,?,?,?,?,?,?,?,LAST_INSERT_ID())");
			pre2.setString(1,e.getCnss());
			pre2.setString(2,e.getCnrps());
			pre2.setString(3,e.getDateEntree());
			pre2.setString(4,e.getObservation());
			pre2.setString(5,e.getSituationM());
			pre2.setInt(6,e.getNombreEnfants());
			pre2.setString(7,e.getDiplome());
			pre2.setString(8,e.getRibIban());
			pre2.setString(9,e.getImage());
			pre2.setString(10,e.getPoste());
			pre2.setString(11,e.getEtablissementOrigine());
			pre2.setBoolean(12,e.getResponsableDepartement());
			pre2.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
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


	
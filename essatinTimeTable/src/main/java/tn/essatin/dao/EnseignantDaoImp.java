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
			PreparedStatement pre=cnx.prepareStatement("SELECT personne.ID_Personne,personne.nom,personne.prenom,personne.mail,personne.tel FROM personne, enseignant WHERE personne.ID_Personne = enseignant.ID_Personne");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Enseignant e=new Enseignant();
				e.setId(res.getInt("ID_Personne"));
				e.setNom(res.getString("nom"));
				e.setPrenom(res.getString("prenom"));
				e.setMail(res.getString("mail"));
				e.setTel(res.getString("tel"));
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
		Connection cnx=SingletonConnection.getConnection();
		Enseignant e=null;
		NationaliteDaoImp dao=null;
		IdentificateurDaoImp dao1=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from personne,enseignant where personne.ID_Personne=? AND personne.ID_Personne=enseignant.ID_Personne");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 e=new Enseignant();
				 dao =new NationaliteDaoImp();
				 dao1 =new IdentificateurDaoImp();
				    e.setId(res.getInt("ID_Personne"));
					e.setNom(res.getString("nom"));
					e.setPrenom(res.getString("prenom"));
					e.setMail(res.getString("mail"));
					e.setAdresse(res.getString("adresse"));
					e.setTel(res.getString("tel"));
					e.setDateDeNaissance(res.getString("dateDeNaissance"));
					e.setLieuDeNaissance(res.getString("lieuDeNaissance"));
					e.setIdentificateur(dao1.getIdentificateur(res.getInt("ID_TypeIdentificateur")));
					e.setNumeroIdentificateur(res.getString("numeroIdentificateur"));
					e.setSexe(res.getString("sexe"));
					e.setNationalite(dao.getNationalite(res.getInt("ID_Nationalite")));
					e.setCnss(res.getString("CNSS"));
					e.setCnrps(res.getString("CNRPS"));
					e.setDateEntree(res.getString("DateEntree"));
					e.setObservation(res.getString("Observation"));
					e.setSituationM(res.getString("SituationM"));
					e.setNombreEnfants(res.getInt("NBEnfants"));
					e.setDiplome(res.getString("Diplome"));
					e.setRibIban(res.getString("RIB_IBAN"));
					e.setImage(res.getString("IMG"));
					e.setPoste(res.getString("poste"));
					e.setEtablissementOrigine(res.getString("etablissementOrigine"));
					e.setResponsableDepartement(res.getBoolean("responsableDepartement"));
				   
		
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
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
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("update personne ,enseignant  set personne.nom=?,personne.prenom=?,personne.mail=?,personne.adresse=?,personne.tel=?,personne.dateDeNaissance=?,personne.lieuDeNaissance=?,personne.ID_TypeIdentificateur=?,personne.numeroIdentificateur=?,personne.sexe=?,personne.ID_Nationalite=? ,enseignant.CNSS=?,enseignant.CNRPS=?,enseignant.DateEntree=?,enseignant.Observation=?,enseignant.SituationM=?,enseignant.NBEnfants=?,enseignant.Diplome=?,enseignant.RIB_IBAN=?,enseignant.IMG=?,enseignant.poste=?,enseignant.etablissementOrigine=?,enseignant.responsableDEpartement=? where personne.ID_Personne=? AND personne.ID_Personne=enseignant.ID_Personne");
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
			pre.setString(12,e.getCnss());
			pre.setString(13,e.getCnrps());
			pre.setString(14,e.getDateEntree());
			pre.setString(15,e.getObservation());
			pre.setString(16,e.getSituationM());
			pre.setInt(17,e.getNombreEnfants());
			pre.setString(18,e.getDiplome());
			pre.setString(19,e.getRibIban());
			pre.setString(20,e.getImage());
			pre.setString(21,e.getPoste());
			pre.setString(22,e.getEtablissementOrigine());
			pre.setBoolean(23,e.getResponsableDepartement());
			pre.setInt(24,e.getId());
			pre.executeUpdate();
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void deleteEnseignant(int id) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("delete from personne where ID_Personne=?");
			pre.setInt(1,id);
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}


	
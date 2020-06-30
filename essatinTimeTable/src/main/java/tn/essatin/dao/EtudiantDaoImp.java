package tn.essatin.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import tn.essatin.model.Etudiant;
import tn.essatin.singleton.SingletonConnection;

public class EtudiantDaoImp implements IEtudiantDao{
	


	@Override
	public List<Etudiant> getAllEtudiants() {
		Connection cnx=SingletonConnection.getConnection();
		List<Etudiant> liste = new ArrayList<Etudiant>();
		try {
			PreparedStatement pre=cnx.prepareStatement("SELECT personne.ID_Personne,personne.nom,personne.prenom,personne.mail,personne.tel FROM personne, etudiant WHERE personne.ID_Personne = etudiant.ID_Personne");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Etudiant e=new Etudiant();
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
	public Etudiant getEtudiant(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Etudiant e=null;
		NationaliteDaoImp dao=null;
		IdentificateurDaoImp dao1=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from personne,etudiant where personne.ID_Personne=? AND personne.ID_Personne=etudiant.ID_Personne");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 e=new Etudiant();
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
					e.setDescription(res.getString("description"));
									  		
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
		
	}

	@Override
	public void addEtudiant(Etudiant e) {
		
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
			PreparedStatement pre2=cnx.prepareStatement("insert into etudiant values(null,?,LAST_INSERT_ID())");
			pre2.setString(1,e.getDescription());

			pre2.executeUpdate();
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void updateEtudiant(Etudiant e) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("update personne ,etudiant  set personne.nom=?,personne.prenom=?,personne.mail=?,personne.adresse=?,personne.tel=?,personne.dateDeNaissance=?,personne.lieuDeNaissance=?,personne.ID_TypeIdentificateur=?,personne.numeroIdentificateur=?,personne.sexe=?,personne.ID_Nationalite=? etudiant.description=?  where ID_Personne=? AND personne.ID_Personne=etudiant.ID_Personne");
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
			pre.setString(12,e.getDescription());
			pre.setInt(13,e.getId());
			pre.executeUpdate();
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void deleteEtudiant(int id) {
		
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



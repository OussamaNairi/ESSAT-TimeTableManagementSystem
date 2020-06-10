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
			PreparedStatement pre=cnx.prepareStatement("select * from Etudiant");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Etudiant n=new Etudiant();
				n.setId(res.getInt("ID"));
				n.setNom(res.getString("libelle"));
				
				liste.add(n);
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
		Etudiant n=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from Etudiant where ID=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 n=new Etudiant();
				n.setId(res.getInt("ID"));
				n.setNom(res.getString("libelle"));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
		
	}

	@Override
	public void addEtudiant(Etudiant n) {
		
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("insert into Etudiant values(null,?)");
			pre.setString(1,n.getNom());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateEtudiant(Etudiant n) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("update Etudiant set libelle=? where ID=?");
			pre.setString(1,n.getNom());
			pre.setInt(2,n.getId());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteEtudiant(int id) {
		
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("delete from Etudiant where ID=?");
			pre.setInt(1,id);
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
	}



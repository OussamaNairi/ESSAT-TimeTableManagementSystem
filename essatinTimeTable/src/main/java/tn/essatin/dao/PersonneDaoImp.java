package tn.essatin.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import tn.essatin.model.Personne;
import tn.essatin.singleton.SingletonConnection;

public class PersonneDaoImp implements IPersonneDao{
	


	@Override
	public List<Personne> getAllPersonnes() {
		Connection cnx=SingletonConnection.getConnection();
		List<Personne> liste = new ArrayList<Personne>();
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from Personne");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				
			
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	
	}

	@Override
	public Personne getPersonne(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Personne n=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from Personne where ID=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
		
	}

	@Override
	public void addPersonne(Personne n) {
		
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("insert into Personne values(null,?)");
			pre.setString(1,n.getNom());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updatePersonne(Personne n) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("update Personne set libelle=? where ID=?");
			pre.setString(1,n.getNom());
			pre.setInt(2,n.getId());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deletePersonne(int id) {
		
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("delete from Personne where ID=?");
			pre.setInt(1,id);
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
	}



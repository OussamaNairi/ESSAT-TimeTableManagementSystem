package tn.essatin.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import tn.essatin.model.Jour;
import tn.essatin.singleton.SingletonConnection;

public class JourDaoImp implements IJourDao{
	


	@Override
	public List<Jour> getAllJours() {
		Connection cnx=SingletonConnection.getConnection();
		List<Jour> liste = new ArrayList<Jour>();
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from Jour");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Jour n=new Jour();
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
	public Jour getJour(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Jour n=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from Jour where ID=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 n=new Jour();
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
	public void addJour(Jour n) {
		
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("insert into Jour values(null,?)");
			pre.setString(1,n.getNom());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateJour(Jour n) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("update Jour set libelle=? where ID=?");
			pre.setString(1,n.getNom());
			pre.setInt(2,n.getId());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteJour(int id) {
		
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("delete from Jour where ID=?");
			pre.setInt(1,id);
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
	}



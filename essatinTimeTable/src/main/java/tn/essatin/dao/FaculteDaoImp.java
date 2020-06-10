package tn.essatin.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import tn.essatin.model.Faculte;
import tn.essatin.singleton.SingletonConnection;

public class FaculteDaoImp implements IFaculteDao{
	


	@Override
	public List<Faculte> getAllFacultes() {
		Connection cnx=SingletonConnection.getConnection();
		List<Faculte> liste = new ArrayList<Faculte>();
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from Faculte");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Faculte n=new Faculte();
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
	public Faculte getFaculte(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Faculte n=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from Faculte where ID=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 n=new Faculte();
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
	public void addFaculte(Faculte n) {
		
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("insert into Faculte values(null,?)");
			pre.setString(1,n.getNom());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateFaculte(Faculte n) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("update Faculte set libelle=? where ID=?");
			pre.setString(1,n.getNom());
			pre.setInt(2,n.getId());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteFaculte(int id) {
		
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("delete from Faculte where ID=?");
			pre.setInt(1,id);
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
	}



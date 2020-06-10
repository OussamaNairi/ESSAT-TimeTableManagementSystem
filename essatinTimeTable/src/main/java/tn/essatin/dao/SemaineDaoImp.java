package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import tn.essatin.model.Semaine;
import tn.essatin.singleton.SingletonConnection;

public class SemaineDaoImp implements ISemaineDao{
	


	@Override
	public List<Semaine> getAllSemaines() {
		Connection cnx=SingletonConnection.getConnection();
		List<Semaine> liste = new ArrayList<Semaine>();
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from semaine");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Semaine n=new Semaine();
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
	public Semaine getSemaine(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Semaine n=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from semaine where ID=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 n=new Semaine();
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
	public void addSemaine(Semaine n) {
		
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("insert into semaine values(null,?)");
			pre.setString(1,n.getNom());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateSemaine(Semaine n) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("update semaine set libelle=? where ID=?");
			pre.setString(1,n.getNom());
			pre.setInt(2,n.getId());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteSemaine(int id) {
		
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("delete from semaine where ID=?");
			pre.setInt(1,id);
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
	}



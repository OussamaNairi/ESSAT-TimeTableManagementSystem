package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.essatin.model.Nationalite;

public class NationaliteDaoImp implements INationaliteDao{

	@Override
	public List<Nationalite> getAllNationalites() {
		Connection cnx=SingletonConnection.getConnection();
		List<Nationalite> liste = new ArrayList<Nationalite>();
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from nationalite");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Nationalite n=new Nationalite();
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
	public Nationalite getNationalite(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Nationalite n=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from nationalite where ID=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 n=new Nationalite();
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
	public void addNationalite(Nationalite n) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("insert into nationalite values(null,?)");
			pre.setString(1,n.getNom());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateNationalite(Nationalite n) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("update nationalite set libelle=? where ID=?");
			pre.setString(1,n.getNom());
			pre.setInt(2,n.getId());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteNationalite(int id) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("delete from nationalite where ID=?");
			pre.setInt(1,id);
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	}



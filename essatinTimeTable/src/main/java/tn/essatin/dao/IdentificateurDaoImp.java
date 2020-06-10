package tn.essatin.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import tn.essatin.model.Identificateur;
import tn.essatin.singleton.SingletonConnection;

public class IdentificateurDaoImp implements IIdentificateurDao{
	


	@Override
	public List<Identificateur> getAllIdentificateurs() {
		Connection cnx=SingletonConnection.getConnection();
		List<Identificateur> liste = new ArrayList<Identificateur>();
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from typeidentificateur");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Identificateur n=new Identificateur();
				n.setId(res.getInt("ID_TypeIdentificateur"));
				n.setDesignation(res.getString("TypeIdentificateur"));
				
				liste.add(n);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	
	}

	@Override
	public Identificateur getIdentificateur(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Identificateur n=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from typeidentificateur where ID_TypeIdentificateur=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 n=new Identificateur();
				n.setId(res.getInt("ID_TypeIdentificateur"));
				n.setDesignation(res.getString("TypeIdentificateur"));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
		
	}

	@Override
	public void addIdentificateur(Identificateur n) {
		
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("insert into typeidentificateur values(null,?)");
			pre.setString(1,n.getDesignation());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateIdentificateur(Identificateur n) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("update typeidentificateur set TypeIdentificateur=? where ID_TypeIdentificateur=?");
			pre.setString(1,n.getDesignation());
			pre.setInt(2,n.getId());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteIdentificateur(int id) {
		
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("delete from typeidentificateur where ID_TypeIdentificateur=?");
			pre.setInt(1,id);
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
	}



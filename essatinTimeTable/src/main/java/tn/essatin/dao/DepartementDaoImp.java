package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.essatin.model.Departement;
import tn.essatin.singleton.SingletonConnection;

public class DepartementDaoImp implements IDepartementDao{

	@Override
	public List<Departement> getAllDepartements() {
		Connection cnx=SingletonConnection.getConnection();
		List<Departement> liste = new ArrayList<Departement>();
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from departement");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Departement d=new Departement();
				d.setId(res.getInt("ID_Departement"));
				d.setNom(res.getString("nom"));
				d.setDescription(res.getString("description"));
				d.setChefDepartement(res.getString("chefDepartement"));
				
				liste.add(d);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public Departement getDepartement(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Departement d=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from departement where ID_Departement=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 d=new Departement();
				    d.setId(res.getInt("ID_Departement"));
					d.setNom(res.getString("nom"));
					d.setDescription(res.getString("description"));
					d.setChefDepartement(res.getString("chefDepartement"));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}

	@Override
	public void addDepartement(Departement d) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("insert into departement values(null,?,?,?)");
			pre.setString(1,d.getNom());
			pre.setString(2,d.getDescription());
			pre.setString(3,d.getChefDepartement());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateDepartement(Departement d) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("update departement set nom=?,description=?,chefDepartement=? where ID_Departement=?");
			pre.setString(1,d.getNom());
			pre.setString(2,d.getDescription());
			pre.setString(3,d.getChefDepartement());
			pre.setInt(4,d.getId());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteDepartement(int id) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("delete from departement where ID_Departement=?");
			pre.setInt(1,id);
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

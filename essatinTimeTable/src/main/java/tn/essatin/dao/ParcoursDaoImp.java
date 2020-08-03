package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import tn.essatin.model.Parcours;
import tn.essatin.singleton.SingletonConnection;

public class ParcoursDaoImp implements IParcoursDao{

	@Override
	public List<Parcours> getAllParcourss() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parcours getParcours(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Parcours p=null;
		SpecialiteDaoImp dao=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from parcours where ID_Parcours=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 p=new Parcours();
				 dao =new SpecialiteDaoImp();
				p.setId(res.getInt("ID_Parcours"));
				p.setDesignation(res.getString("Designation"));
				p.setDescription(res.getString("Description"));
				p.setSpecialite(dao.getSpecialite(res.getInt("ID_Specialite")));
	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public void addParcours(Parcours p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateParcours(Parcours p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteParcours(int id) {
		// TODO Auto-generated method stub
		
	}

}

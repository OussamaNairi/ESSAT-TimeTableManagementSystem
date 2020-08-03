package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import tn.essatin.model.Niveau;
import tn.essatin.singleton.SingletonConnection;

public class NiveauDaoImp implements INiveauDao{

	@Override
	public List<Niveau> getAllNiveaus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Niveau getNiveau(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Niveau n=null;
		ParcoursDaoImp dao=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from niveau where ID_Niveau=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 n=new Niveau();
				 dao =new ParcoursDaoImp();
				n.setId(res.getInt("ID_Niveau"));
				n.setDesignation(res.getString("Designation"));
				n.setDescription(res.getString("Description"));
				n.setParcours(dao.getParcours(res.getInt("ID_Parcours")));
	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public void addNiveau(Niveau n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateNiveau(Niveau n) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteNiveau(int id) {
		// TODO Auto-generated method stub
		
	}

}

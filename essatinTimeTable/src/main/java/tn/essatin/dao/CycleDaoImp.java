package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import tn.essatin.model.Cycle;
import tn.essatin.singleton.SingletonConnection;

public class CycleDaoImp implements ICycleDao{

	@Override
	public List<Cycle> getAllCycles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cycle getCycle(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Cycle c=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from cycle where ID_Cycle=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 c=new Cycle();
				c.setId(res.getInt("ID_Cycle"));
				c.setDesignation(res.getString("Designation"));
				c.setDescription(res.getString("Description"));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public void addCycle(Cycle c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCycle(Cycle c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCycle(int id) {
		// TODO Auto-generated method stub
		
	}

}

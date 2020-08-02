package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import tn.essatin.model.Specialite;
import tn.essatin.model.TypeMatiere;
import tn.essatin.singleton.SingletonConnection;

public class SpecialiteDaoImp implements ISpecialiteDao{

	@Override
	public List<Specialite> getAllSpecialites() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Specialite getSpecialite(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Specialite s=null;
		CycleDaoImp dao=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from specialite where ID_Specialite=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 s=new Specialite();
				 dao =new CycleDaoImp();
				s.setId(res.getInt("ID_Specialite"));
				s.setDesignation(res.getString("Designation"));
				s.setDescription(res.getString("Description"));
				s.setCycle(dao.getCycle(res.getInt("ID_Cycle")));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	@Override
	public void addSpecialite(Specialite s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSpecialite(Specialite s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSpecialite(int id) {
		// TODO Auto-generated method stub
		
	}

}

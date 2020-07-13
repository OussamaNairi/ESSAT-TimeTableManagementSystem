package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import tn.essatin.model.Batiment;
import tn.essatin.model.Etage;
import tn.essatin.singleton.SingletonConnection;

public class BatimentDaoImp implements IBatimentDao{

	@Override
	public List<Batiment> getAllBatiments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Batiment getBatiment(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Batiment b=null;
		FaculteDaoImp dao1=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from batiment where ID_Batiment=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 b=new Batiment();
				 dao1 =new FaculteDaoImp();
				b.setId(res.getInt("ID_Batiment"));
				b.setNom(res.getString("nom"));
				b.setFac(dao1.getFaculte(res.getInt("ID_Faculte")));
		
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return b;
	}

	@Override
	public void addBatiment(Batiment b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBatiment(Batiment b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBatiment(int id) {
		// TODO Auto-generated method stub
		
	}

}

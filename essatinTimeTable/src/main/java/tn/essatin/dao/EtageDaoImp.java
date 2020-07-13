package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.essatin.model.Etage;
import tn.essatin.model.TypeSalle;
import tn.essatin.singleton.SingletonConnection;

public class EtageDaoImp implements IEtageDao{

	@Override
	public List<Etage> getAllEtages() {
		Connection cnx=SingletonConnection.getConnection();
		List<Etage> liste = new ArrayList<Etage>();
		BlocDaoImp dao1=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from etage");
			ResultSet res=pre.executeQuery();

			Etage e=new Etage();
			dao1 =new BlocDaoImp();
				e.setId(res.getInt("ID_Etage"));
				e.setNom(res.getString("nom"));
				e.setBloc(dao1.getBloc(res.getInt("ID_Bloc")));
				
				
				liste.add(e);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public Etage getEtage(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Etage e=null;
		BlocDaoImp dao1=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from etage where ID_Etage=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 e=new Etage();
				 dao1 =new BlocDaoImp();
				e.setId(res.getInt("ID_Etage"));
				e.setNom(res.getString("nom"));
				e.setBloc(dao1.getBloc(res.getInt("ID_Bloc")));
		
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}

	@Override
	public void addEtage(Etage e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEtage(Etage e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEtage(int id) {
		// TODO Auto-generated method stub
		
	}

}

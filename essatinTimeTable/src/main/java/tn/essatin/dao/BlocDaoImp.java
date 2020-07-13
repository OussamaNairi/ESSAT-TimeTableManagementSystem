package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.essatin.model.Bloc;

import tn.essatin.singleton.SingletonConnection;

public class BlocDaoImp implements IBlocDao{

	@Override
	public List<Bloc> getAllBlocs() {
		Connection cnx=SingletonConnection.getConnection();
		List<Bloc> liste = new ArrayList<Bloc>();
		BatimentDaoImp dao1=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from bloc");
			ResultSet res=pre.executeQuery();

			Bloc b=new Bloc();
			dao1 =new BatimentDaoImp();
				b.setId(res.getInt("ID_Bloc"));
				b.setNom(res.getString("nom"));
				b.setBat(dao1.getBatiment(res.getInt("ID_Batiment")));
				
				
				liste.add(b);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public Bloc getBloc(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Bloc b=null;
		BatimentDaoImp dao1=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from bloc where ID_Bloc=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 b=new Bloc();
				 dao1 =new BatimentDaoImp();
				b.setId(res.getInt("ID_Bloc"));
				b.setNom(res.getString("nom"));
				b.setBat(dao1.getBatiment(res.getInt("ID_Batiment")));
		
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return b;
	}

	@Override
	public void addBloc(Bloc b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBloc(Bloc b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBloc(int id) {
		// TODO Auto-generated method stub
		
	}

}

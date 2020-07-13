package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import tn.essatin.model.Salle;
import tn.essatin.singleton.SingletonConnection;

public class SalleDaoImp implements ISalleDao{

	@Override
	public List<Salle> getAllSalles() {
		Connection cnx=SingletonConnection.getConnection();
		EtageDaoImp dao2=null;
		TypeSalleDaoImp dao1=null;
		List<Salle> liste = new ArrayList<Salle>();
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from salle");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				dao2 =new EtageDaoImp();
				dao1 =new TypeSalleDaoImp();
				Salle s=new Salle();
				s.setId(res.getInt("ID_Salle"));
				s.setNom(res.getString("nom"));
				s.setCapacite(res.getInt("capacite"));
				s.setTypesalle(dao1.getTypeSalle(res.getInt("ID_TypeSalle")));
				s.setEtage(dao2.getEtage(res.getInt("ID_Etage")));
				
				liste.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public Salle getSalle(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSalle(Salle s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSalle(Salle s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSalle(int id) {
		// TODO Auto-generated method stub
		
	}

}

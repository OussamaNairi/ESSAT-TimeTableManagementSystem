package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.essatin.model.Semestre;
import tn.essatin.singleton.SingletonConnection;

public class SemestreDaoImp implements ISemestreDao{

	@Override
	public List<Semestre> getAllSemestres() {
		Connection cnx=SingletonConnection.getConnection();
		List<Semestre> liste = new ArrayList<Semestre>();
		SessionDaoImp dao=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from semestre");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Semestre s=new Semestre();
				 dao =new SessionDaoImp();
				s.setId(res.getInt("ID_Semestre"));
				s.setNom(res.getString("nom"));
				s.setSession(dao.getSession(res.getInt("ID_Session")));
				
				liste.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public Semestre getSemestre(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Semestre s=null;
		SessionDaoImp dao=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from semestre where ID_Semestre=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 s=new Semestre();
				 dao =new SessionDaoImp();
				s.setId(res.getInt("ID_Semestre"));
				s.setNom(res.getString("nom"));
				s.setSession(dao.getSession(res.getInt("ID_Session")));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	@Override
	public void addSemestre(Semestre s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSemestre(Semestre s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSemestre(int id) {
		// TODO Auto-generated method stub
		
	}

}

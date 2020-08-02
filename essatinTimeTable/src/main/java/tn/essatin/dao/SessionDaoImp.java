package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import tn.essatin.model.Session;
import tn.essatin.singleton.SingletonConnection;

public class SessionDaoImp implements ISessionDao{

	@Override
	public List<Session> getAllSessions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session getSession(int id) {
		Connection cnx=SingletonConnection.getConnection();
		Session s=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from session where ID_Session=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 s=new Session();
				s.setId(res.getInt("ID_Session"));
				s.setNom(res.getString("session"));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

	@Override
	public void addSession(Session s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSession(Session s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSession(int id) {
		// TODO Auto-generated method stub
		
	}

}

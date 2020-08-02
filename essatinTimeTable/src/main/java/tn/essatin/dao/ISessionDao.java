package tn.essatin.dao;

import java.util.List;


import tn.essatin.model.Session;

public interface ISessionDao {
	public List<Session> getAllSessions();
	public Session getSession(int id);
	public void addSession(Session s);
	public void updateSession(Session s);
	public void deleteSession(int id);

}

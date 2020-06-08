package tn.essatin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import tn.essatin.hibernate.HibernateUtil;
import tn.essatin.model.Semaine;

public class SemaineDaoImp implements ISemaineDao{

	Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public List<Semaine> getAllSemaines() {
		session.getTransaction().begin(); 
		Query<Semaine> query = session.createQuery("Select n from Semaine n ");
		List<Semaine> s = query.getResultList(); 
		session.getTransaction().commit();
		return s;
	}

	@Override
	public Semaine getSemaine(int id) {
		session.getTransaction().begin();    
		String sql = "Select s from Semaine s Where s.id = :id";           
		Query<Semaine> query = session.createQuery(sql); 
		query.setParameter("id", id); 
		Semaine s=query.getSingleResult();
		session.getTransaction().commit();
		return s; 
	}

	@Override
	public void addSemaine(Semaine s) {
		session.getTransaction().begin();
		session.save(s);  
		session.getTransaction().commit();
		
		
	}

	@Override
	public void updateSemaine(Semaine s) {
		session.getTransaction().begin(); 
		session.merge(s); 
		session.getTransaction().commit();
	}

	@Override
	public void deleteSemaine(int id) {
		
		Semaine s= this.getSemaine(id);
		session.getTransaction().begin();
		session.delete(s); 
	    session.getTransaction().commit();
		
	}
		
	}



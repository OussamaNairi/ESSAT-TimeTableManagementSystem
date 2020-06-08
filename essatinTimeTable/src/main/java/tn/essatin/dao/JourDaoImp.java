package tn.essatin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import tn.essatin.hibernate.HibernateUtil;
import tn.essatin.model.Jour;

public class JourDaoImp implements IJourDao{

	Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public List<Jour> getAllJours() {
		session.getTransaction().begin(); 
		Query<Jour> query = session.createQuery("Select j from Jour j ");
		List<Jour> j = query.getResultList(); 
		session.getTransaction().commit();
		return j;
	}

	@Override
	public Jour getJour(int id) {
		session.getTransaction().begin();    
		String sql = "Select j from Jour j Where j.id = :id";           
		Query<Jour> query = session.createQuery(sql); 
		query.setParameter("id", id); 
		Jour j=query.getSingleResult();
		session.getTransaction().commit();
		return j; 
	}

	@Override
	public void addJour(Jour j) {
		session.getTransaction().begin();
		session.save(j);  
		session.getTransaction().commit();
		
		
	}

	@Override
	public void updateJour(Jour j) {
		session.getTransaction().begin(); 
		session.merge(j); 
		session.getTransaction().commit();
	}

	@Override
	public void deleteJour(int id) {
		
		Jour j= this.getJour(id);
		session.getTransaction().begin();
		session.delete(j); 
	    session.getTransaction().commit();
		
	}
		
	}



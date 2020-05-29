package tn.essatin.dao;


import java.util.List;

import org.hibernate.Session;

import org.hibernate.query.Query;


import tn.essatin.hibernate.HibernateUtil;
import tn.essatin.model.Nationalite;

public class NationaliteDaoImp implements INationaliteDao{
	
	Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public List<Nationalite> getAllNationalites() {
		session.getTransaction().begin(); 
		Query<Nationalite> query = session.createQuery("Select n from Nationalite n ");
		List<Nationalite> n = query.getResultList(); 
		session.getTransaction().commit();
		return n;
	}

	@Override
	public Nationalite getNationalite(int id) {
		session.getTransaction().begin();    
		String sql = "Select n from Nationalite n Where n.id = :id";           
		Query<Nationalite> query = session.createQuery(sql); 
		query.setParameter("id", id); 
		Nationalite n=query.getSingleResult();
		session.getTransaction().commit();
		return n; 
	}

	@Override
	public void addNationalite(Nationalite n) {
		session.getTransaction().begin();
		session.save(n);  
		session.getTransaction().commit();
		
		
	}

	@Override
	public void updateNationalite(Nationalite n) {
		session.getTransaction().begin(); 
		session.merge(n); 
		session.getTransaction().commit();
	}

	@Override
	public void deleteNationalite(int id) {
		
		Nationalite n= this.getNationalite(id);
		session.getTransaction().begin();
		session.delete(n); 
	    session.getTransaction().commit();
		
	}
		
	}



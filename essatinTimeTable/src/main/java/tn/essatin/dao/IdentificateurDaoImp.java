package tn.essatin.dao;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.query.Query;


import tn.essatin.hibernate.HibernateUtil;
import tn.essatin.model.Identificateur;


public class IdentificateurDaoImp implements IIdentificateurDao{

	Session session = HibernateUtil.getSessionFactory().openSession();


	@Override
	public List<Identificateur> getAllIdentificateurs() {
		session.getTransaction().begin(); 
		Query<Identificateur> query = session.createQuery("Select i from Identificateur i ");
		List<Identificateur> i = query.getResultList(); 
		session.getTransaction().commit();
		return i;
	}

	@Override
	public Identificateur getIdentificateur(int id) {
		session.getTransaction().begin();    
		String sql = "Select i from Identificateur i Where i.id = :id";           
		Query<Identificateur> query = session.createQuery(sql); 
		query.setParameter("id", id); 
		Identificateur i=query.getSingleResult(); 
		session.getTransaction().commit();
		return i; 
	}

	@Override
	public void addIdentificateur(Identificateur i) {
		session.getTransaction().begin();
		session.save(i);  
		session.getTransaction().commit();
		
	}

	@Override
	public void updateIdentificateur(Identificateur i) {
		session.getTransaction().begin(); 
		session.merge(i); 
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteIdentificateur(int id) {
		Identificateur i= this.getIdentificateur(id);
		session.getTransaction().begin();
		session.delete(i); 
		session.getTransaction().commit();
		
	}

}

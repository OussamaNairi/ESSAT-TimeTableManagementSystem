package tn.essatin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import tn.essatin.hibernate.HibernateUtil;
import tn.essatin.model.Personne;

public class PersonneDaoImp implements IPersonneDao{
	
	Session session = HibernateUtil.getSessionFactory().openSession();


	@Override
	public List<Personne> getAllPersonnes() {
		session.getTransaction().begin(); 
		Query<Personne> query = session.createQuery("Select p from Personne p ");
		List<Personne> p = query.getResultList(); 
		session.getTransaction().commit();
		return p;
	}

	@Override
	public Personne getPersonne(int id) {
		session.getTransaction().begin();    
		String sql = "Select p from Personne p Where p.id = :id";           
		Query<Personne> query = session.createQuery(sql); 
		query.setParameter("id", id); 
		Personne p=query.getSingleResult();
		session.getTransaction().commit();
		return p; 
	}

	@Override
	public void addPersonne(Personne p) {
		session.getTransaction().begin();
		session.save(p);  
		session.getTransaction().commit();
		
	}

	@Override
	public void updatePersonne(Personne p) {
		session.getTransaction().begin(); 
		session.merge(p); 
		session.getTransaction().commit();
		
	}

	@Override
	public void deletePersonne(int id) {
		Personne p= this.getPersonne(id);
		session.getTransaction().begin();
		session.delete(p); 
	    session.getTransaction().commit();
		
	}

}

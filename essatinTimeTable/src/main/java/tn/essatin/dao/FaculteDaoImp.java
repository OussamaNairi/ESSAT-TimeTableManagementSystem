package tn.essatin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import tn.essatin.hibernate.HibernateUtil;
import tn.essatin.model.Faculte;



public class FaculteDaoImp implements IFaculteDao{
	Session session = HibernateUtil.getSessionFactory().openSession();
	@Override
	public List<Faculte> getAllFacultes() {
		session.getTransaction().begin(); 
		Query<Faculte> query = session.createQuery("Select f from Faculte f ");
		List<Faculte> f = query.getResultList(); 
		session.getTransaction().commit();
		return f;
	}

	@Override
	public Faculte getFaculte(int id) {
		session.getTransaction().begin();    
		String sql = "Select f from Faculte f Where f.id = :id";           
		Query<Faculte> query = session.createQuery(sql); 
		query.setParameter("id", id); 
		Faculte f=query.getSingleResult();
		session.getTransaction().commit();
		return f; 
	}

	@Override
	public void addFaculte(Faculte f) {
		session.getTransaction().begin();
		session.save(f);  
		session.getTransaction().commit();
		
	}

	@Override
	public void updateFaculte(Faculte f) {
		session.getTransaction().begin(); 
		session.merge(f); 
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteFaculte(int id) {
		Faculte f= this.getFaculte(id);
		session.getTransaction().begin();
		session.delete(f); 
	    session.getTransaction().commit();
		
	}

}

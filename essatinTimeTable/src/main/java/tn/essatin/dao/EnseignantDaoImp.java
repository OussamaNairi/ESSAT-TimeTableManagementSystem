package tn.essatin.dao;


import java.util.List;

import org.hibernate.Session;

import org.hibernate.query.Query;


import tn.essatin.hibernate.HibernateUtil;
import tn.essatin.model.Enseignant;




public class EnseignantDaoImp implements IEnseignantDao{
	
	Session session = HibernateUtil.getSessionFactory().openSession();


	@Override
	public List<Enseignant> getAllEnseignants() {
		session.getTransaction().begin(); 
		Query<Enseignant> query =session.createQuery("Select e from Enseignant e ");
		List<Enseignant> e = query.getResultList(); 
		session.getTransaction().commit();
		return e;
	}

	@Override
	public Enseignant getEnseignant(int id) {
		session.getTransaction().begin();    
		String sql = "Select e from Enseignant e Where e.id = :id";           
		Query<Enseignant> query = session.createQuery(sql); 
		query.setParameter("id", id); 
		Enseignant e=query.getSingleResult(); 
		session.getTransaction().commit();
		return e; 
	}

	@Override
	public void addEnseignant(Enseignant e) {
		session.getTransaction().begin();
		session.save(e);  
		session.getTransaction().commit();
		
	}

	@Override
	public void updateEnseignant(Enseignant e) {
		session.getTransaction().begin(); 
		session.merge(e); 
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteEnseignant(int id) {
		Enseignant e= this.getEnseignant(id);
		session.getTransaction().begin();
		session.delete(e); 
	    session.getTransaction().commit();
		
	}

}

package tn.essatin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import tn.essatin.hibernate.HibernateUtil;
import tn.essatin.model.Etudiant;


public class EtudiantDaoImp implements IEtudiantDao{

	Session session = HibernateUtil.getSessionFactory().openSession();

	@Override
	public List<Etudiant> getAllEtudiants() {
		session.getTransaction().begin(); 
		Query<Etudiant> query = session.createQuery("Select e from Etudiant e ");
		List<Etudiant> e = query.getResultList(); 
		session.getTransaction().commit();
		return e;
	}

	@Override
	public Etudiant getEtudiant(int id) {
		session.getTransaction().begin();    
		String sql = "Select e from Etudiant e Where e.id = :id";           
		Query<Etudiant> query = session.createQuery(sql); 
		query.setParameter("id", id); 
		Etudiant e=query.getSingleResult(); 
		session.getTransaction().commit();
		return e; 
	}

	@Override
	public void addEtudiant(Etudiant e) {
		session.getTransaction().begin();
		session.save(e);  
		session.getTransaction().commit();
		
	}

	@Override
	public void updateEtudiant(Etudiant e) {
		session.getTransaction().begin(); 
		session.merge(e); 
		session.getTransaction().commit();
	}

	@Override
	public void deleteEtudiant(int id) {
		Etudiant e= this.getEtudiant(id);
		session.getTransaction().begin();
		session.delete(e); 
		session.getTransaction().commit();
		
	}

}

package tn.essatin.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import tn.essatin.model.Enseignant;



public class EnseignantDaoImp implements IEnseignantDao{
	
	Session session; 
	public EnseignantDaoImp() {      
		SessionFactory sessionFactory ;  
	ServiceRegistry serviceRegistry =  new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build(); 
	Metadata metadata =  new MetadataSources(serviceRegistry).getMetadataBuilder().build(); sessionFactory=metadata.getSessionFactoryBuilder().build();  
	this.session=sessionFactory.openSession(); 
	}

	@Override
	public List<Enseignant> getAllEnseignants() {
		Query<Enseignant> query = this.session.createQuery("Select e from Enseignant e ");
		List<Enseignant> e = query.getResultList(); 
		return e;
	}

	@Override
	public Enseignant getEnseignant(int id) {
		this.session.getTransaction().begin();    
		String sql = "Select e from Enseignant e Where e.id = :id";           
		Query<Enseignant> query = this.session.createQuery(sql); 
		query.setParameter("id", id); 
		Enseignant e=query.getSingleResult(); this.session.getTransaction().commit();
		return e; 
	}

	@Override
	public void addEnseignant(Enseignant e) {
		this.session.getTransaction().begin();
		this.session.save(e);  
		this.session.getTransaction().commit();
		
	}

	@Override
	public void updateEnseignant(Enseignant e) {
		this.session.getTransaction().begin(); 
		this.session.merge(e); 
		this.session.getTransaction().commit();
		
	}

	@Override
	public void deleteEnseignant(int id) {
		Enseignant e= this.getEnseignant(id);
		this.session.getTransaction().begin();
		this.session.delete(e); 
		this.session.getTransaction().commit();
		
	}

}

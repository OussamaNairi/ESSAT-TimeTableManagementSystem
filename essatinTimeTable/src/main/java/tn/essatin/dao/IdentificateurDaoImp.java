package tn.essatin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import tn.essatin.model.Identificateur;
import tn.essatin.model.Nationalite;

public class IdentificateurDaoImp implements IIdentificateurDao{

	
	Session session; 
	public IdentificateurDaoImp() {      
		SessionFactory sessionFactory ;  
	ServiceRegistry serviceRegistry =  new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build(); 
	Metadata metadata =  new MetadataSources(serviceRegistry).getMetadataBuilder().build(); sessionFactory=metadata.getSessionFactoryBuilder().build();  
	this.session=sessionFactory.openSession(); 
	}

	@Override
	public List<Identificateur> getAllIdentificateurs() {
		Query<Identificateur> query = this.session.createQuery("Select i from Identificateur i ");
		List<Identificateur> i = query.getResultList(); 
		return i;
	}

	@Override
	public Identificateur getIdentificateur(int id) {
		this.session.getTransaction().begin();    
		String sql = "Select i from Identificateur i Where i.id = :id";           
		Query<Identificateur> query = this.session.createQuery(sql); 
		query.setParameter("id", id); 
		Identificateur i=query.getSingleResult(); 
		this.session.getTransaction().commit();
		return i; 
	}

	@Override
	public void addIdentificateur(Identificateur i) {
		this.session.getTransaction().begin();
		this.session.save(i);  
		this.session.getTransaction().commit();
		
	}

	@Override
	public void updateIdentificateur(Identificateur i) {
		this.session.getTransaction().begin(); 
		this.session.merge(i); 
		this.session.getTransaction().commit();
		
	}

	@Override
	public void deleteIdentificateur(int id) {
		Identificateur i= this.getIdentificateur(id);
		this.session.getTransaction().begin();
		this.session.delete(i); 
		this.session.getTransaction().commit();
		
	}

}

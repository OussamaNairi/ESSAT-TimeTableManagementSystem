package tn.essatin.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import tn.essatin.model.Nationalite;

public class NationaliteDaoImp implements INationaliteDao{
	
	Session session; 
	public NationaliteDaoImp() {      
		SessionFactory sessionFactory ;  
	ServiceRegistry serviceRegistry =  new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build(); 
	Metadata metadata =  new MetadataSources(serviceRegistry).getMetadataBuilder().build(); sessionFactory=metadata.getSessionFactoryBuilder().build();  
	this.session=sessionFactory.openSession(); 
	}

	@Override
	public List<Nationalite> getAllNationalites() {
		Query<Nationalite> query = this.session.createQuery("Select n from Nationalite n ");
		List<Nationalite> n = query.getResultList(); 
		return n;
	}

	@Override
	public Nationalite getNationalite(int id) {
		this.session.getTransaction().begin();    
		String sql = "Select n from Nationalite n Where n.id = :id";           
		Query<Nationalite> query = this.session.createQuery(sql); 
		query.setParameter("id", id); 
		Nationalite n=query.getSingleResult();
		this.session.getTransaction().commit();
		return n; 
	}

	@Override
	public void addNationalite(Nationalite n) {
		this.session.getTransaction().begin();
		this.session.save(n);  
		this.session.getTransaction().commit();
		
		
	}

	@Override
	public void updateNationalite(Nationalite n) {
		this.session.getTransaction().begin(); 
		this.session.merge(n); 
		this.session.getTransaction().commit();
	}

	@Override
	public void deleteNationalite(int id) {
		Nationalite n= this.getNationalite(id);
		this.session.getTransaction().begin();
		this.session.delete(n); 
		this.session.getTransaction().commit();
		
	}
		
	}



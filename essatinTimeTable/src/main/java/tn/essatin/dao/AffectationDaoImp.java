package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.essatin.model.Affectation;

import tn.essatin.singleton.SingletonConnection;

public class AffectationDaoImp implements IAffectationDao{

	@Override
	public List<Affectation> getAllAffectations() {
		Connection cnx=SingletonConnection.getConnection();
		List<Affectation> liste = new ArrayList<Affectation>();
		
		ChargeHoraireDaoImp dao1=null;
		EnseignantDaoImp dao2=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from enseignantmatiereaffectation");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Affectation a=new Affectation();
				
				 dao1 =new ChargeHoraireDaoImp();
				 dao2 =new EnseignantDaoImp();
				a.setId(res.getInt("ID_enseignantMatiereAffectation"));
				a.setEnseignant(dao2.getEnseignant(res.getInt("ID_Enseignant")));
				a.setChargeHoraire(dao1.getChargeHoraire(res.getInt("ID_ChargeHoraire")));
				
				liste.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public Affectation getAffectation(int id) {
		Connection cnx=SingletonConnection.getConnection();
		
		ChargeHoraireDaoImp dao1=null;
		EnseignantDaoImp dao2=null;
		Affectation a=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from enseignantmatiereaffectation where ID_enseignantMatiereAffectation=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
			 a=new Affectation();
				
				 dao1 =new ChargeHoraireDaoImp();
				 dao2 =new EnseignantDaoImp();
				a.setId(res.getInt("ID_enseignantMatiereAffectation"));
				a.setEnseignant(dao2.getEnseignant(res.getInt("ID_Enseignant")));
				a.setChargeHoraire(dao1.getChargeHoraire(res.getInt("ID_ChargeHoraire")));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public void addAffectation(Affectation a) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("insert into enseignantmatiereaffectation values(null,?,?)");
			pre.setInt(1,a.getEnseignant().getId());
			pre.setInt(2,a.getChargeHoraire().getId());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateAffectation(Affectation a) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("update enseignantmatiereaffectation set ID_Enseignant=? , ID_ChargeHoraire=? where ID_enseignantMatiereAffectation=?");
			pre.setInt(1,a.getEnseignant().getId());
			pre.setInt(2,a.getChargeHoraire().getId());
			pre.setInt(3,a.getId());
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteAffectation(int id) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("delete from enseignantmatiereaffectation where ID_enseignantMatiereAffectation=?");
			pre.setInt(1,id);
			pre.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

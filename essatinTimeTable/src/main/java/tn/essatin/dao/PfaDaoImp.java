package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.essatin.model.Pfa;

import tn.essatin.singleton.SingletonConnection;

public class PfaDaoImp implements IPfaDao{

	@Override
	public List<Pfa> getAllPfas() {
		Connection cnx=SingletonConnection.getConnection();
		List<Pfa> liste = new ArrayList<Pfa>();
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from pfa");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Pfa p=new Pfa();
				IEnseignantDao dao=new EnseignantDaoImp();
				IDepartementDao dao1=new DepartementDaoImp();
				p.setId(res.getInt("ID_Pfa"));
				p.setTitre(res.getString("titre"));
				p.setDescription(res.getString("description"));
				p.setMotCle(res.getString("motCle"));
				p.setTechnologie(res.getString("technologie"));
				p.setIdenseignant(dao.getEnseignant(res.getInt("ID_enseignant")));
				p.setIdepartement(dao1.getDepartement(res.getInt("ID_Departement")));
				liste.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public Pfa getPfa(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPfa(Pfa p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePfa(Pfa p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePfa(int id) {
		// TODO Auto-generated method stub
		
	}

}
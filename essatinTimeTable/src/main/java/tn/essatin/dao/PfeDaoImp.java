package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import tn.essatin.model.Pfe;
import tn.essatin.singleton.SingletonConnection;

public class PfeDaoImp implements IPfeDao{

	@Override
	public List<Pfe> getAllPfes() {
		Connection cnx=SingletonConnection.getConnection();
		List<Pfe> liste = new ArrayList<Pfe>();
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from pfe");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Pfe p=new Pfe();
				p.setId(res.getInt("ID_Pfe"));
				p.setTitre(res.getString("titre"));
				p.setDescription(res.getString("description"));
				p.setMotCle(res.getString("motCle"));
				p.setTechnologie(res.getString("technologie"));
				p.setDateDebut(res.getString("dateDebut"));
				p.setDateFin(res.getString("dateFin"));
				p.setProjetExterne(res.getBoolean("projetExterne"));
				p.setNomSociete(res.getString("nomSociete"));
				liste.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public Pfe getPfe(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPfe(Pfe p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePfe(Pfe p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePfe(int id) {
		// TODO Auto-generated method stub
		
	}

}

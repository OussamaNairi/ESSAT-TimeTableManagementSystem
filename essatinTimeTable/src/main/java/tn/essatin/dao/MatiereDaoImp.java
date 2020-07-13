package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.essatin.model.Matiere;
import tn.essatin.model.Nationalite;
import tn.essatin.singleton.SingletonConnection;

public class MatiereDaoImp implements IMatiereDao{

	@Override
	public List<Matiere> getAllMatieres() {
		Connection cnx=SingletonConnection.getConnection();
		List<Matiere> liste = new ArrayList<Matiere>();
		TypeMatiereDaoImp dao=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from matiere");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Matiere m=new Matiere();
				 dao =new TypeMatiereDaoImp();
				m.setId(res.getInt("ID_Matiere"));
				m.setNom(res.getString("nom"));
				m.setCoefficient(res.getInt("coefficient"));
				m.setVolumeHoraire(res.getInt("volumeHoraire"));
				m.setTypeMatiere(dao.getTypeMatiere(res.getInt("ID_TypeMatiere")));
				
				liste.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public Matiere getMatiere(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMatiere(Matiere d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMatiere(Matiere d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMatiere(int id) {
		// TODO Auto-generated method stub
		
	}

}

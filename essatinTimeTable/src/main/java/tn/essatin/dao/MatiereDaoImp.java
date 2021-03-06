package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import tn.essatin.model.Matiere;
import tn.essatin.singleton.SingletonConnection;

public class MatiereDaoImp implements IMatiereDao{

	@Override
	public List<Matiere> getAllMatieres() {
		Connection cnx=SingletonConnection.getConnection();
		List<Matiere> liste = new ArrayList<Matiere>();
		TypeMatiereDaoImp dao=null;
		SemestreDaoImp dao1=null;
		NiveauDaoImp dao2=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from matiere");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				Matiere m=new Matiere();
				 dao =new TypeMatiereDaoImp();
				 dao1 =new SemestreDaoImp();
				 dao2 =new NiveauDaoImp();
				m.setId(res.getInt("ID_Matiere"));
				m.setNom(res.getString("nom"));
				m.setCoefficient(res.getInt("coefficient"));
				m.setVolumeHoraire(res.getInt("volumeHoraire"));
				m.setTypeMatiere(dao.getTypeMatiere(res.getInt("ID_TypeMatiere")));
				m.setNiveau(dao2.getNiveau(res.getInt("ID_Niveau")));
				m.setSemestre(dao1.getSemestre(res.getInt("ID_Semestre")));
				
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
		Connection cnx=SingletonConnection.getConnection();
		Matiere m=null;
		TypeMatiereDaoImp dao=null;
		SemestreDaoImp dao1=null;
		NiveauDaoImp dao2=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from matiere where ID_Matiere=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 m=new Matiere();
				 dao =new TypeMatiereDaoImp();
				 dao1 =new SemestreDaoImp();
				 dao2 =new NiveauDaoImp();
				m.setId(res.getInt("ID_Matiere"));
				m.setNom(res.getString("nom"));
				m.setCoefficient(res.getInt("coefficient"));
				m.setVolumeHoraire(res.getInt("volumeHoraire"));
				m.setTypeMatiere(dao.getTypeMatiere(res.getInt("ID_TypeMatiere")));
				m.setNiveau(dao2.getNiveau(res.getInt("ID_Niveau")));
				m.setSemestre(dao1.getSemestre(res.getInt("ID_Semestre")));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public void addMatiere(Matiere d) {
		Connection cnx=SingletonConnection.getConnection();
		try {
			PreparedStatement pre=cnx.prepareStatement("insert into matiere values(null,?,?,?,?,?,?)");
			pre.setString(1,d.getNom());
			pre.setInt(2,d.getCoefficient());
			pre.setInt(3,d.getVolumeHoraire());
			pre.setInt(4,d.getTypeMatiere().getId());
			pre.setInt(5,d.getNiveau().getId());
			pre.setInt(6,d.getSemestre().getId());
			pre.executeUpdate();
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
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

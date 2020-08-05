package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import tn.essatin.model.ChargeHoraire;

import tn.essatin.singleton.SingletonConnection;

public class ChargeHoraireDaoImp implements IChargeHoraireDao{

	@Override
	public List<ChargeHoraire> getAllChargeHoraires() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChargeHoraire getChargeHoraire(int id) {
		Connection cnx=SingletonConnection.getConnection();
		ChargeHoraire c=null;
		TypeMatiereDaoImp dao=null;
		MatiereDaoImp dao1=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from chargehoraire where ID_chargeHoraire=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 c=new ChargeHoraire();
				 dao =new TypeMatiereDaoImp();
				 dao1 =new MatiereDaoImp();
				c.setId(res.getInt("ID_chargeHoraire"));
				c.setNom(res.getString("nom"));
				c.setValeur(res.getInt("valeur"));
				c.setTypematiere(dao.getTypeMatiere(res.getInt("ID_TypeMatiere")));
				c.setMatiere(dao1.getMatiere(res.getInt("ID_Matiere")));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public void addChargeHoraire(ChargeHoraire c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateChargeHoraire(ChargeHoraire c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteChargeHoraire(int id) {
		// TODO Auto-generated method stub
		
	}

}

package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.essatin.model.TypeMatiere;
import tn.essatin.model.TypeSalle;
import tn.essatin.singleton.SingletonConnection;

public class TypeSalleDaoImp implements ITypeSalleDao{

	@Override
	public List<TypeSalle> getAllTypeSalles() {
		Connection cnx=SingletonConnection.getConnection();
		List<TypeSalle> liste = new ArrayList<TypeSalle>();
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from typeSalle");
			ResultSet res=pre.executeQuery();

				TypeSalle t=new TypeSalle();
				t.setId(res.getInt("ID_TypeSalle"));
				t.setNom(res.getString("nom"));
				
				
				liste.add(t);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public TypeSalle getTypeSalle(int id) {
		Connection cnx=SingletonConnection.getConnection();
		TypeSalle t=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from typeSalle where ID_TypeSalle=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 t=new TypeSalle();
				t.setId(res.getInt("ID_TypeSalle"));
				t.setNom(res.getString("nom"));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public void addTypeSalle(TypeSalle t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTypeSalle(TypeSalle t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTypeSalle(int id) {
		// TODO Auto-generated method stub
		
	}

}

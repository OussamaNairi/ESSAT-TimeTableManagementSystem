package tn.essatin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tn.essatin.model.Nationalite;
import tn.essatin.model.TypeMatiere;
import tn.essatin.singleton.SingletonConnection;

public class TypeMatiereDaoImp implements ITypeMatiereDao{

	@Override
	public List<TypeMatiere> getAllTypeMatieres() {
		Connection cnx=SingletonConnection.getConnection();
		List<TypeMatiere> liste = new ArrayList<TypeMatiere>();
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from typeMatiere");
			ResultSet res=pre.executeQuery();
			while(res.next()) {
				TypeMatiere t=new TypeMatiere();
				t.setId(res.getInt("ID_typeMatiere"));
				t.setNom(res.getString("nom"));
				
				liste.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public TypeMatiere getTypeMatiere(int id) {
		Connection cnx=SingletonConnection.getConnection();
		TypeMatiere t=null;
		try {
			PreparedStatement pre=cnx.prepareStatement("select * from typeMatiere where ID_typeMatiere=?");
			pre.setInt(1,id);
			ResultSet res=pre.executeQuery();
			if(res.next()) {
				 t=new TypeMatiere();
				t.setId(res.getInt("ID_typeMatiere"));
				t.setNom(res.getString("nom"));
		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
		
	}

	@Override
	public void addTypeMatiere(TypeMatiere d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTypeMatiere(TypeMatiere d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTypeMatiere(int id) {
		// TODO Auto-generated method stub
		
	}

}

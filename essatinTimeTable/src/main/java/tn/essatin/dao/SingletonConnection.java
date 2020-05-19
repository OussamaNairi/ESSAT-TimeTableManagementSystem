package tn.essatin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
	private static Connection connection;
    static {
    	
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/essatttms","root","");	
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    	public static Connection getConnection() {
    		try {
				if (connection != null  && connection.isValid(800))
				return connection;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		return connection;
    	}

}

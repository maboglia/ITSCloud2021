package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

	private Connection conn;
	
	private final String URL = "jdbc:mysql://localhost:3306/cloud2021";
	private final String USER = "root";
	private final String PASS = "";
	
//	private DB() {}
	
	private void connetti() {
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {
	
		if (conn==null) {
			connetti();
		}
		
		return conn;
	}
	
	public static void main(String[] args) {
		DB db = new DB();
		db.getConn();
		System.out.println("funziona");
	}
}

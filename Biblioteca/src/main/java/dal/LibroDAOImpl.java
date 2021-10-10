package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Libro;

public class LibroDAOImpl implements LibroDAO {

	private DB db = new DB();
	private Statement stat;
	private ResultSet rs;
	
	
	@Override
	public List<Libro> findAll() {
		List<Libro> libri = new ArrayList<Libro>();

		try {
			stat = db.getConn().createStatement();
			rs = stat.executeQuery(TROVA_TUTTI);
			
			while (rs.next()) {
				Libro l = new Libro();
				l.setId(rs.getInt("id"));
				l.setTitolo(rs.getString("titolo"));
				libri.add(l);
			}
			
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
		return libri;
	}

}




package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Libro;

public class LibroDAOImpl implements LibroDAO {

	private DB db = new DB();
	private Statement stat;
	private ResultSet rs;
	
	
	@Override
	public List<Libro> findAll() {
		List<Libro> libri = new ArrayList<>();
		try {
			stat = db.getConn().createStatement();//creo lo statement x memorizzare la query
			rs = stat.executeQuery(TUTTI_LIBRI);//eseguo la query e salvo in un RS
			
			while(rs.next()) {
				Libro l = new Libro();
				l.setId(rs.getInt("id"));
				l.setTitolo(rs.getString("titolo"));
				l.setAutori(rs.getString("autori"));
				l.setPrezzo(rs.getDouble("prezzo"));
				l.setCopie(rs.getInt("copie"));
				libri.add(l);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return libri;
	}

}

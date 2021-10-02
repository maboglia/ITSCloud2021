package dal;

import java.util.List;

import model.Libro;

public interface LibroDAO {

	String TUTTI_LIBRI = "SELECT * FROM libri";
	
	List<Libro> findAll();
	
	
}

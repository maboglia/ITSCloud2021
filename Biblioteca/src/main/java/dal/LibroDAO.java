package dal;

import java.util.List;

import entities.Libro;

public interface LibroDAO {

	String TROVA_TUTTI = "SELECT id, titolo from libri";
	
	List<Libro> findAll();
	
}

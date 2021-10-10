package service;

import java.util.Set;
import java.util.TreeSet;

import dal.LibroDAO;
import dal.LibroDAOImpl;
import entities.Libro;

public class LibroService {

	private LibroDAO ld = new LibroDAOImpl();
	
	public Set<String> getTitoli(){
		Set<String> titoli = new TreeSet<String>();
		
		for (Libro l : ld.findAll()) {
			titoli.add(l.getTitolo());
		}
		
		return titoli;
	}
	
}

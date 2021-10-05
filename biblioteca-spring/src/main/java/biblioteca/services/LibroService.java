package biblioteca.services;

import java.util.List;

import biblioteca.entities.Libro;

public interface LibroService {

	List<Libro> trovaTutti();
	Libro trovaUno(int id);
	Libro addLibro(Libro l);
}

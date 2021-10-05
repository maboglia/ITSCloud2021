package biblioteca.services;

import java.util.List;

import biblioteca.entities.Autore;

public interface AutoreService {

	List<Autore> getAutori();
	Autore getAutoreById(int id);
	List<Autore> getAutoreByName(String nome);

}

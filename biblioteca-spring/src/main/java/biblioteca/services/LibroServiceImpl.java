package biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblioteca.entities.Libro;
import biblioteca.repos.LibroDAO;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroDAO repo;
	
	@Override
	public List<Libro> trovaTutti() {
		
		return repo.findAll();
	}

	@Override
	public Libro trovaUno(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Libro addLibro(Libro l) {
		// TODO Auto-generated method stub
		return repo.save(l);
	}

}

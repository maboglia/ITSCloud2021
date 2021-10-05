package biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblioteca.entities.Autore;
import biblioteca.repos.AutoreDAO;

@Service
public class AutoreServiceImpl implements AutoreService {

	@Autowired
	private AutoreDAO ad;
	
	@Override
	public List<Autore> getAutori() {
		return ad.findAll();
	}

	@Override
	public Autore getAutoreById(int id) {
		return ad.findById(id).get();
	}

	@Override
	public List<Autore> getAutoreByName(String nome) {
		return ad.findByNome(nome);
	}

}

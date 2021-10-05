package biblioteca.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.entities.Autore;

public interface AutoreDAO extends JpaRepository<Autore, Integer> {
	
	List<Autore> findByNome(String nome);
}

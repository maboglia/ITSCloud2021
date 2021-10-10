package biblioteca.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer> {

}

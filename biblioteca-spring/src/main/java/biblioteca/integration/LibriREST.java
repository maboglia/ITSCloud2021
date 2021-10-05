package biblioteca.integration;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.entities.Libro;
import biblioteca.services.LibroService;

@RestController
@RequestMapping("/api/libri")
public class LibriREST {

	@Autowired
	private LibroService ls;
	
	@GetMapping("")
	List<Libro> getLibri(){
		
		List<Libro> trovaTutti = ls.trovaTutti();
		Collections.sort(trovaTutti);
		return trovaTutti;
	}
	
		
	@GetMapping("/prezzo")
	List<Libro> getLibriPerPrezzo(){

		List<Libro> trovaTutti = ls.trovaTutti();
		
		Collections.sort(trovaTutti, (libro1, libro2)-> {
			if (libro1.getPrezzo()-libro2.getPrezzo() == 0) {
				return 0;
			} 
			if (libro1.getPrezzo()-libro2.getPrezzo() > 0){
				return 1;
			}
			return -1;
	});
		return trovaTutti;
	}
	
	@GetMapping("/autore")
	List<Libro> getLibriSortAutore(){
		List<Libro> libri = ls.trovaTutti();
		Collections.sort(libri, (l1, l2) -> l1.getAutori().compareTo(l2.getAutori()));
		return libri;
	}
	
	@GetMapping("/{id}")
	Libro getLibro(@PathVariable int id) {
		return ls.trovaUno(id);
	}
	
	@PostMapping("")
	Libro addLibro(Libro arg) {
		Libro l = ls.addLibro(arg);
		return l;
	}
	
}

package biblioteca.integration;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.entities.Autore;
import biblioteca.services.AutoreService;

@RestController
@RequestMapping("/api/autori")
public class AutoreREST {

	@Autowired
	private AutoreService as;
	
	@GetMapping("")
	public List<Autore> getAutori(){
		return as.getAutori();
	}
	
	@GetMapping("/search/{iniziale}")
	public List<Autore> getAutori(@PathVariable String iniziale){
		
		List<Autore> autori = as.getAutori();	
		
		
		
		return autori
				.stream()
				.filter(a -> a.getNome().toUpperCase().startsWith(iniziale.toUpperCase()))
				.collect(Collectors.toList());
	}
	
	
	
	
	
	
}

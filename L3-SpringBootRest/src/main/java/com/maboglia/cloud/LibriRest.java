package com.maboglia.cloud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LibriRest {

	@Autowired
	private LibriDAO repo;
	
	@GetMapping("/books")
	public List<Libro> getLibri(){
		return repo.findAll();
	}
	
	@GetMapping("/books/{id}")
	public Libro getLibro(@PathVariable int id){
		System.out.println(id);
		return repo.findById(id).get();
	}
	
	
	
	
}

package controller;

import java.util.ArrayList;
import java.util.List;

import model.Libro;

public class LibriCtrl {

	private List<Libro> libri = new ArrayList<>();
	
	{
		Libro l = new Libro();
		l.setTitolo("Io, robot");
		addLibro(l);
	}
	
	public void addLibro(Libro l) {
		libri.add(l);
	}
	
	public List<Libro> getLibri() {
		return libri;
	}
	
}

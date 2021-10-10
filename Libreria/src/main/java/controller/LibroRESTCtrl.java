package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.LibroDAO;
import dal.LibroDAOImpl;
import model.Libro;

/**
 * Servlet implementation class LibroRESTCtrl
 */
@WebServlet("/libri")
public class LibroRESTCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibroRESTCtrl() {
        super();
        System.out.println("Generata servlet ... ");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hai chiamato via GET");
		
		LibroDAO ld = new LibroDAOImpl();
		//ld.findAll().forEach(l -> System.out.println(l));	
		List<Libro> libri = ld.findAll();
		
		response.setContentType("application/json");
		response.getWriter().append("[");
		for (Libro libro : libri) {
			response
				.getWriter()
				.append("{\"titolo\":\""+libro.getTitolo()+"\"},");			
		}
		
		response.getWriter().append("]");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package ec.edu.ups.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.ComidaDAO;
import ec.edu.ups.dao.DAOFactory;

import ec.edu.ups.entidades.Comida;

/**
 * Servlet implementation class MandaComida
 */
@WebServlet("/MandaComida")
public class MandaComida extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ComidaDAO comidaDao;
	private List<Comida> listaTelefono;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MandaComida() {
        super();
        // TODO Auto-generated constructor stub
        comidaDao = DAOFactory.getFactory().getComidaDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	
		}	//RequestDispatcher dispatcher = request.getRequestDispatcher("Editar.jsp");
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Comida t= Comida.getInstance();
		List<Comida>prueba= comidaDao.findAll();
		System.out.println("PRUEBAAAA"+prueba);
		t.setNombre(prueba.get(0).getNombre());
		t.setPrecio(prueba.get(0).getPrecio());
        response.sendRedirect("/Publica/ListaTelefono.jsp");
        System.out.println("tama;o"+listaTelefono.size());
		System.out.println("vinooooo");
		request.setAttribute("comida", listaTelefono);	
		getServletContext().getRequestDispatcher("/Publica/ListaTelefono.jsp").forward(request, response);	
		//request.setAttribute("telefono", numEntero);	

	}
}
package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class ControlaRegistrar
 */
@WebServlet("/ControlaRegistrar")
public class ControlaRegistrar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ControladorParametros control;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControlaRegistrar() {
		super();
		// TODO Auto-generated constructor stub
		ControladorParametros control = null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		HttpSession session = null;
		doGet(request, response);

		control = new ControladorParametros();
		String url = "";
		url = "/Publica/Registrarse.jsp";
		//UsuarioDao usuarioDAO = new UsuarioDao();


		boolean ci = false;
		boolean no = false;
		boolean ap = false;
		boolean co = false;
		boolean pa = false;
		boolean paw = false;
		boolean iguales = false;



		String cedula = request.getParameter("cedula");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String correo = request.getParameter("correo");
		String pass = request.getParameter("contra");


		String validacionesCedula = "";
		String validacionesNombre = "";
		String validacionesApellido = "";
		String validacionesCorreo = "";
		String validacionesPassw = "";	


		if(cedula.equals("")) 
			validacionesCedula += "La cedula esta vacia";
		else {
			if (control.validadorDeCedula(cedula)){
				ci = true;
			}else
				validacionesCedula += "Ingrese cedula correcta";
		}


		if(nombre.equals("")) 
			validacionesNombre += "Celda Vacia";
		else {
			if(control.validarTexto(nombre)) {
				no = true;
			}else {

				validacionesNombre += "Ingrese solo letras";


			}


		}




		if(apellido.equals("")) 
			validacionesApellido += "El apellido esta vacio";
		else {
			if(control.validarTexto(apellido)) {
				ap = true;
			}else {

				validacionesApellido += "Ingrese solo letras";

			}


		}

		if(correo.equals("")) 
			validacionesCorreo += "El correo esta vacio";
		else{
			co = true;

		}

		if(pass.equals("")) 
			validacionesPassw += "La contraseña esta vacia";
		else {
			if (pass.length() >= 8) { 

				boolean espacios = false;
				boolean banMayus = false;
				boolean banMinus = false;
				for (int i = 0; i < pass.length(); i++) {
					char codigo = pass.charAt(i);
					if(codigo > 64 && codigo < 91 && !banMayus) { 
						banMayus= true;

					}
					else if(codigo > 96 && codigo < 123 && !banMinus) {
						banMinus = true;

					}else if(codigo == 255) {
						espacios = true;
					}
				}

				if (espacios)
					validacionesPassw += "<br>La contraseña no puede contener espacios en blanco";
				if (!banMayus)
					validacionesPassw += "<br>Debe Contener una mayuscula";

				if (!banMinus)

					validacionesPassw += "<br>Debe contener una minuscula";
			} else {

				validacionesPassw += "<br>Contraseña debe tener minimo 8 caracteres";
			}

		}


		request.setAttribute("cedula", cedula);
		request.setAttribute("nombre", nombre);
		request.setAttribute("apellido", apellido);
		request.setAttribute("correo", correo);
		request.setAttribute("pass", pass);

		request.setAttribute("validacionesCedula", validacionesCedula);
		request.setAttribute("validacionesNombre", validacionesNombre);
		request.setAttribute("validacionesApellido", validacionesApellido);
		request.setAttribute("validacionesCorreo", validacionesCorreo);
		request.setAttribute("validacionesPassw", validacionesPassw);

		request.getRequestDispatcher(url).forward(request, response);

	}

}

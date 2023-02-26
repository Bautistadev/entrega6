package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import DB.Conexion;
import Enum.Tipo;
import Enum.Estado;
import entity.User;

/**
 * Servlet implementation class UserController
 */
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accion;
		RequestDispatcher dispacher = null;
		
		accion = request.getParameter("accion");
		
		if(accion == null || accion.isEmpty()) {
			dispacher = request.getRequestDispatcher("index.html");
		
		}else if("agregar".equals(accion)) {
			
			dispacher = request.getRequestDispatcher("nuevo.html");
		}
		dispacher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String accion;
		RequestDispatcher dispacher = null;
		
		accion = request.getParameter("accion");
		
		if("nuevo".equals(accion)) {
			
			User user = new User();
			
			user.setNombre(request.getParameter("nombre").toUpperCase());
			user.setApellido(request.getParameter("apellido").toUpperCase());
			if(request.getParameter("tipo").equalsIgnoreCase(Tipo.ADMIN.getTipo()))
				user.setTipo(Tipo.ADMIN);
			else
				user.setTipo(Tipo.USUARIO);
			if(request.getParameter("estado").equalsIgnoreCase(Estado.ACTIVO.getEstado()))
				user.setEstado(Estado.ACTIVO);
			else
				user.setEstado(Estado.INACTIVO);
			
			//LO AGREGAMOS A LA BASE DE DATOS SIMULADA
			Conexion.getConexion().AgregarLista(user);
			
			dispacher = request.getRequestDispatcher("index.html");
		}

		dispacher.forward(request, response);
		
		
	}

}

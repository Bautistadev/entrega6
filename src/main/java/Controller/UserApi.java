package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import DB.Conexion;
import entity.User;

/**
 * Servlet implementation class UserApi
 */
public class UserApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserApi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		//TRAEMOS LA CONEXION Y NUESTROS USUARIOS YA REGISTRADO DE NUESTRA BD SIMULADA
		List<User> usuarios = Conexion.getConexion().getDB();
		
		//DEFINIMOS EL TIPO
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		
		//IMPRIMIMOS EL JSON
		Gson json = new Gson();
		String userJson = json.toJson(usuarios);
		PrintWriter impresion = response.getWriter();
		impresion.write(userJson);
		impresion.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

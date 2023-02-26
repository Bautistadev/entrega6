package DB;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Enum.Estado;
import Enum.Tipo;
import entity.User;

public class Conexion {
	
	private static Conexion con= null;
	
	private List<User> users = new ArrayList<>();
	
	private Conexion() {
		// TODO Auto-generated constructor stub
		users.add(new User("ROBERTO","BASILIO",Tipo.USUARIO,Estado.INACTIVO));
	}
	
	
	public static Conexion getConexion(){
		if(con == null) {
			con = new Conexion();
		}
		
		return con;
	}
	
	public List<User> getDB() {
		return users;
	}
	public void AgregarLista(User user) {
		users.add(user);
	}

}

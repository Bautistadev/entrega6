package entity;

import java.io.Serializable;
import Enum.*;

public class User implements Serializable {
	
	private String nombre;
	private String apellido;
	private Tipo tipo;
	private Estado estado;

	//CONSTRUCTOR VACIO
	public User() {
		// TODO Auto-generated constructor stub=
	}

	public User(String nombre, String apellido, Tipo tipo, Estado estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo = tipo;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	//CONSTRUCTOR PRINCIAL
	
	

}

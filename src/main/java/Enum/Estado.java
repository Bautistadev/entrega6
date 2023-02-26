package Enum;

public enum Estado {
	ACTIVO("ACTIVO"),INACTIVO("INACTIVO");
	
	
	private final String estado;
	
	private Estado(String estado) {
		this.estado =  estado;
	}
	
	public String getEstado() {
		return this.estado;
	}
}

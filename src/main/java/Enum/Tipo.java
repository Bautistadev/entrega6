package Enum;

public enum Tipo {
	ADMIN("ADMIN"),USUARIO("USUARIO");
	
	private final String tipo;
	
	private Tipo(String tipo) {
		this.tipo =  tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
}

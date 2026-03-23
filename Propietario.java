package ud6.veterinaria.v3;

public class Propietario {
	private String nombre;
	private String telefono;
	
	public Propietario(String nombre, String telefono) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
}

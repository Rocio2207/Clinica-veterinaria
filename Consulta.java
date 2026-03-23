package ud6.veterinaria.v3;

import java.time.LocalDate;

public class Consulta {
	private LocalDate fecha;
	
	public Consulta(LocalDate fecha, int id, String medicamento) {
		super(id, medicamento);
		this.fecha = fecha;
	}
}

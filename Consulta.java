package ud6.veterinaria.v3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
	private LocalDate fecha;
	private int idAnimal;
	private String diagnostico;
	List<Medicamento> recetaMedicamento = new ArrayList<>();
	
	
	public Consulta(LocalDate fecha, int idAnimal, String diagnostico) {
		super();
		this.fecha = fecha;
		this.idAnimal = idAnimal;
		this.diagnostico = diagnostico;
		this.recetaMedicamento = recetaMedicamento;
	}

	public void addMedicamento(Medicamento m) {
		this.recetaMedicamento.add(m);
	}
	
	public boolean removeMedicamento(String nombreMedicamento) {
		if(recetaMedicamento.contains(nombreMedicamento)) {
			this.recetaMedicamento.remove(nombreMedicamento);
			return true;
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "Consulta [fecha=" + fecha + ", idAnimal=" + idAnimal + ", diagnostico=" + diagnostico
				+ ", recetaMedicamento=" + recetaMedicamento + "]";
	}
	
	
}

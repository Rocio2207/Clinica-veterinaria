package ud6.veterinaria.v3;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.LinkedHashSet;

public class Clinica {
	
	Map<Integer, List<Consulta>> mapClinica;
	
	Clinica(){
		this.mapClinica = new HashMap<Integer, List<Consulta>>();
	}
	
	public int cuantosAnimales() {
		return Animal.getContadorAnimales();
	}
	
	
	Set<Consulta> getConsultas(int idAnimal) {
		if(mapClinica.containsKey(idAnimal)) {
			Set<Consulta> consultasId = new LinkedHashSet<Consulta>(mapClinica.get(idAnimal));
			return consultasId;
		}
		
		
	}
	
}

class AnimalNoEncontradoException extends Exception{
	public AnimalNoEncontradoException(String mensaje) {
		super(mensaje);
	}
}

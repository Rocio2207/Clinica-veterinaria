package ud6.veterinaria.v3;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.LinkedHashSet;

public class Clinica {
	
	Map<Integer, List<Consulta>> consultas;
	private List<Animal> animales = new ArrayList<>();
	
	Clinica(){
		this.consultas = new HashMap<Integer, List<Consulta>>();
	}
	
	public int cuantosAnimales() {
		return Animal.getContadorAnimales();
	}
	
	public void addAnimal(Animal a) {
            this.animales.add(a);
    }
	
	
	Set<Consulta> getConsultas(int idAnimal) throws AnimalNoEncontradoException{
		if(consultas.containsKey(idAnimal)) {
			Set<Consulta> consultasId = new LinkedHashSet<Consulta>(consultas.get(idAnimal));
			return consultasId;
		}
		else {
			throw new AnimalNoEncontradoException("El id proporcionado, no coincide con ningun animal.");
		}
		
		
	}
	
}

class AnimalNoEncontradoException extends Exception{
	public AnimalNoEncontradoException(String mensaje) {
		super(mensaje);
	}
}

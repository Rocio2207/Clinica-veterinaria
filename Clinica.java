package ud6.veterinaria.v3;

import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.LinkedHashSet;

public class Clinica {
	
	Map<Integer, List<Consulta>> consultas;
	private List <Animal> animales;
	Clinica(){
		this.consultas = new HashMap<Integer, List<Consulta>>();
		this.animales = new ArrayList<Animal>();
	}
	
	public int cuantosAnimales() {
		return Animal.getContadorAnimales();
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
	List <Medicamento> getMedicamentosByPeso(Consulta c){
		List <Medicamento> medicamentoRec = new ArrayList<>(c.recetaMedicamento);
		Collections.sort(medicamentoRec);
		return medicamentoRec;		
	}
	
	Set <Animal> getAnimalesSinConsultas(){
		Set<Animal> listaAnimal = new HashSet<>();
		for(Animal a : animales) {
			if(!consultas.containsKey(a.getId())) {
				listaAnimal.add(a);
			}
		}
		return listaAnimal;
	}
}

class AnimalNoEncontradoException extends Exception{
	public AnimalNoEncontradoException(String mensaje) {
		super(mensaje);
	}
}

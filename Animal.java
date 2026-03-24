package ud6.veterinaria.v3;

import java.util.List;
import java.util.ArrayList;

public abstract class Animal implements contactaPropietario{
	protected int id;
	protected Sexo sexo;
	protected double peso;
	protected Propietario propietario;
	protected static int contadorAnimales;
	static List <Animal> listaAnimales = new ArrayList<Animal>();
	
	
	public Animal(Sexo sexo, double peso, Propietario propietario) {
		super();
		this.id = contadorAnimales;
		this.sexo = sexo;
		this.peso = peso;
		this.propietario = propietario;
		listaAnimales.add(this);
		contadorAnimales++;
	}
	
	public static int getContadorAnimales() {
		return contadorAnimales;
	}

	public int getId() {
		return id;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public static List<Animal> getListaAnimales() {
		return listaAnimales;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", sexo=" + sexo + "]";
	}
	
	
}


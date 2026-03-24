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
	
	
	public Animal(int id, Sexo sexo, double peso, Propietario propietario) {
		super();
		this.id = id;
		this.sexo = sexo;
		this.peso = peso;
		this.propietario = propietario;
		listaAnimales.add(this);
		contadorAnimales++;
	}

	public Animal(int id, Sexo sexo, double peso) {
		super();
		this.id = id;
		this.sexo = sexo;
		this.peso = peso;
		this.propietario = null;
		listaAnimales.add(this);
		contadorAnimales++;
	}
	public abstract Integer cortarUnas();
	
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


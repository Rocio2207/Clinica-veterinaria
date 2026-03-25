package ud6.veterinaria.v3;

import java.util.List;
import java.util.ArrayList;

public abstract class Animal implements contactaPropietario{
	protected int id;
	protected Sexo sexo;
	protected double peso;
	protected Propietario propietario;
	protected static int contadorAnimales;
	
	
	
	public Animal(Sexo sexo, double peso, Propietario propietario) {
		super();
		this.id = contadorAnimales;
		this.sexo = sexo;
		this.peso = peso;
		this.propietario = propietario;
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


	@Override
	public String toString() {
		return "Animal [id=" + id + ", sexo=" + sexo + "]";
	}
	
	
}


package ud6.veterinaria.v3;

public abstract class Animal {
	protected int id;
	protected Sexo sexo;
	protected double peso;
	protected Propietario propietario;
	protected static int contadorAnimales;
	
	
	public Animal(int id, Sexo sexo, double peso, Propietario propietario) {
		super();
		this.id = id;
		this.sexo = sexo;
		this.peso = peso;
		this.propietario = propietario;
		contadorAnimales++;
	}

	public Animal(int id, Sexo sexo, double peso) {
		super();
		this.id = id;
		this.sexo = sexo;
		this.peso = peso;
		this.propietario = null;
		contadorAnimales++;
	}
	public abstract Integer cortarUnas();
	
	
	public static Integer cuantosAnimales() {
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


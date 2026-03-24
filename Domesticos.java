package ud6.veterinaria.v3;

public abstract class Domesticos extends Animal {
protected String nombreAnimal;
protected int edad;
protected String raza;
protected String numChip;
public Domesticos(Sexo sexo, double peso, Propietario propietario, String nombreAnimal, int edad, String raza,
		String numChip) {
	super(sexo, peso, propietario);
	this.nombreAnimal = nombreAnimal;
	this.edad = edad;
	this.raza = raza;
	this.numChip = numChip;
}

public abstract void cortarUnas();

@Override
public String toString() {
	return "Domesticos [nombreAnimal=" + nombreAnimal + ", edad=" + edad + ", raza=" + raza + ", numChip=" + numChip
			+ "]";
}

}
package ud6.veterinaria.v3;

public class Gato extends Domesticos {
	
	public Gato(String nombreAnimal, int edad, String raza, String numChip, Sexo sexo,  int peso, Propietario propietario) {
		super(sexo, peso, propietario, nombreAnimal, edad, raza, numChip);
	}

	@Override
	public void contactarPropietario() {
		System.out.println("Contactando al Propietario/a del Gato");
	}

	@Override
	public void cortarUnas() {
		if (peso - 20 > 0) {
			this.peso = peso - 20;
		} else {
			System.out.println("El peso no puede quedar por debajo de 0.");
		}
	}

	@Override
	public String toString() {
		return "Gato [nombreAnimal=" + nombreAnimal + ", edad=" + edad + ", raza=" + raza + ", numChip=" + numChip
				+ ", id=" + id + ", sexo=" + sexo + ", peso=" + peso + ", propietario=" + propietario + "]";
	}
}
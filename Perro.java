package ud6.veterinaria.v3;

public class Perro extends Domesticos {

	public Perro(String nombreAnimal, int edad, String raza, String numChip, Sexo sexo,  int peso, Propietario propietario) {
		super(sexo, peso, propietario, nombreAnimal, edad, raza, numChip);
	}
	

	@Override
	public void contactarPropietario() {
		System.out.println("Contactando propietario/a del Perro");
		
	}

	@Override
	public void cortarUnas() {
		if(peso-50>0) {
			peso -= 50;
		}else {
			System.out.println("No puede pesar 0 pobre perro");
		}
		
	}
	public void damePatita() {
			System.out.println("El perro "+nombreAnimal+" te da la patita");
	}


	@Override
	public String toString() {
		return "Perro []";
	}
	

}

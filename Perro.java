package ud6.veterinaria.v3;

public class Perro extends Domesticos {

	public Perro(int id, Sexo sexo, double peso, Propietario propietario, String nombreAnimal, int edad, String raza,
			String numChip) {
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

}

package ud6.veterinaria.v3;

public class Serpiente extends NoDomesticos {
	private	EspecieSerpiente especie;
	private Boolean venenosa;
	
	public Serpiente(EspecieSerpiente especie, Boolean venenosa, Sexo sexo, double peso, Propietario propietario) {
		super(sexo, peso, propietario);
		this.especie = especie;
		this.venenosa = venenosa;
	}
	@Override
	public void contactarPropietario() {
		System.out.println("Contactando al Propietario/a de la Serpiente");
		
	}
	
	@Override
	public String toString() {
		return "Serpiente [especie=" + especie + ", venenosa=" + venenosa + ", id=" + id + ", sexo=" + sexo + ", peso="
				+ peso + ", getId()=" + getId() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
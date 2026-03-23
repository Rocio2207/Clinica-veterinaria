package ud6.veterinaria.v3;

public class Serpiente extends NoDomesticos{
	Especie especie;
	Boolean venenosa;
	
	public Serpiente(int id, Sexo sexo, double peso, Especie especie, Boolean venenosa) {
		super(id, sexo, peso);
		this.especie = especie;
		this.venenosa = venenosa;
	}
	
	
	@Override
	public String toString() {
		return "Serpiente [especie=" + especie + ", venenosa=" + venenosa + ", id=" + id + ", sexo=" + sexo + ", peso="
				+ peso + ", cortarUnas()=" + cortarUnas() + ", getId()=" + getId() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}

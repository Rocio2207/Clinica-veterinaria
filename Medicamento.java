package ud6.veterinaria.v3;

public class Medicamento implements Comparable<Medicamento> {
private String nombreMedicamento;
private double gramos;
private double precio;
public Medicamento(String nombreMedicamento, double gramos, double precio) {
	super();
	this.nombreMedicamento = nombreMedicamento;
	this.gramos = gramos;
	this.precio = precio;
}
@Override
public String toString() {
	return "Medicamento [nombreMedicamento=" + nombreMedicamento + ", gramos=" + gramos + ", precio=" + precio + "]";
}
public double getGramos() {
	return gramos;
}
public void setGramos(double gramos) {
	this.gramos = gramos;
}
@Override
public int compareTo(Medicamento o) {
	return Double.compare(this.gramos, o.getGramos());
}


}

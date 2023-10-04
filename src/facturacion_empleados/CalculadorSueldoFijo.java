package facturacion_empleados;

public class CalculadorSueldoFijo extends CalculadorSueldo {
	
	private int sueldo;
	
	public CalculadorSueldoFijo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public double calcularSueldo() {
		
		return sueldo;
	}
}

package facturacion_empleados;

public class Empleado {
	public CalculadorSueldo calc;
	public String nombre;
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public double getSueldo() {
		return calc.calcularSueldo();
	}
	
	public CalculadorSueldo getCalc() {
		return calc;
	}
	public void setCalc(CalculadorSueldo calc) {
		this.calc = calc;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}

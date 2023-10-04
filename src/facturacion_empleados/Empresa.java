package facturacion_empleados;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Empleado> empleados;
	
	public Empresa() {
		this.empleados = new ArrayList<>();
	}

	public void totalPagar() {
		System.out.println("Total a pagar");
		double total = 0;
		for(Empleado e : empleados) {
			System.out.println(e.getNombre() +": " + e.getSueldo() + "$");
			total+=e.getSueldo();
		}
		System.out.println("Total a pagar: " + total + "$");
		
	}
	
	public double saberSueldo(Empleado empleado) {
		return empleado.getSueldo();
	}
	
	public void agregarEmpleado(Empleado ...empleados ) {
		for(Empleado e : empleados) {
			this.empleados.add(e);
		}
	}
	
	public ArrayList<Empleado> getEmpleados() {
		return new ArrayList<Empleado>(empleados);
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public static void main(String[]Args) {
		Empresa muebles = new Empresa();
		
		Empleado empleado1 = new Empleado("Juan");
		empleado1.setCalc(new CalculadorSueldoFijo(20000));
		
		Empleado empleado2 = new Empleado("ricardo");
		empleado2.setCalc(new CalculadorSueldoVentas(20000,0.3,50,50,50,50));
		
		Empleado empleado3= new Empleado("jose");
		empleado3.setCalc(new CalculadorSueldoVentasIncentivo(20000,0.3,20000,5,50,50,50,50));
		
		muebles.agregarEmpleado(empleado1,empleado2,empleado3);
		muebles.totalPagar();
		
	}
	
}

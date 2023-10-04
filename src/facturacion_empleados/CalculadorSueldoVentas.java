package facturacion_empleados;

import java.util.ArrayList;

public class CalculadorSueldoVentas extends CalculadorSueldo {
	
	private ArrayList<Double> ventas;
	private double sueldo;
	private double comicion;
	private double vendidos[];
	
	public CalculadorSueldoVentas(double sueldo ,double comicion,double ...vendidos ) {
		this.sueldo = sueldo;
		this.comicion = comicion;
		this.ventas = new ArrayList<>();
		for(double v : vendidos)
			this.ventas.add(v);
	}
	@Override
	public double calcularSueldo() {
		double total = 0;
		for(double v : this.ventas) {
			total+=v;
		}
		return this.getSueldo() + (total*this.comicion);
	}
	
	public void agregarVenta() {
		for(double v : this.vendidos) {
			this.ventas.add(v);
		}
	}
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public ArrayList<Double> getVentas() {
		return new ArrayList<Double>(ventas);
	}
	public void setVentas(ArrayList<Double> ventas) {
		this.ventas = ventas;
	}
	public double getComicion() {
		return comicion;
	}
	public void setComicion(double comicion) {
		this.comicion = comicion;
	}
	

}

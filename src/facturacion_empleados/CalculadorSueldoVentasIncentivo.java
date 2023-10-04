package facturacion_empleados;

public class CalculadorSueldoVentasIncentivo extends CalculadorSueldoVentas {
	private double extra;
	private int cant;
	public CalculadorSueldoVentasIncentivo(double sueldo,double comicion,double extra, int cant,double...ventas) {
		super(sueldo,comicion,ventas);
		this.cant = cant;
		this.extra = extra;
	}
	
	public double getSueldo() {
		if(this.getVentas().size()>=this.cant) {
			return super.getSueldo() + extra;
		}
		else return super.getSueldo();
		}
}

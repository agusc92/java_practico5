package conversorUnidades;

import java.text.DecimalFormat;

public abstract class Convertir {
private final static double CENTIMETRO = 2.54;
private final static double KILO = 0.453592;
private final static double LITRO = 3.78541;

static DecimalFormat df = new DecimalFormat("#.00");

public static double centimetrosAPulgada(double centimetro) {
	
	return  Math.round(centimetro/CENTIMETRO * 100) / 100d;
}

public static double pulgadasACentimetro(double pulgadas) {
	return pulgadas * CENTIMETRO;
}

public static double libraAKilo(double libra) {
	return libra * KILO;
}

public static double kiloALibra(double kilo) {
	return kilo/KILO;
}

public static double litroAGalon(double litro) {
	return litro/LITRO;
}

public static double galonALitro(double galon) {
	return galon*LITRO;
}

public static void main(String[]args) {
	System.out.println(Convertir.centimetrosAPulgada(7 ));
}
}

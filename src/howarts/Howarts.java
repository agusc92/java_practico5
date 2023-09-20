package howarts;

public class Howarts {

	public static void main(String[] args) {
		Sombrero sombrero = new Sombrero();
		
		Casa grifindor = new Casa("Grifindor",3);
		Alumno alumno1 = new Alumno("Harry","Potther");
		
		
		sombrero.agregarCasa(grifindor);
		
		sombrero.seleccionar(alumno1);
		alumno1.agregarCualidad("leal","amable");
		sombrero.seleccionar(alumno1);
	}

}

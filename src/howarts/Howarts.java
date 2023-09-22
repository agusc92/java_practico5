package howarts;

public class Howarts {

	public static void main(String[] args) {
		Sombrero sombrero = new Sombrero();
		
		Casa grifindor = new Casa("Grifindor",3);
		Casa ravenclaw = new Casa("Ravenclaw",3);
		Alumno alumno1 = new Alumno("Harry","Potther");
		Alumno alumno2 = new Alumno("melisa","gendwitch");
		
		grifindor.agragarCualidad("leal","bondadoso");
		ravenclaw.agragarCualidad("amable","atento");
		
		sombrero.agregarCasa(grifindor);
		sombrero.agregarCasa(ravenclaw);
		
		alumno2.agregarCualidad("amable","rapido","inteligente","atento");
		System.out.println(sombrero.seleccionar(alumno2));
		System.out.println(sombrero.seleccionar(alumno2));
		System.out.println(sombrero.seleccionar(alumno2));
		System.out.println(sombrero.seleccionar(alumno2));
		
		alumno1.agregarCualidad("leal","bondadoso","amable");
		System.out.println(sombrero.seleccionar(alumno1));
		
	}

}

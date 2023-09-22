package howarts;

public class Howarts {

	public static void main(String[] args) {
		Sombrero sombrero = new Sombrero();
		
		Casa grifindor = new Casa("Grifindor",3);
		Casa ravenclaw = new Casa("Ravenclaw",3);
		CasaLinaje slizering = new CasaLinaje("Slizering",3);
		
		Alumno alumno1 = new Alumno("Harry","Potther");
		Alumno alumno2 = new Alumno("melisa","gendwitch");
		Alumno alumno3 = new Alumno("Draco","Malfoy");
		Alumno alumno4 = new Alumno("Lucius","Malfoy");
		
		grifindor.agregarCualidad("leal","bondadoso");
		ravenclaw.agregarCualidad("amable","atento");
		slizering.agregarCualidad("fuerte","ambicioso");
		
		alumno3.agregarFamiliar(alumno4);
		slizering.agregarAlumno(alumno4);
		sombrero.agregarCasa(grifindor);
		sombrero.agregarCasa(ravenclaw);
		sombrero.agregarCasa(slizering);
		
		slizering.agregarCasaEnemiga(grifindor);
		grifindor.agregarCasaEnemiga(slizering);
		alumno1.agregarCualidad("leal","bondadoso","amable");
		alumno2.agregarCualidad("amable","rapido","inteligente","atento");
		alumno3.agregarCualidad("leal","amable","fuerte","ambicioso");
		
		System.out.println(sombrero.seleccionar(alumno2));
		System.out.println(sombrero.seleccionar(alumno3));
		
		
		System.out.println(sombrero.seleccionar(alumno1));
		
	}

}

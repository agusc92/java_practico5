package howarts;

import java.util.ArrayList;
import java.util.Arrays;

public class Casa { 
	private String nombre;
	private ArrayList <Alumno> alumnos;
	private ArrayList <String> cualidades;
	private int cantMaxima;
	
	public Casa(String nombre , int cantMaxima ) {
		this.alumnos = new ArrayList<Alumno>();
		this.nombre = nombre;
		this.cantMaxima = cantMaxima;
		this.cualidades = new ArrayList<String>() ;
	}
	public boolean compruevaVacante () {
			return alumnos.size()<this.cantMaxima; 
				
	}
	
	public void agragarCualidad(String ...  cualidad) {
		for(int i = 0 ; i<cualidad.length;i++) {
			this.cualidades.add(cualidad[i]);
		}
	}
	public boolean calificar(ArrayList<String> cualidadesAlumno) {
		boolean aceptado = true;
		int i = 0;
		while(i<cualidades.size()&&aceptado) {
			aceptado = cualidadesAlumno.contains(cualidades.get(i));
			if(aceptado)
				i++;
		}
		return aceptado;
	}
	public void agregarAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public int getCantMaxima() {
		return cantMaxima;
	}

	public void setCantMaxima(int cantMaxima) {
		this.cantMaxima = cantMaxima;
	}
	public ArrayList<String> getCualidades() {
		return cualidades;
	}
	public void setCualidades(ArrayList<String> cualidades) {
		this.cualidades = cualidades;
	}
	
	

}

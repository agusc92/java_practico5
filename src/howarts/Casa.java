package howarts;

import java.util.ArrayList;
import java.util.Arrays;

public class Casa { 
	private String nombre;
	private ArrayList <Alumno> alumnos;
	private ArrayList <String> cualidades;
	private ArrayList <Casa> casasEnemigas;
	private int cantMaxima;
	
	public Casa(String nombre , int cantMaxima ) {
		this.alumnos = new ArrayList<Alumno>();
		this.nombre = nombre;
		this.cantMaxima = cantMaxima;
		this.cualidades = new ArrayList<String>() ;
		this.casasEnemigas = new ArrayList<Casa>();
	}
	public boolean compruevaVacante () {
			return alumnos.size()<this.cantMaxima; 
				
	}
	
	public void agregarCualidad(String ...  cualidad) {
		for(int i = 0 ; i<cualidad.length;i++) {
			this.cualidades.add(cualidad[i]);
		}
	}
	public boolean calificar(Alumno alumno) {
		boolean aceptado = true ;
		int i =0;
		while(i<casasEnemigas.size()&&aceptado) {
			aceptado = !this.concuerda(casasEnemigas.get(i).getCualidades(), alumno);
			i++;
		}
		if(aceptado) {
			aceptado =  this.concuerda(cualidades, alumno);
		}
		return aceptado;
		
	}
	
	public void agregarAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}
	
	protected boolean concuerda(ArrayList<String> cualidades , Alumno alumno) {
		for(int i =0;i<cualidades.size();i++) {
			if(!alumno.getCualidades().contains(cualidades.get(i))) {
				return false;
			}
		}
		return true;
	}
	public void agregarCasaEnemiga(Casa casaEnemiga) {
		this.casasEnemigas.add(casaEnemiga);
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
	public ArrayList<Casa> getCasasEnemigas() {
		return casasEnemigas;
	}
	public void setCasasEnemigas(ArrayList<Casa> casasEnemigas) {
		this.casasEnemigas = casasEnemigas;
	}
	
	

}

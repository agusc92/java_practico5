package howarts;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String apellido;
	private ArrayList<Alumno> familiares;
	private ArrayList<String> cualidades;

	public Alumno(String nombre , String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		familiares = new ArrayList<Alumno>();
		cualidades = new ArrayList<String>();
	}

	public void agregarCualidad(String ... cualidad) {
		for(int i = 0;i<cualidad.length;i++) {
			this.cualidades.add(cualidad[i]);
		}
	}
	public void agregarFamiliar(Alumno ... alumno) {
		for(int i = 0;i<alumno.length;i++) {
			familiares.add(alumno[i]);
		}
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<Alumno> getFamiliares() {
		return familiares;
	}

	public void setFamiliares(ArrayList<Alumno> familiares) {
		this.familiares = familiares;
	}

	public ArrayList<String> getCualidades() {
		return cualidades;
	}

	public void setCualidades(ArrayList<String> cualidades) {
		this.cualidades = cualidades;
	}




}

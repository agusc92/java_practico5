package congreso_computacion;

import java.util.ArrayList;

public class Evaluador {
	private static ArrayList<String> temasEspecificos = new ArrayList<String>();;
	private ArrayList<String> conocimientos = new ArrayList<>();;
	private String nombre;
	private ArrayList<Trabajo> trabajosAsignados = new ArrayList<>();

	public Evaluador(String nombre) {
		this.nombre = nombre;
		
	}

	public void agregarConocimiento(String ...strings ) {
		for(String s: strings) {
			conocimientos.add(s);
		}
	}
	public static void agregarTemaEspecifico(String ...strings ) {
		for(String s: strings) {
			temasEspecificos.add(s);
		}
	}

	public String getTipo() {
		for(String s : temasEspecificos) {
			if(this.getConocimientos().contains(s))
				return "Experto";
		}
		return "general";
	}

	public void agregarTrabajoAsignado(Trabajo trabajo ) {
		trabajosAsignados.add(trabajo);
	}

	public static ArrayList<String> getTemasEspecificos() {
		return new ArrayList<String>(temasEspecificos);
	}

	public static void setTemasEspecificos(String ...strings ) {
		for(String s : strings)
			Evaluador.temasEspecificos.add(s);
	}

	public ArrayList<String> getConocimientos() {
		return new ArrayList<String>(conocimientos);
	}

	public void setConocimientos(ArrayList<String> conocimientos) {
		this.conocimientos = conocimientos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Trabajo> getTrabajosAsignados() {
		return new ArrayList<Trabajo>(trabajosAsignados);
	}

	public void setTrabajosAsignados(ArrayList<Trabajo> trabajosAsignados) {
		this.trabajosAsignados = trabajosAsignados;
	}

	@Override
	public String toString() {
		return this.getNombre();
	}

}

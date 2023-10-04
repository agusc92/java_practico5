package congreso_computacion;

import java.util.ArrayList;

public class Sistema {
	private ArrayList<Trabajo> trabajos;
	private ArrayList<Evaluador> evaluadores;
	
	public Sistema() {
		this.trabajos = new ArrayList<>();
		this.evaluadores = new ArrayList<>();
	}
	
	public void asignarEvaluador(Trabajo trabajo) {
		if(trabajo.getEvaluador()==null) {
			for(Evaluador e : evaluadores) {
				trabajo.asignarEvaluador(e);
			}
		}else {
			System.out.println("El trabajo ya tiene evaluador");
		}
	}
	
	public void agregarTrabajo(Trabajo trabajo) {
		this.trabajos.add(trabajo);
	}
	
	public void agregarEvaluador(Evaluador... evaluador) {
		for(Evaluador e : evaluador)
		this.evaluadores.add(e);
	}
	
	
	public ArrayList<Trabajo> getTrabajos() {
		return new ArrayList<Trabajo>(trabajos);
	}

	public void setTrabajos(ArrayList<Trabajo> trabajos) {
		this.trabajos = trabajos;
	}

	public ArrayList<Evaluador> getEvaluadores() {
		return new ArrayList<Evaluador>(evaluadores);
	}

	public void setEvaluadores(ArrayList<Evaluador> evaluadores) {
		this.evaluadores = evaluadores;
	}

	public static void main(String[]Args) {
		Sistema sistema = new Sistema();
		Evaluador.agregarTemaEspecifico("java","programacion");
		Evaluador evaluador1 = new Evaluador("Juan");
		Evaluador evaluador2 = new Evaluador("Juan2");
		
		
		evaluador1.agregarConocimiento("java");
		evaluador2.agregarConocimiento("matematicas","lenguaje");
		Trabajo trabajo1 = new TrabajoSimple("articulo");
		Trabajo trabajo2 = new TrabajoComplejo("poster");
		trabajo1.agregarPalabraClave("programacion","matematicas");
		trabajo2.agregarPalabraClave("lenguaje","matematicas");
		sistema.agregarEvaluador(evaluador1,evaluador2);
		sistema.asignarEvaluador(trabajo2);
		
		System.out.println(trabajo2.getEvaluador());
		
	}
}

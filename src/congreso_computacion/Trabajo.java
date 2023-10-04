package congreso_computacion;

import java.util.ArrayList;

public abstract class Trabajo {
	private String tipo;
	private Evaluador evaluador;
	private ArrayList<String> palabrasClave;

	public Trabajo(String tipo) {
		this.tipo = tipo;
		this.palabrasClave = new ArrayList<>();
	}

	public void asignarEvaluador(Evaluador evaluador) {
		if(this.comprobar(evaluador))
			this.evaluador = evaluador;

	}

	protected abstract boolean comprobar(Evaluador evaluador);

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Evaluador getEvaluador() {
		return evaluador;
	}


	public ArrayList<String> getPalabrasClave() {
		return new ArrayList<String>(palabrasClave);
	}

	public void agregarPalabraClave(String ...strings ) {
		for(String s : strings)
			this.palabrasClave.add(s);
	}
	
	public void setPalabrasClave(ArrayList<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}


}

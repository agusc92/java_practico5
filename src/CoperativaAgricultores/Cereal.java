package CoperativaAgricultores;

import java.util.ArrayList;

public class Cereal {
	private String nombre;
	private String tipo;
	private ArrayList<String> mineralesNecesarios;

	public Cereal(String nombre , String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.mineralesNecesarios = new ArrayList<>();
	}
	
	public void agregarMineralNecesario(String ...strings ) {
		for(String s : strings) 
			this.mineralesNecesarios.add(s);
		
	}
	public boolean verificarLote(Lote lote) {
		return lote.getMineralesDisponibles().containsAll(this.mineralesNecesarios);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<String> getMineralesNecesarios() {
		return new ArrayList<String>(mineralesNecesarios);
	}

	public void setMineralesNecesarios(ArrayList<String> mineralesNecesarios) {
		this.mineralesNecesarios = mineralesNecesarios;
	}

	
}

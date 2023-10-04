package CoperativaAgricultores;

import java.util.ArrayList;

public class Lote {
	private int numeroLote;
	private ArrayList<String> mineralesDisponibles;
	private static ArrayList<String> mineralesOptimos = new ArrayList<>();;
	private int tamanio;
	private static int cont = 0;

	public Lote( int tamanio) {
		this.numeroLote = cont++;
		this.tamanio = tamanio;
		this.mineralesDisponibles = new ArrayList<>();

	}
	public void agregarMineralDisponible(String ...strings ) {
		for(String m : strings) {
			this.mineralesDisponibles.add(m);
		}
	}
	public static void agregarMineralOptimo(String ... strings) {
		for(String m : strings) {
			mineralesOptimos.add(m);
		}
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public ArrayList<String> getMineralesDisponibles() {
		return new ArrayList<String> (this.mineralesDisponibles);
	}

	public void setMineralesDisponibles(ArrayList<String> mineralesDisponibles) {
		this.mineralesDisponibles = mineralesDisponibles;
	}

	public ArrayList<String> getMineralesOptimos() {
		return new ArrayList<String>(mineralesOptimos);
	}

	public static void setMineralesOptimos(ArrayList<String> minerales) {
		mineralesOptimos = minerales;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public String getTipo() {
		if(this.mineralesDisponibles.containsAll(mineralesOptimos))
			return "especial";
		else
			return "comun";
	}


}

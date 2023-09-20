package hacerPila;

import java.util.ArrayList;

public class Pila {

	private ArrayList<Object> elementos ;
	
	public Pila() {
		this.elementos = new ArrayList<Object>();
	}
	
	
	public void push(Object item) {
		this.elementos.add(item);
	}
	
	public Object pop() {
		int pos = elementos.size();
		Object aux = elementos.get(pos);
		elementos.remove(pos);
		return aux;
	}
	
	public Object top() {
		return elementos.get(elementos.size()-1);
	}
	public Object ultimo() {
		return elementos.get(elementos.size()-1);
	}
	
	
	
	
	
	
	
	
	
	
	
}

package jardin_privado;

import java.util.ArrayList;

public class Item {
	private String nombre;
	private String genero;

	public Item(String nombre, String genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public static void main(String[]Args) {
		ArrayList<Item> items = new ArrayList<Item>();
		//supongamos que tienes un ArrayList de Item llamado items
		
		for(int i = 0;i<items.size();i++) {
			
		}
		
		
	}
}

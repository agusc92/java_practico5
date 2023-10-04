package extra_libreria;

import java.util.ArrayList;

public class Elemento {
	private String nombre;
	private double precio;
	private int cantPaginas;
	private String resumen;
	private ArrayList<String> generos = new ArrayList<String>();
	private String autor;
	
	public Elemento(String nombre,String autor,double precio,int cantPaginas ,String resumen,String ...generos) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantPaginas = cantPaginas;
		this.resumen = resumen;
		this.autor=autor;
		for(String g : generos)
		this.generos.add(g);
	}

	public String getNombre() {
		return nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Elemento el =(Elemento) obj;
			return this.getNombre() == el.getNombre();
		}catch(Exception e) {
			return false;
		}
		
	}
	
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantPaginas() {
		return cantPaginas;
	}

	public void setCantPaginas(int cantPaginas) {
		this.cantPaginas = cantPaginas;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public ArrayList<String> getGeneros() {
		return new ArrayList<>(generos);
	}

	public void setGeneros(ArrayList<String> generos) {
		this.generos = generos;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}

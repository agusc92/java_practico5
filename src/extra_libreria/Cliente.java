package extra_libreria;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private int dni;
	private String direccion;
	private ArrayList<String>autores;
	private ArrayList<String>generos;
	private ArrayList<Elemento>compras;
	private double descuento;
	public Cliente(String nombre, int dni, String direccion) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.autores = new ArrayList<>();
		this.generos = new ArrayList<>();
		this.compras = new ArrayList<>();
		this.descuento = 1;
	}
	
	public Cliente(String nombre, int dni, String direccion,double descuento) {
		this(nombre,dni,direccion);
		this.descuento = descuento;
		
	}
	
	public void agregarGenero(String ...strings ) {
		for(String s : strings)
			this.generos.add(s);
	}
	public void agregarAutor(String ...strings ) {
		for(String s : strings)
			this.autores.add(s);
	}
	
	public void agregarCompra(Elemento ele) {
		this.compras.add(ele);
	}
	
	public double pagar(double precio) {
		return precio*descuento;
	}

	public boolean comprado(Elemento elemento) {
		return this.compras.contains(elemento);
	}
	
	public boolean evaluarElemento(Elemento elemento) {
		return autores.contains(elemento.getAutor());
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<String> getAutores() {
		return new ArrayList<>(autores);
	}

	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}

	public ArrayList<String> getGeneros() {
		return new ArrayList<>(generos);
	}

	public void setGeneros(ArrayList<String> generos) {
		this.generos = generos;
	}

	public ArrayList<Elemento> getCompras() {
		return new ArrayList<>(compras);
	}

	public void setCompras(ArrayList<Elemento> compras) {
		this.compras = compras;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	
}

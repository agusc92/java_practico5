package extra_libreria;

import java.util.ArrayList;

public class Sistema {
	private ArrayList<Elemento> elementos;
	private ArrayList<Cliente> clientes;
	
	public Sistema() {
		elementos = new ArrayList<>();
		clientes = new ArrayList<>();
	}
	
	public double cobrar(Elemento elemento , Cliente cliente) {
		return cliente.pagar(elemento.getPrecio());
	}
	
	public void agregarElemento(Elemento ... ele) {
		for(Elemento e : ele)
			this.elementos.add(e);
	}
	public void agregarCliente(Cliente ...clientes ) {
		for(Cliente c : clientes)
			this.clientes.add(c);
	}
	
	public void comprado(Elemento ele , Cliente cli) {
		if(cli.comprado(ele)) {
			System.out.println("El cliente ya posee este libro");
		}else {
			System.out.println("El cliente aun no posee este libro");
		}
	}
	
	public void recomendar(Elemento ele) {
		System.out.println("Este libro le gustaria a: ");
		for(Cliente c : this.getClientes()) {
			if(c.evaluarElemento(ele)) {
				System.out.println(c.getNombre() + " Y le costaria: "+ this.cobrar(ele, c));
			}
		}
			
	}
	
	public ArrayList<Elemento> getElementos() {
		return new ArrayList<Elemento>(elementos);
	}

	public void setElementos(ArrayList<Elemento> elementos) {
		this.elementos = elementos;
	}

	public ArrayList<Cliente> getClientes() {
		return new ArrayList<Cliente>(clientes);
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public static void main(String[] Args) {
		Sistema sistema= new Sistema();
		
		Elemento libro1 = new Elemento("Eragos","Christopher",2500,500,"La posta de libro","comedia","aventura");
		
		Cliente cliente1 = new Cliente("tito",43242,"81-1736");
		cliente1.agregarGenero("comedia","drama","accion");
		cliente1.agregarAutor("Christopher");
		cliente1.agregarCompra(libro1);
		
		Cliente cliente2 = new ClienteExijente("tito2",43242,"81-1736",0.80);
		cliente2.agregarAutor("Christopher");
		cliente2.agregarGenero("comedia","drama","accion");
		
		sistema.agregarCliente(cliente1,cliente2);
		sistema.agregarElemento(libro1);
		sistema.comprado(libro1, cliente1);
		sistema.comprado(libro1, cliente2);
		sistema.recomendar(libro1);
	}
}

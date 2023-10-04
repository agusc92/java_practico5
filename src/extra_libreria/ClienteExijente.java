package extra_libreria;

public class ClienteExijente extends Cliente {

	public ClienteExijente(String nombre, int dni, String direccion) {
		super(nombre, dni, direccion);
		// TODO Auto-generated constructor stub
	}

	public ClienteExijente(String nombre, int dni, String direccion, double descuento) {
		super(nombre, dni, direccion, descuento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean evaluarElemento(Elemento elemento) {
		
		boolean genero = false;
		
		for(String e : elemento.getGeneros()) {
			if(this.getGeneros().contains(e)) {
				genero = true;
			}
		}
		return genero && this.getAutores().contains(elemento.getAutor());
	}
}

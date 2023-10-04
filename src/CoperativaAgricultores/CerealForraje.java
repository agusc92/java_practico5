package CoperativaAgricultores;

public class CerealForraje extends Cereal {
	private final int tamanioRequerido;
	public CerealForraje(String nombre , String tipo,int tamanio) {
		super(nombre , tipo);
		tamanioRequerido = tamanio;
	}
	
	public boolean verificarLote(Lote lote) {
		return lote.getTamanio()>=tamanioRequerido && super.verificarLote(lote);
	}

	public int getTamanioRequerido() {
		return tamanioRequerido;
	}
	
	
}

package congreso_computacion;

public class TrabajoComplejo extends Trabajo {

	public TrabajoComplejo(String tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	protected boolean comprobar(Evaluador evaluador) {
		return evaluador.getConocimientos().containsAll(this.getPalabrasClave());
		
	}

}

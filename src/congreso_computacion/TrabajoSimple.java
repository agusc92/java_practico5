package congreso_computacion;

public class TrabajoSimple extends Trabajo {

	public TrabajoSimple(String tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	protected boolean comprobar(Evaluador evaluador) {
		for(String s : evaluador.getConocimientos()) {
			if(this.getPalabrasClave().contains(s))
				return true;
		}
		return false;
		
	}

}

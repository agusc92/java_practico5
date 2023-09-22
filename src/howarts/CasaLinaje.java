package howarts;

import java.util.ArrayList;

public class CasaLinaje extends Casa {
	
	public CasaLinaje(String nombre,int cantMax) {
		super(nombre,cantMax);
	}
	
	public boolean calificar(Alumno alumno) {
		boolean aceptado = this.comprobarLinaje(alumno.getFamiliares()) ;
		int i =0;
		while(i<this.getCasasEnemigas().size()&&aceptado) {
			aceptado = !this.concuerda(this.getCasasEnemigas().get(i).getCualidades(), alumno);
			i++;
		}
		if(aceptado) {
			aceptado =  this.concuerda(this.getCualidades(), alumno);
		}
		return aceptado;
		
	}
	
	private boolean comprobarLinaje(ArrayList<Alumno> parientes) {
		for(int i =0;i<parientes.size();i++) {
			if(this.getAlumnos().contains(parientes.get(i))) {
				return true;
			}
		}
		return false;
	}
}

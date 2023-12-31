package howarts;

import java.util.ArrayList;

public class Sombrero {
	public ArrayList<Casa> casas;

	public Sombrero() {
		this.casas = new ArrayList<Casa>();
	}

	public String seleccionar(Alumno alumno) {
		int i = 0;
		boolean selecto = false;

		while(i<casas.size()&&!selecto) {
			if(casas.get(i).compruevaVacante()) {
				selecto = casas.get(i).calificar(alumno);
				if (!selecto)
					i++;
				else {
					casas.get(i).agregarAlumno(alumno);
					alumno.setCasa(casas.get(i));
					return alumno.getNombre() + " "+ alumno.getApellido() + " ahora pertenece a: " + casas.get(i).getNombre()+"!!!!";
				}
			}else {
				i++;
			}
		}

		return alumno.getNombre() + " fuera de aqui muggle";
	}
	public void agregarCasa(Casa casa) {
		this.casas.add(casa);
	}
}

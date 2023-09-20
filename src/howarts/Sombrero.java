package howarts;

import java.util.ArrayList;

public class Sombrero {
	public ArrayList<Casa> casas;

	public Sombrero() {
		this.casas = new ArrayList<Casa>();
	}

	public void seleccionar(Alumno alumno) {
		int i = 0;
		boolean selecto = false;
		if(casas.get(i).compruevaVacante()) {
			while(i<casas.size()&&!selecto) {

				selecto = casas.get(i).calificar(alumno.getCualidades());
				if (!selecto)
					i++;
			}
		}
		if(selecto) {
			System.out.println(casas.get(i).getNombre()+"!!!!");
		}else {
			System.out.println("a casa por muggle");
		}
	}
	public void agregarCasa(Casa casa) {
		this.casas.add(casa);
	}
}

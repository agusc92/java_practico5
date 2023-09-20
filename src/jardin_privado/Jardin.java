package jardin_privado;

import java.util.ArrayList;

import conversorUnidades.Convertir;

public class Jardin {
	private String nombre;
	private ArrayList<Planta> plantas;

	public Jardin(String nombre) {
		this.nombre = nombre;
		plantas = new ArrayList<Planta>();
	}
	public Jardin(String nombre, ArrayList<Planta> plantas) {
		this(nombre);
		this.plantas = plantas;
  }
	
	public void obtenerPlantas() {
		if(plantas.size()>0) {
		for(int i = 0;i<plantas.size();i++) {
			System.out.println("/////////////");
			System.out.println("Nombre: "+plantas.get(i).getNombre()+"\n"
								+"Nombre cientifico: "+plantas.get(i).getNombreCientifico()+"\n"
								+"Pais de origen: "+plantas.get(i).getPais()+"\n"
								+"ID: "+ plantas.get(i).getId());
		}
		}else
			System.out.println("Este jardin no tiene plantas");
	}
	public void agregarPlanta(Planta planta) {
		this.plantas.add(planta);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Planta> getPlantas() {
		return plantas;
	}
	public void setPlantas(ArrayList<Planta> plantas) {
		this.plantas = plantas;
	}
	public static void main(String[] Args) {
		Jardin jardin = new Jardin("Jardin de agus");
		
		jardin.agregarPlanta( new Planta("Petunia","Petuniacia verdoisica","Argentina"));
		jardin.agregarPlanta( new Planta("Rosa","reseida verdoisica","Argentina"));
		jardin.agregarPlanta( new Planta("Margarita","Margueta verdoisica","Argentina"));
		jardin.agregarPlanta( new Planta("Violeta","Cordera verdoisica","Argentina"));
		
		jardin.obtenerPlantas();
		System.out.println(Convertir.centimetrosAPulgada(7));
		
	}
}

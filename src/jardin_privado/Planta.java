package jardin_privado;

public class Planta {
	// nombre cientifico, nombre comun, pais de origen e identificador unico incremental
	private String nombre;
	private String nombreCientifico;
	private String pais;
	private static int cont = 1;
	private int id;
	public Planta(String nombre , String nombreCientifico , String pais){
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
		this.pais = pais; 
		id=cont++;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public  int getId() {
		return id;
	}
	
	
	
}

package CoperativaAgricultores;

import java.util.ArrayList;

public class Sistema {

	private ArrayList<Lote> lotes;
	private ArrayList<Cereal> cereales;

	public Sistema() {
		lotes = new ArrayList<>();
		cereales = new ArrayList<>();
	}



	public void agregarCereal(Cereal ...cereals ) {
		for(Cereal c:cereals)
			this.cereales.add(c);
	}
	public void agregarLote(Lote ...lotes ) {
		for(Lote l:lotes)
			this.lotes.add(l);
	}


	public ArrayList<Cereal> determinarCerealesEnLote(Lote lote){
		ArrayList<Cereal> verificados = new ArrayList<Cereal>();
		System.out.println("Los cereales que pueden cembrarse en el lote numero "+lote.getNumeroLote() + " son:");
		for(Cereal c: this.cereales) {
			if(c.verificarLote(lote)) {
				verificados.add(c);
				System.out.println(c.getNombre());
			}
		}
		return verificados;
	}

	public void determinarLotesPorCereal(Cereal cereal){
		ArrayList<Lote> verificados = new ArrayList<Lote>();
		System.out.println("los lotes aptos para sembrar " + cereal.getNombre() + " son: ");
		for(Lote l : this.lotes) {
			if(cereal.verificarLote(l)) {
				verificados.add(l);
			System.out.println("Lore Nro " + l.getNumeroLote());
			}
		}
		
		
		
	}

	public ArrayList<Lote> getLotes() {
		return new ArrayList<Lote>(lotes);
	}






	public void setLotes(ArrayList<Lote> lotes) {
		this.lotes = lotes;
	}






	public ArrayList<Cereal> getCereales() {
		return new ArrayList<Cereal>(cereales);
	}






	public void setCereales(ArrayList<Cereal> cereales) {
		this.cereales = cereales;
	}






	public static void main(String[]Args) {
		Sistema sistema = new Sistema();
		Lote.agregarMineralOptimo("hierro","fosforo");
		
		Cereal trigo = new Cereal("trigo", "fino");
		Cereal cebada = new Cereal("cebada", "fino");
		Cereal centeno = new Cereal("centeno", "fino");
		Cereal maiz = new Cereal("maiz", "fino");
		Cereal girasol = new Cereal("girasol", "fino");
		Cereal arroz = new Cereal("girasol", "fino");
		
		Cereal alfalfa = new CerealForraje("alfalfa","forraje",30);
		Cereal tforrajero = new CerealForraje("tforrajero","forraje",20);
		Cereal avena = new CerealForraje("avena","forraje",70);
		
		avena.agregarMineralNecesario("niquel");
		alfalfa.agregarMineralNecesario("niquel");
		tforrajero.agregarMineralNecesario("hierro");
		
		
		cebada.agregarMineralNecesario("fosforo");
		trigo.agregarMineralNecesario("hierro");
		centeno.agregarMineralNecesario("niquel");
		maiz.agregarMineralNecesario("hierro","fosforo");
		girasol.agregarMineralNecesario("fosforo");
		arroz.agregarMineralNecesario("niquel","hierro");
		
		
		sistema.agregarCereal(trigo);
		sistema.agregarCereal(cebada);
		sistema.agregarCereal(centeno);
		sistema.agregarCereal(girasol);
		sistema.agregarCereal(maiz);
		sistema.agregarCereal(arroz);
		

		Lote lote1 = new Lote (10);
		Lote lote2 = new Lote (10);
		Lote lote3 = new Lote (30);
		Lote lote4 = new Lote (20);
		
		
		
		lote1.agregarMineralDisponible("hierro");
		lote2.agregarMineralDisponible("fosforo","niquel");
		lote3.agregarMineralDisponible("fosforo","hierro");
		lote4.agregarMineralDisponible("calcio","niquel");
		sistema.agregarLote(lote1);
		sistema.agregarLote(lote2);
		sistema.agregarLote(lote3);
		sistema.agregarLote(lote4);
		System.out.println(lote3.getTipo());
		sistema.determinarLotesPorCereal(tforrajero);
		sistema.determinarCerealesEnLote(lote1);
	}
}

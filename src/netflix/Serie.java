package netflix;

import java.util.List;

public class Serie {
	private String titulo;
	private List<Temporada> temporadas; //Walking Death
	///////////////NO REFACTORING//////////////////
	public void duracionTotalSerie() {
		int duracion = 0;
		for (Temporada temporada:temporadas) {
			ArrayList<Capitulo> capitulos=temporada.getCapitulo();
			for (Capitulo capitulo:capitulos) {
				duracion+=capitulo.getDuracion();
			}
		}
		System.out.print("La duracion de la serie es " + duracion);
	}
		
	
	
	
	//////////////CON REFACTORING//////////////////
	public void duracionTotalSerie() {
		int duracion = 0;
		for (Temporada temporada:temporadas) {
			duracion+=temporada.getMinutosTemporada();
		}
		System.out.print("La duracion de la serie es " + duracion);
	}
	public Serie(String titulo, List<Temporada> temporadas) {
		super();
		this.titulo = titulo;
		this.temporadas  = new ArrayList<Temporada>;
	}
	
	
	
	public Serie(String titulo) {
		super();
		this.titulo = titulo;
		this.temporadas  = new ArrayList<Temporada>;
	}



	public Serie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void addTemporada(Temporada temporada) {
		temporadas.add(temporada);
		temporada.setserie(this);
	}
	
	

}

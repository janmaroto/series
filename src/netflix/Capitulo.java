package netflix;

public class Capitulo {
	protected int duracion;
	public final int DURATION = 45;
	protected int num;
	protected Temporada temporada;
	protected ArrayList<Personaje> personajes;
	
//	
//	public Capitulo(int duration) {
//		this.DURATION = duration;
//	}
	public Capitulo() {
	}
	
	
	
	public Capitulo(int num, Temporada temporada) {
//		super();
		this.num = num;
		this.temporada = temporada;
	}
	
	public String listaPersonajes() {
		StringBuffer sb =new STringBuffer();
//		String cadena = "";
		for (Personaje per:personajes) {
			sb.append(per);// faltaria el toString()
//			cadena+=per;
			
		}
		return sb.toString(); //cadena;
	}



	public int getDuracion() {
		return duracion;
	}



	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}



	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public Temporada getTemporada() {
		return temporada;
	}



	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}



	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}



	public void setPersonajes(ArrayList<Personaje> personajes) {
		this.personajes = personajes;
	}



	public int getDURATION() {
		return DURATION;
	}
	
	

}

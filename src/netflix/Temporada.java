package netflix;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
	public int numero;
	private ArrayList<Capitulo> capitulos;
	private Serie serie;

//Exercici 6 serie TeenWolfT2C1
	public String listaCapitulos() {
		StringBuffer sb = new StringBuffer();
		String titulo=serie.getTitulo();
//		String cadena = "";
		for (Capitulo cap:capitulos) {
			sb.append(titulo+"T"+this.numero+"C"+cap.getNum()+num); // faltaria el toString()
//			cadena+=per;
			
		}
		return sb.toString(); //cadena;
	}
	
	public Serie getSerie() {
		return serie;
	}
	
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	public Temporada() {
		capitulos=new Array.List<Capitulo>();
	}
	
	
	public boolean adddCapitulo(Capitulo capitulo) {
		if (!capitulos.contains(capitulo)) {
			capitulos.add(capitulo); // fem la relacio n
//			capitulo.setTemporada(this);
			return true;
		} else 
			return false;
		
	}
	
	public String listaCapitulos() {
		for (Capitulo cap:capitulos) {
			pepe += cap.toString();
		}
	}

}

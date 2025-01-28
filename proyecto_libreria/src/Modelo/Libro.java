package Modelo;

public class Libro {
	private int cod;
	private String nombre;
	
	public Libro(int cod,String nombre) {
		this.cod=cod;
	}
	
	public int getcod() {
		return cod;
	}
	
	public String getnombre() {
		return nombre;
	}
}

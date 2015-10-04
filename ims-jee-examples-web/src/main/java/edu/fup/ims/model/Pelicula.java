package edu.fup.ims.model;

public class Pelicula {
	
	//atributos
	private Long id;
	private String titulo;
	private int anio;
	private int duracion;
	private String pais;
	
	//constructor por defecto
	public Pelicula(){ }

	//otro constructor
	public Pelicula(String t, int a) {
		titulo = t;
		anio = a;
	}

	//Getters y setters...
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
}

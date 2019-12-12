package com.educarOnline.JavaAnnotations;

public abstract class Estudiante extends Persona implements Responsabilidades {

	private String universidad;
	private String carreraUniversitaria;

	public Estudiante(String nombre, String apellido, String dni, String genero, int edad, String universidad,
			String carreraUniversitaria) {
		super(nombre, apellido, dni, genero, edad);
		this.universidad = universidad;
		this.carreraUniversitaria = carreraUniversitaria;

	}
	
	public Estudiante() {
		super();
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getCarreraUniversitaria() {
		return carreraUniversitaria;
	}

	public void setCarreraUniversitaria(String carreraUniversitaria) {
		this.carreraUniversitaria = carreraUniversitaria;
	}

	@Override
	public abstract void ingreso();

	@Override
	public abstract String getTareas();

	@Override
	public abstract String getInforme();

}

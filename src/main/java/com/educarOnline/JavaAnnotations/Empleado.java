package com.educarOnline.JavaAnnotations;

public abstract class Empleado extends Persona implements Responsabilidades {
	
	private String numeroSeguroSocial;
	
	
	public Empleado(String nombre, String apellido, String dni, String genero, int edad, String numeroSeguroSocial) {
		super(nombre, apellido, dni, genero, edad);
		this.numeroSeguroSocial = numeroSeguroSocial;
	}
	
	public Empleado() {
		super();
	}
	

	public String getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}



	public void setNumeroSeguroSocial(String numeroSeguroSocial) {
		this.numeroSeguroSocial = numeroSeguroSocial;
	}



	@Override
	public abstract String getTareas();

	@Override
	public abstract String getInforme();

	@Override
	public abstract void ingreso();

	
}

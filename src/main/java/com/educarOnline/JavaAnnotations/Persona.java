package com.educarOnline.JavaAnnotations;

public abstract class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private String genero;
	private int edad;

	// ...............................................................................................................
	//Constructor
	public Persona(String nombre, String apellido, String dni, String genero, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.genero = genero;
		this.edad = edad;
	}
	
	public Persona() {
		
	}
	
	// ...............................................................................................................
	//Métodos Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// ...............................................................................................................
	//Devuelve la representación String de un Objeto Persona
	@Override
	public String toString() {

		return String.format("%s %s%nEdad: %d%nGénero: %s%nNúmero de DNI: %s", nombre, apellido, edad, genero, dni);

	}

	// ...............................................................................................................
	//Método abstracto sobreescrito por las subclases concretas.
	public abstract void ingreso();

}

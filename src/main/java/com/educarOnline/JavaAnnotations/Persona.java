package com.educarOnline.JavaAnnotations;
/**
 * Superclase abstracta Persona que proporciona lo métodos ingreso (método abstracto que cada subclase concreta debe 
 * darle una implementación apropiada) y toString(heredado de la clase Object y sobreescrito en la clase Persona), 
 * además de los métodos getters y setters que manipulan las variables de instancia de Persona.
 * @author José Parra
 *
 */
public abstract class Persona {
	
	// ...............................................................................................................
	//VARIABLES DE INSTANCIA:
	private String nombre;
	private String apellido;
	private String dni;
	private String genero;
	private int edad;

	// ...............................................................................................................
	//CONSRUCTOR (SOBRECARGA DE CONTRUCTORES)
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

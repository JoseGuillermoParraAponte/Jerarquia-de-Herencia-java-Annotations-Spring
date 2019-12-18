package com.educarOnline.JavaAnnotations;

/**
 * Superclase abstracta Persona que proporciona lo métodos ingreso (método
 * abstracto que cada subclase concreta debe darle una implementación apropiada)
 * y toString (heredado de la clase Object y sobreescrito en la clase Persona),
 * además de los métodos getters y setters que manipulan las variables de
 * instancia de Persona.
 * 
 * @author José Parra
 * @version 11/12/2019/A
 * @see <a href = "https://github.com/JoseGuillermoParraAponte"> Cuenta de
 *      GitHub para ver proyectos personales. </a>
 */
public abstract class Persona {

	// ...............................................................................................................
	// VARIABLES DE INSTANCIA (ATRIBUTOS):
	private String nombre;
	private String apellido;
	private String dni;
	private String genero;
	private int edad;

	// ...............................................................................................................
	// CONSRUCTORES (SOBRECARGA DE CONTRUCTORES)
	/**
	 * Constructor que inicializa las variables de instancia del objeto Persona.
	 * 
	 * @param nombre   Nombre.
	 * @param apellido Apellido.
	 * @param dni      Número del documento de identidad.
	 * @param genero   Género.
	 * @param edad     Edad.
	 */
	public Persona(String nombre, String apellido, String dni, String genero, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.genero = genero;

		try {
			if (edad < 0 || edad > 150) {
				throw new IllegalArgumentException("OJO: la edad debe ser >=0 y <= 120 años.");
			} else {
				this.edad = edad;
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Constructor sin parámetros.
	 */
	public Persona() {

	}

	// ...............................................................................................................
	// Métodos Getters y Setters
	/**
	 * Método que devuelve el nombre.
	 * 
	 * @return Nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que establece el nombre.
	 * 
	 * @param nombre Nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que devuelve el apellido.
	 * 
	 * @return Apellido.
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Método que establece el apellido.
	 * 
	 * @param apellido Apellido.
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Método que devuelve el número del documento de identidad.
	 * 
	 * @return Número del documento de identidad.
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Método que establece el número del documento de identidad.
	 * 
	 * @param dni Número del documento de identidad.
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Método que devuelve el género.
	 * 
	 * @return Género.
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Método que establece el género.
	 * 
	 * @param genero Género.
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Método que devuelve la edad.
	 * 
	 * @return Edad.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Método que establece la edad.
	 * 
	 * @param edad Edad.
	 */
	public void setEdad(int edad) {

		try {
			if (edad < 0 || edad > 150) {
				throw new IllegalArgumentException("OJO: la edad debe ser >=0 y <= 120 años.");
			} else {
				this.edad = edad;
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	// ...............................................................................................................
	/**
	 * Devuelve la representación String de un objeto Persona.
	 */
	@Override
	public String toString() {

		return String.format("Nombres: %s%nApellidos: %s%nEdad: %d%nGénero: %s%nDNI: %s", getNombre(), getApellido(),
				getEdad(), getGenero(), getDni());

	}

	// ...............................................................................................................
	/**
	 * Método abstracto sobreescrito por las subclases concretas.
	 */
	public abstract void ingreso();

}

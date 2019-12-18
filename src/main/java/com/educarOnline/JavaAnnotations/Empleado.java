package com.educarOnline.JavaAnnotations;

/**
 * Subclase abstracta Empleado que extiende de la clase Persona e implementa la
 * interfaz Responsabilidades.
 * 
 * @author José Parra
 * @version 11/12/2019/A
 * @see <a href = "https://github.com/JoseGuillermoParraAponte"> Cuenta de
 *      GitHub para ver proyectos personales. </a>
 *
 */
public abstract class Empleado extends Persona implements Responsabilidades {
	// ...............................................................................................................
	// VARIABLES DE INSTANCIA (ATRIBUTOS):
	private String numeroSeguroSocial;

	// ...............................................................................................................
	// CONSRUCTORES (SOBRECARGA DE CONTRUCTORES):
	/**
	 * Constructor que inicializa las variables de instancia del objeto Empleado.
	 * 
	 * @param nombre             Nombre.
	 * @param apellido           Apellido.
	 * @param dni                Número del documento de identidad.
	 * @param genero             Género.
	 * @param edad               Edad.
	 * @param numeroSeguroSocial Número del seguro social.
	 */
	public Empleado(String nombre, String apellido, String dni, String genero, int edad, String numeroSeguroSocial) {
		super(nombre, apellido, dni, genero, edad);
		this.numeroSeguroSocial = numeroSeguroSocial;
	}

	/**
	 * Constructor sin parámetros.
	 */
	public Empleado() {
		super();
	}

	// ...............................................................................................................
	// Métodos Getters y Setters
	/**
	 * Método que devuelve el número de seguro social.
	 * 
	 * @return Número de seguro social.
	 */
	public String getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}

	/**
	 * Método que establece el número de seguro social.
	 * 
	 * @param numeroSeguroSocial Número de seguro social.
	 */
	public void setNumeroSeguroSocial(String numeroSeguroSocial) {
		this.numeroSeguroSocial = numeroSeguroSocial;
	}

	// ...............................................................................................................
	/**
	 * Devuelve la representación String de un objeto Empleado	.
	 */
	@Override
	public String toString() {
		return String.format("%s%nNúmero de seguro social: %s", super.toString(), getNumeroSeguroSocial());

	}

	// ...............................................................................................................
	/**
	 * Nota: Aquí no implementamos el método abstract ingreso de Persona, así que
	 * esta clase se declara abstract para evitar un error de compilación.
	 */
	@Override
	public abstract void ingreso();

	/**
	 * Nota: Aquí no implementamos el método getTareas de Responsabilidades, así que
	 * esta clase se declara abstract para evitar un error de compilación.
	 */
	@Override
	public abstract String getTareas();

	/**
	 * Nota: Aquí no implementamos el método getInforme de Responsabilidades, así
	 * que esta clase se declara abstract para evitar un error de compilación.
	 */
	@Override
	public abstract String getInforme();

}

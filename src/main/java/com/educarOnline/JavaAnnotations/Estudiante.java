package com.educarOnline.JavaAnnotations;

/**
 * Subclase abstracta Estudiante que extiende de la clase Persona e implementa
 * la interfaz Responsabilidades.
 * 
 * @author José Parra
 * @version 11/12/2019/A
 * @see <a href = "https://github.com/JoseGuillermoParraAponte"> Cuenta de
 *      GitHub para ver proyectos personales. </a>
 */

public abstract class Estudiante extends Persona implements Responsabilidades {

	// ...............................................................................................................
	// VARIABLES DE INSTANCIA (ATRIBUTOS):
	private String universidad;
	private String carreraUniversitaria;

	// ...............................................................................................................
	// CONSRUCTORES (SOBRECARGA DE CONTRUCTORES):
	/**
	 * Constructor que inicializa las variables de instancia del objeto Estudiante.
	 * 
	 * @param nombre               Nombre.
	 * @param apellido             Apellido.
	 * @param dni                  Número del documento de identidad.
	 * @param genero               Género.
	 * @param edad                 Edad.
	 * @param universidad          Campus Universitario.
	 * @param carreraUniversitaria Carrera Universitaria.
	 */
	public Estudiante(String nombre, String apellido, String dni, String genero, int edad, String universidad,
			String carreraUniversitaria) {
		super(nombre, apellido, dni, genero, edad);

		this.universidad = universidad;
		this.carreraUniversitaria = carreraUniversitaria;

	}

	/**
	 * Constructor sin parámetros.
	 */
	public Estudiante() {
		super();
	}

	// ...............................................................................................................
	// Métodos Getters y Setters
	/**
	 * Método que devuelve el nombre de la universidad.
	 * 
	 * @return Nombre de la universidad.
	 */
	public String getUniversidad() {
		return universidad;
	}

	/**
	 * Método que establece el nombre de la universidad.
	 * 
	 * @param universidad Nombre de la universidad.
	 */
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	/**
	 * Método que devuelve el nombre de la carrera universitaria.
	 * 
	 * @return Nombre de la carrera universitaria.
	 */
	public String getCarreraUniversitaria() {
		return carreraUniversitaria;
	}

	/**
	 * Método que establece el nombre de la carrera universitaria.
	 * 
	 * @param carreraUniversitaria Nombre de la carrera universitaria.
	 */
	public void setCarreraUniversitaria(String carreraUniversitaria) {
		this.carreraUniversitaria = carreraUniversitaria;
	}

	// ...............................................................................................................
	/**
	 * Devuelve la representación String de un objeto Estudiante.
	 */
	@Override
	public String toString() {
		return String.format("%s%nUniversidad: %s%nCarrera Universitaria: %s%n", super.toString(), getUniversidad(),
				getCarreraUniversitaria());

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

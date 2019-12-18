package com.educarOnline.JavaAnnotations;

/**
 * Subclase concreta que define objetos de tipo EstudianteBecaServicio.
 * 
 * @author Jose Parra
 * @version 11/12/2019/A
 * @see <a href = "https://github.com/JoseGuillermoParraAponte"> Cuenta de
 *      GitHub para ver proyectos personales. </a>
 */

public class EstudianteBecaServicio extends Estudiante {

	// .........................................................................................................
	// VARIABLES DE INSTANCIA (ATRIBUTOS):

	private double tiempoServicio;
	private double ingreso;
	private Informe informeBecaServicio;

	// .........................................................................................................
	// CONSRUCTORES (SOBRECARGA DE CONTRUCTORES):
	/**
	 * Constructor para las inicializaciones de las variables de instancias y del
	 * objecto de tipo Informe que se le inyectará a la clase.
	 * 
	 * @param nombre               Nombre.
	 * @param apellido             Apellido.
	 * @param dni                  Número de documento.
	 * @param genero               Género.
	 * @param edad                 Edad
	 * @param universidad          Campus Universitario.
	 * @param carreraUniversitaria Carrera Universitaria.
	 * @param tiempoServicio       Tiempo de beca servicio.
	 * @param informeBecaServicio  Informe del estudiante.
	 */
	public EstudianteBecaServicio(String nombre, String apellido, String dni, String genero, int edad,
			String universidad, String carreraUniversitaria, double tiempoServicio, Informe informeBecaServicio) {

		super(nombre, apellido, dni, genero, edad, universidad, carreraUniversitaria);

		try {
			if (tiempoServicio < 0) {
				throw new IllegalArgumentException("OJO: el tiempo de servicio debe ser > 0.0.");
			} else {
				this.tiempoServicio = tiempoServicio;
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		this.informeBecaServicio = informeBecaServicio;

	}

	/**
	 * Constructor que será utilizado para inyectarle a la clase
	 * EstudianteBecaServicio un objeto de tipo Informe.
	 * 
	 * @param informeBecaServicio Informe del estudiante.
	 */
	public EstudianteBecaServicio(Informe informeBecaServicio) {
		super();
		this.informeBecaServicio = informeBecaServicio;
	}

	/**
	 * Constructor sin parámetros.
	 */
	public EstudianteBecaServicio() {
		super();
	}

	// .........................................................................................................
	// Métodos Getters y Setters
	/**
	 * Método que devuelve el tiempo de servicio del estudiante.
	 * 
	 * @return Tiempo de beca servicio.
	 */
	public double getTiempoServicio() {
		return tiempoServicio;
	}

	/**
	 * Método que establece el tiempo de servicio del estudiante.
	 * 
	 * @param tiempoServicio Tiempo de beca servicio.
	 */
	public void setTiempoServicio(double tiempoServicio) {
		try {
			if (tiempoServicio < 0) {
				throw new IllegalArgumentException("OJO: el tiempo de servicio debe ser > 0.0.");
			} else {
				this.tiempoServicio = tiempoServicio;
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Devuelve el ingreso del estudiante.
	 * 
	 * @return Ingreso del estudiante.
	 */
	public double getIngreso() {
		this.ingreso();
		return ingreso;
	}

	/**
	 * Método sobreescrito que establece el ingreso de un estudiante en función de
	 * su tiempo de servicio.
	 */
	@Override
	public void ingreso() {

		if (this.getTiempoServicio() <= 1) {
			this.ingreso = 10000;
		} else {
			this.ingreso = 10000 + 500 * (this.getTiempoServicio() - 1);
		}

	}

	/**
	 * Método que devuelve las tareas del estudiante.
	 */
	@Override
	public String getTareas() {

		return "Atender cuestiones referentes a su puesto de trabajo.";
	}

	/**
	 * Método que devuelve el informe presentado por el estudiante.
	 */
	@Override
	public String getInforme() {

		return informeBecaServicio.getInforme();
	}

	// ...............................................................................................................
	/**
	 * Devuelve la representación String de un objeto EstudianteBecaServicio..
	 */
	@Override
	public String toString() {
		return String.format(
				"Datos de un estudiante Beca Servicio:%n%sTiempo de Servicio: %.2f%nIngreso: %.2f%nTareas: %s%nInforme: %s",
				super.toString(), getTiempoServicio(), getIngreso(), getTareas(), getInforme());

	}
}

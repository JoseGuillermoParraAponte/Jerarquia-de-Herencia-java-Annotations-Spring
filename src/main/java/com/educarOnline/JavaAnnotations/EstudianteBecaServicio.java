package com.educarOnline.JavaAnnotations;
/**
 * Esta clase define objetos de tipo EstudianteBecaServicio.
 * @author Jose Parra
 * @version 11/12/2019/A
 * @see <a href = "https://github.com/JoseGuillermoParraAponte" /> Cuenta de GitHub para ver proyectos personales </a>
 */

public class EstudianteBecaServicio extends Estudiante {
	
	//.........................................................................................................
	//Variables de instancia

	private int tiempoServicio;
	private double ingreso;

	private Informe informeBecaServicio;
	//.........................................................................................................
	//Constructores
	/**
	 * Constructor para las inicializaciones de las variables de instancias y del objecto de tipo Informe que se le inyectará a la clase.
	 * @param nombre Nombre.
	 * @param apellido Apellido.
	 * @param dni Número de documento.
	 * @param genero Género.
	 * @param edad Edad
	 * @param universidad Campus Universitario.
	 * @param carreraUniversitaria Carrera Universitaria.
	 * @param tiempoServicio Tiempo de beca servicio.
	 * @param informeBecaServicio Informe del estudiante.
	 */
	public EstudianteBecaServicio(String nombre, String apellido, String dni, String genero, int edad,
			String universidad, String carreraUniversitaria, int tiempoServicio, Informe informeBecaServicio) {

		super(nombre, apellido, dni, genero, edad, universidad, carreraUniversitaria);
		this.tiempoServicio = tiempoServicio;
		this.informeBecaServicio = informeBecaServicio;

	}
	/**
	 * Constructor que será utilizado para inyectarle a la clase un objeto de tipo Informe.
	 * @param informeBecaServicio Informe del estudiante.
	 */
	public EstudianteBecaServicio(Informe informeBecaServicio) {

		this.informeBecaServicio = informeBecaServicio;
	}

	//.........................................................................................................
	//Métdos setter y getter
	/**
	 * Método que devuelve el tiempo de servicio del estudiante.
	 * @return El tiempo de servicio.
	 */
	public int getTiempoServicio() {
		return tiempoServicio;
	}
	/**
	 * Método que especifica el tiempo de servicio del estudiante.
	 * @param tiempoServicio Tiempo de beca servicio.
	 */
	public void setTiempoServicio(int tiempoServicio) {
		this.tiempoServicio = tiempoServicio;
	}
	
	/**
	 * Devuelve el ingreso del estudiante.
	 * @return Ingreso del estudiante.
	 */
	public double getIngreso() {
		ingreso();
		return ingreso;
	}
	/**
	 * Método que genera el ingreso de un estudiante en función de su tiempo de servicio.
	 */
	@Override
	public void ingreso() {

		if (tiempoServicio <= 1) {
			ingreso = 10000;
		} else {
			ingreso = 10000 + 500 * (tiempoServicio - 1);
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

	/**
	 * Método que devuelve toda la información del estudiante.
	 */
	@Override
	public String toString() {
		return String.format("Datos de un estudiante Beca Servicio:%n"
				+ "Nombre: %s%nApellido: %s%nIngreso: %.2f%nTareas: %s%nInforme: %s", getNombre(),getApellido(),getIngreso(),getTareas(),getInforme());

	}
}

package com.educarOnline.JavaAnnotations;
/**
 * Esta clase define objetos de tipo EstudianteBecaEstudio.
 * @author Jose Parra
 * @version 11/12/2019/A
 * @see <a href = "https://github.com/JoseGuillermoParraAponte" /> Cuenta de GitHub para ver proyectos personales </a>
 */
public class EstudianteBecaEstudio extends Estudiante {
	
	//.........................................................................................................
		//Variables de instancia
	private double ingreso;
	
	private Informe informeBecaEstudio;
	//.........................................................................................................
	//Constructores
	/**
	 * 
	 * @param nombre Nombre.
	 * @param apellido Apellido.
	 * @param dni Número de documento.
	 * @param genero Género.
	 * @param edad Edad.
	 * @param universidad Campus Universitario.
	 * @param carreraUniversitaria Carrera Universitaria.
	 * @param informeBecaEstudio Informe del estudiante.
	 */
	public EstudianteBecaEstudio(String nombre, String apellido, String dni, String genero, int edad,
			String universidad, String carreraUniversitaria, Informe informeBecaEstudio) {
		
		super(nombre, apellido, dni, genero, edad, universidad, carreraUniversitaria);
		this.informeBecaEstudio=informeBecaEstudio;
		
	}
	/**
	 * Constructor que será utilizado para inyectarle a la clase un objeto de tipo Informe.
	 * @param informeBecaEstudio Informe del estudiante.
	 */
	public EstudianteBecaEstudio(Informe informeBecaEstudio) {
		
		this.informeBecaEstudio=informeBecaEstudio;
		
	}
	/**
	 * Método que genera el ingreso de un estudiante..
	 */
	@Override
	public void ingreso() {
		
		ingreso=15000;

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
	 * Método que devuelve las tareas del estudiante.
	 */
	@Override
	public String getTareas() {
		
		return "Estudiar, estudiar y estudiar...";
	}
	/**
	 * Método que devuelve el informe presentado por el estudiante.
	 */
	@Override
	public String getInforme() {
		
		return informeBecaEstudio.getInforme();
	}

	/**
	 * Método que devuelve toda la información del estudiante.
	 */
	@Override
	public String toString() {
		return String.format("Datos de un estudiante Beca Estudio:%n"
				+ "Nombre: %s%nApellido: %s%nIngreso: %.2f%nTareas: %s%nInforme: %s", getNombre(),getApellido(),getIngreso(),getTareas(),getInforme());

	}
}

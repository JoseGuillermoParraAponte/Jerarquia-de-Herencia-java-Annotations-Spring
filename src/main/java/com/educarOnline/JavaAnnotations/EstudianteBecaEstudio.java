package com.educarOnline.JavaAnnotations;

/**
 * Subclase concreta que define objetos de tipo EstudianteBecaEstudio.
 * 
 * @author Jose Parra
 * @version 11/12/2019/A
 * @see <a href = "https://github.com/JoseGuillermoParraAponte"> Cuenta de
 *      GitHub para ver proyectos personales. </a>
 */
public class EstudianteBecaEstudio extends Estudiante {

	// .........................................................................................................
	// VARIABLES DE INSTANCIA (ATRIBUTOS):

	private double ingreso;
	private Informe informeBecaEstudio;

	// .........................................................................................................
	// CONSRUCTORES (SOBRECARGA DE CONTRUCTORES):
	/**
	 * 
	 * @param nombre               Nombre.
	 * @param apellido             Apellido.
	 * @param dni                  Número de documento.
	 * @param genero               Género.
	 * @param edad                 Edad.
	 * @param universidad          Campus Universitario.
	 * @param carreraUniversitaria Carrera Universitaria.
	 * @param informeBecaEstudio   Informe del estudiante.
	 */
	public EstudianteBecaEstudio(String nombre, String apellido, String dni, String genero, int edad,
			String universidad, String carreraUniversitaria, Informe informeBecaEstudio) {

		super(nombre, apellido, dni, genero, edad, universidad, carreraUniversitaria);
		this.informeBecaEstudio = informeBecaEstudio;

	}

	/**
	 * Constructor que será utilizado para inyectarle a la clase un objeto de tipo
	 * Informe.
	 * 
	 * @param informeBecaEstudio Informe del estudiante.
	 */
	public EstudianteBecaEstudio(Informe informeBecaEstudio) {
		super();
		this.informeBecaEstudio = informeBecaEstudio;

	}

	/**
	 * Constructor sin parámetros.
	 */
	public EstudianteBecaEstudio() {
		super();
	}

	// .........................................................................................................
	/**
	 * Método que establece el ingreso de un estudiante..
	 */
	@Override
	public void ingreso() {

		this.ingreso = 15000;
	}

	/**
	 * Método que devuelve el ingreso del estudiante.
	 * 
	 * @return Ingreso del estudiante.
	 */
	public double getIngreso() {

		this.ingreso();
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

	// ...............................................................................................................
	/**
	 * Devuelve la representación String de un objeto EstudianteBecaEstudio..
	 */
	@Override
	public String toString() {
		return String.format("Datos de un estudiante Beca Estudio:%n%sIngreso: %.2f%nTareas: %s%nInforme: %s",
				super.toString(), getIngreso(), getTareas(), getInforme());

	}
}

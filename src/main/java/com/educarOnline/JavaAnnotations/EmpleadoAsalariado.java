package com.educarOnline.JavaAnnotations;

/**
 * Subclase concreta (extiende de la clase abstract Empleado) que define objetos
 * de tipo EmpleadoAsalariado.
 * 
 * @author Jose Parra
 * @version 11/12/2019/A
 * @see <a href = "https://github.com/JoseGuillermoParraAponte"> Cuenta de
 *      GitHub para ver proyectos personales. </a>
 */
public class EmpleadoAsalariado extends Empleado {

	// .........................................................................................................
	// VARIABLES DE INSTANCIA (ATRIBUTOS):

	private double salarioSemanal;
	private double ingreso;
	private Informe informeEmpleadoAsalariado;

	// .........................................................................................................
	// CONSRUCTORES (SOBRECARGA DE CONTRUCTORES):

	/**
	 * Constructor que inicializa las variables de instancia del objeto
	 * EmpleadoAsalariado.
	 * 
	 * @param nombre                    Nombre.
	 * @param apellido                  Apellido.
	 * @param dni                       Número del documento de identidad.
	 * @param genero                    Género.
	 * @param edad                      Edad.
	 * @param numeroSeguroSocial        Número del seguro social.
	 * @param salarioSemanal            Salario semanal.
	 * @param informeEmpleadoAsalariado Informe del empleado asalariado.
	 */
	public EmpleadoAsalariado(String nombre, String apellido, String dni, String genero, int edad,
			String numeroSeguroSocial, double salarioSemanal, Informe informeEmpleadoAsalariado) {
		super(nombre, apellido, dni, genero, edad, numeroSeguroSocial);

		if (salarioSemanal < 0.0) {
			throw new IllegalArgumentException("EL salario semanal debe ser >=0.0");
		} else {
			this.salarioSemanal = salarioSemanal;
		}
		this.informeEmpleadoAsalariado = informeEmpleadoAsalariado;
	}

	/**
	 * Constructor que será utilizado para realizar la inyección del objeto de tipo
	 * Informe.
	 * 
	 * @param informeEmpleadoAsalariado Informe del empleado asalariado.
	 */
	public EmpleadoAsalariado(Informe informeEmpleadoAsalariado) {
		super();
		this.informeEmpleadoAsalariado = informeEmpleadoAsalariado;
	}

	/**
	 * Constructor sin parámetros.
	 */
	public EmpleadoAsalariado() {
		super();
	}

	// ...............................................................................................................
	// Métodos Getters y Setters
	/**
	 * Método que devuelve el salario semanal del empleado.
	 * 
	 * @return Salario semanal del empleado.
	 */
	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	/**
	 * Método que establece el salario semanal del empleado.
	 * 
	 * @param salarioSemanal Salario semanal del empleado.
	 */
	public void setSalarioSemanal(double salarioSemanal) {

		if (salarioSemanal < 0.0) {
			throw new IllegalArgumentException("EL salario semanal debe ser >=0.0");
		} else {
			this.salarioSemanal = salarioSemanal;
		}
	}

	/**
	 * Método que devuelve el informe de un empledo asalariado.
	 * 
	 * @return Informe de un empledo asalariado.
	 */
	public Informe getInformeEmpleadoAsalariado() {
		return informeEmpleadoAsalariado;
	}

	/**
	 * Método que establece el informe del empleado asalariado.
	 * 
	 * @param informeEmpleadoAsalariado informe del empleado asalariado.
	 */
	public void setInformeEmpleadoAsalariado(Informe informeEmpleadoAsalariado) {
		this.informeEmpleadoAsalariado = informeEmpleadoAsalariado;
	}

	/**
	 * Método que genera el ingreso del empleado asalariado.
	 */
	public double getIngreso() {
		ingreso();
		return ingreso;
	}

	/**
	 * Método que devuelve las tareas del empleado asalariado.
	 */
	@Override
	public String getTareas() {

		return "Trabajar, trabajar como um empleado asalariado.";
	}

	/**
	 * Método que devuelve el informe presentado por el empleado asalariado.
	 */
	@Override
	public String getInforme() {

		return informeEmpleadoAsalariado.getInforme();
	}

	/**
	 * Método que establece el ingreso del empleado asalariado..
	 */
	@Override
	public void ingreso() {

		this.ingreso = this.salarioSemanal;

	}

	// ...............................................................................................................
	/**
	 * Devuelve la representación String de un objeto Estudiante.
	 */
	@Override
	public String toString() {
		return String.format("%s%n%s%nIngreso: %.2f%nTareas: %s%nInforme: %s",
				"Datos de un empleado asalariado:", super.toString(), getIngreso(), getTareas(), getInforme());

	}

}

package com.educarOnline.JavaAnnotations;

/**
 * Subclase concreta (extiende de la clase abstract Empleado) que define objetos
 * de tipo EmpleadoPorComision.
 * 
 * @author Jose Parra
 * @version 11/12/2019/A
 * @see <a href = "https://github.com/JoseGuillermoParraAponte"> Cuenta de
 *      GitHub para ver proyectos personales. </a>
 */
public class EmpleadoPorComision extends Empleado {

	// .........................................................................................................
	// VARIABLES DE INSTANCIA (ATRIBUTOS):

	protected double ingreso;                 // ingreso del empleado por semana.
	private double ventasBrutas;              // ventas totales por semana.
	private double tarifaComision;            // porcentaje de comisión.
	private Informe informeEmpleadoComision;

	// .........................................................................................................
	// CONSRUCTORES (SOBRECARGA DE CONTRUCTORES):

	public EmpleadoPorComision(String nombre, String apellido, String dni, String genero, int edad,
			String numeroSeguroSocial, double ventasBrutas, double tarifaComision, Informe informeEmpleadoComision) {
		super(nombre, apellido, dni, genero, edad, numeroSeguroSocial);

		try {
			if (ventasBrutas < 0.0) {
				throw new IllegalArgumentException("Las ventas brutas deben ser >=0.0");
			} else {
				this.ventasBrutas = ventasBrutas;
			}
		} catch (IllegalArgumentException e) {
			e.getMessage();
		}

		if (tarifaComision <= 0.0 || tarifaComision >= 1) {
			throw new IllegalArgumentException("La tarifa de comisión debe estar entre 0.0 y 1");
		} else {
			this.tarifaComision = tarifaComision;
		}

		this.informeEmpleadoComision = informeEmpleadoComision;
	}

	public EmpleadoPorComision(Informe informeEmpleadoComision) {

		this.informeEmpleadoComision = informeEmpleadoComision;
	}
	
	public EmpleadoPorComision() {
		super();
	}

	// .........................................................................................................
	// Métodos Getters y Setters

	public double getVentasBrutas() {
		return ventasBrutas;
	}

	public void setVentasBrutas(double ventasBrutas) {
		try {
			if (ventasBrutas < 0.0) {
				throw new IllegalArgumentException("Las ventas brutas deben ser >=0.0");
			} else {
				this.ventasBrutas = ventasBrutas;
			}
		} catch (IllegalArgumentException e) {
			System.out.println("OJO: " + e.getMessage());
		}
	}

	public double getTarifaComision() {
		return tarifaComision;
	}

	public void setTarifaComision(double tarifaComision) {

		if (tarifaComision <= 0.0 || tarifaComision >= 1) {
			throw new IllegalArgumentException("La tarifa de comisión debe estar entre 0.0 y 1");
		} else {
			this.tarifaComision = tarifaComision;
		}
	}

	public double getIngreso() {
		ingreso();
		return ingreso;
	}

	// .........................................................................................................

	@Override
	public String getTareas() {
		return "Trabajar, trabajar como un empleado por comisión.";
	}

	@Override
	public String getInforme() {

		return informeEmpleadoComision.getInforme();
	}

	@Override
	public void ingreso() {

		this.ingreso = tarifaComision * ventasBrutas;
	}

	// ...............................................................................................................
	/**
	 * Devuelve la representación String de un objeto Estudiante.
	 */
	@Override
	public String toString() {
		return String.format("%s%n%s%nIngreso: %.2f%nTareas: %s%nInforme: %s",
				"Datos de un empleado por comisión:", super.toString(), getIngreso(), getTareas(), getInforme());

	}
}
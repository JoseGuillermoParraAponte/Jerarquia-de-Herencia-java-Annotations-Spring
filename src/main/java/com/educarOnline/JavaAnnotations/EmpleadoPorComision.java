package com.educarOnline.JavaAnnotations;

public class EmpleadoPorComision extends Empleado {

	// .........................................................................................................
	// Variables de instancia

	private double ingreso; // ingreso del empleado por semana.
	private double ventasBrutas; // ventas totales por semana.
	private double tarifaComision; // porcentaje de comisión.

	private Informe informeEmpleadoComision;

	// .........................................................................................................
	// Constructores(sobrecarga de constructores)

	public EmpleadoPorComision(String nombre, String apellido, String dni, String genero, int edad,
			String numeroSeguroSocial, double ventasBrutas, double tarifaComision, Informe informeEmpleadoComision) {
		super(nombre, apellido, dni, genero, edad, numeroSeguroSocial);

		if (ventasBrutas < 0.0) {
			throw new IllegalArgumentException("Las ventas brutas deben ser >=0.0");
		} else {
			this.ventasBrutas = ventasBrutas;
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

	// .........................................................................................................
	// Métodos getters y setters

	public double getVentasBrutas() {
		return ventasBrutas;
	}

	public void setVentasBrutas(double ventasBrutas) {
		if (ventasBrutas < 0.0) {
			throw new IllegalArgumentException("Las ventas brutas deben ser >=0.0");
		} else {
			this.ventasBrutas = ventasBrutas;
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
		return "Trabajar, trabajar como um empleado por comisión";
	}

	@Override
	public String getInforme() {

		return informeEmpleadoComision.getInforme();
	}

	@Override
	public void ingreso() {

		this.ingreso=tarifaComision*ventasBrutas;
	}
	
	@Override
	public String toString() {
		
		return String.format("Datos de un trabajador por comisión:%n"
				+ "Nombre: %s%nApellido: %s%nIngreso: %.2f%nTareas: %s%nInforme: %s", getNombre(),getApellido(),getIngreso(),getTareas(),getInforme());
	}

}

package com.educarOnline.JavaAnnotations;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

	// .........................................................................................................
	// VARIABLES DE INSTANCIA (ATRIBUTOS):

	private double salarioBase;
	private Informe informeEmpleadoBaseMasComision;

	// .........................................................................................................
	// CONSRUCTORES (SOBRECARGA DE CONTRUCTORES):

	public EmpleadoBaseMasComision(String nombre, String apellido, String dni, String genero, int edad,
			String numeroSeguroSocial, double ventasBrutas, double tarifaComision,
			Informe informeEmpleadoBaseMasComision, double salarioBase) {
		super(nombre, apellido, dni, genero, edad, numeroSeguroSocial, ventasBrutas, tarifaComision,
				informeEmpleadoBaseMasComision);

		try {
			if (salarioBase <= 0.0) {
				throw new IllegalArgumentException("El salario base debe ser > 0.0");
			} else {
				this.salarioBase = salarioBase;
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		this.informeEmpleadoBaseMasComision = informeEmpleadoBaseMasComision;
	}

	public EmpleadoBaseMasComision(Informe informeEmpleadoBaseMasComision) {
		super(informeEmpleadoBaseMasComision);
		this.informeEmpleadoBaseMasComision = informeEmpleadoBaseMasComision;
	}

	public EmpleadoBaseMasComision() {
		super();
	}

	// .........................................................................................................
	// Métodos Getters y Setters
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		try {
			if (salarioBase <= 0.0) {
				throw new IllegalArgumentException("El salario base debe ser > 0.0");
			} else {
				this.salarioBase = salarioBase;
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	// .........................................................................................................
	@Override
	public String getTareas() {
		return "Trabajar, trabajar como un empleado con un sueldo base y con comisión por ventas.";
	}

	@Override
	public String getInforme() {

		return informeEmpleadoBaseMasComision.getInforme();
	}

	@Override
	public void ingreso() {

		this.ingreso = getTarifaComision() * getVentasBrutas() + salarioBase;
	}

	// ...............................................................................................................
	/**
	 * Devuelve la representación String de un objeto Estudiante.
	 */
	@Override
	public String toString() {
		return String.format("%s%n%s%n",
				"Datos de un empleado con sueldo base más comisión:", super.toString());

	}

}

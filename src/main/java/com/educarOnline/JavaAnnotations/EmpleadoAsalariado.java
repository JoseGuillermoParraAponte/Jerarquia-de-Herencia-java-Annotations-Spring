package com.educarOnline.JavaAnnotations;

public class EmpleadoAsalariado extends Empleado {
	
	private double salarioSemanal;
	private double ingreso;
	private Informe informeEmpleadoAsalariado;
	

	public EmpleadoAsalariado(String nombre, String apellido, String dni, String genero, int edad,
			String numeroSeguroSocial, double salarioSemanal, Informe informeEmpleadoAsalariado) {
		super(nombre, apellido, dni, genero, edad, numeroSeguroSocial);
		
		if (salarioSemanal<0.0) {
			throw new IllegalArgumentException("EL salario semanal debe ser >=0.0");
		}else {
			this.salarioSemanal = salarioSemanal;
		}
		this.informeEmpleadoAsalariado=informeEmpleadoAsalariado;
	}

	


	public EmpleadoAsalariado(Informe informeEmpleadoAsalariado) {
		super();
		this.informeEmpleadoAsalariado = informeEmpleadoAsalariado;
	}




	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		
		if (salarioSemanal<0.0) {
			throw new IllegalArgumentException("EL salario semanal debe ser >=0.0");
		}else {
			this.salarioSemanal = salarioSemanal;
		}
	}
	
	public double getIngreso() {
		ingreso();
		return ingreso;
	}

	@Override
	public String getTareas() {
		
		return "Trabajar, trabajar como um empleado asalariado";
	}

	@Override
	public String getInforme() {
		
		return informeEmpleadoAsalariado.getInforme();
	}

	@Override
	public void ingreso() {
		
		this.ingreso=salarioSemanal;

	}
	
	
	
	@Override
	public String toString() {
		
		return String.format("Datos de un trabajador asalariado:%n"
				+ "Nombre: %s%nApellido: %s%nIngreso: %.2f%nTareas: %s%nInforme: %s", getNombre(),getApellido(),getIngreso(),getTareas(),getInforme());
	}

}

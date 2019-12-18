package com.educarOnline.JavaAnnotations;

public class EmpleadoPorHora extends Empleado {

	// .........................................................................................................
	// VARIABLES DE INSTANCIA (ATRIBUTOS):
	private double ingresos;
	private double horas; // Horas trabajadas por semana.
	private double sueldoPorHoras; // Sueldo por horas.

	private Informe informeEmpleadoPorHoras;

	// .........................................................................................................
	// CONSRUCTORES (SOBRECARGA DE CONTRUCTORES):
	
	public EmpleadoPorHora(String nombre, String apellido, String dni, String genero, int edad,
			String numeroSeguroSocial, double horas, double sueldoPorHoras, Informe informeEmpleadoPorHoras) {
		super(nombre, apellido, dni, genero, edad, numeroSeguroSocial);

		try {
			if (horas < 0.0 || horas > 168.0) {
				throw new IllegalArgumentException("El número de horas trabajadas deben ser >= 0.0 y <= 168.0");
			} else {
				this.horas = horas;
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			if (sueldoPorHoras <= 0.0) {
				throw new IllegalArgumentException("El sueldo por horas trabajadas deben ser > 0.0");
			} else {
				this.sueldoPorHoras = sueldoPorHoras;
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		this.informeEmpleadoPorHoras = informeEmpleadoPorHoras;
	}

	public EmpleadoPorHora(Informe informeEmpleadoPorHoras) {
		this.informeEmpleadoPorHoras = informeEmpleadoPorHoras;
	}
	
	public EmpleadoPorHora() {
		super();
	}

	// .........................................................................................................
	// Métodos Setters y Getters
	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		try {
			if (horas < 0.0 || horas > 168.0) {
				throw new IllegalArgumentException("El número de horas trabajadas deben ser >= 0.0 y <= 168.0");
			} else {
				this.horas = horas;
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public double getSueldoPorHoras() {
		return sueldoPorHoras;
	}

	public void setSueldoPorHoras(double sueldoPorHoras) {
		try {
			if (sueldoPorHoras <= 0.0) {
				throw new IllegalArgumentException("El sueldo por horas trabajadas deben ser > 0.0");
			} else {
				this.sueldoPorHoras = sueldoPorHoras;
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	public double getIngreso() {
		ingreso();
		return ingresos;
	}
	
	@Override
	public String getTareas() {
		return "Trabajar, trabajar como un empleado por horas.";
	}

	@Override
	public String getInforme() {
		
		return informeEmpleadoPorHoras.getInforme();
	}

	@Override
	public void ingreso() {
		
		if(horas <= 40) {
			this.ingresos=sueldoPorHoras*horas;
		}else {
			
			this.ingresos=sueldoPorHoras*(1.5*horas-20);   //Las horas extras se pagan a 1.5*sueldoPorHoras
		}
	}
	
	/**
	 * Devuelve la representación String de un objeto EmpleadoPorHora.
	 */
	@Override
	public String toString() {
		return String.format("%s%n%s%nIngreso: %.2f%nTareas: %s%nInforme: %s",
				"Datos de un empleado por hora:", super.toString(), getIngreso(), getTareas(), getInforme());

	}

}

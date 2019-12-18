package com.educarOnline.JavaAnnotations;

public class InformeEmpleadoPorHoras implements Informe {

	@Override
	public String getInforme() {
		return "Este es el informe de un trabajador con un ingreso en función de las horas de trabajo.";
	}

}

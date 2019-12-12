package com.educarOnline.JavaAnnotations;

public class InformeEmpleadoAsalariado implements Informe {

	@Override
	public String getInforme() {

		return "Este es el informe de un empleado asalariado";
	}

}

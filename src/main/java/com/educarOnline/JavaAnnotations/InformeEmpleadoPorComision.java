package com.educarOnline.JavaAnnotations;

public class InformeEmpleadoPorComision implements Informe {

	@Override
	public String getInforme() {
		
		return "Este es el informe de un empleado por comisión.";
	}

}

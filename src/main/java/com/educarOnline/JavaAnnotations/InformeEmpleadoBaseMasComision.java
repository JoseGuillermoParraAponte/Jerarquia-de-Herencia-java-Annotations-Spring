package com.educarOnline.JavaAnnotations;

public class InformeEmpleadoBaseMasComision implements Informe {

	@Override
	public String getInforme() {
		
		return "Este es el informe de un empleado con un sueldo base y comisión.";
	}

}

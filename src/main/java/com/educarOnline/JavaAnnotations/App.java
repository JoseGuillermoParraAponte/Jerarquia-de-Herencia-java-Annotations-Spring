package com.educarOnline.JavaAnnotations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Clase para testear el proyecto. Esta clase contiene el método main.
 * 
 * @author José Parra
 *
 */
public class App {
	public static void main(String[] args) {

		// Leer el class de configuración

		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(
				PersonaConfiguration.class);

		// Pedir Bean al contenedor de spring
		EstudianteBecaServicio e1 = contexto.getBean("estudianteBecaServicio", EstudianteBecaServicio.class);
		e1.setNombre("Jose Guillermo");
		e1.setApellido("Parra Aponte");
		e1.setEdad(33);
		e1.setGenero("Masculino");
		e1.setDni("18232212");
		e1.setUniversidad("Universidad de Carabobo");
		e1.setCarreraUniversitaria("Maestria en Matemáticas Aplicadas");
		e1.setTiempoServicio(1.2);
		// System.out.println(e1.toString());
		// System.out.println();
		// System.out.println("-------------------------------------------------------------------------------");

		EstudianteBecaEstudio e2 = contexto.getBean("estudianteBecaEstudio", EstudianteBecaEstudio.class);
		e2.setNombre("Doralis Teomara");
		e2.setApellido("Quiñonez Rosales");
		e2.setEdad(31);
		e2.setGenero("Femenino");
		e2.setDni("95977779");
		e2.setUniversidad("Universidad de Carabobo");
		e2.setCarreraUniversitaria("Ingenieria Industrial");
		// System.out.println(e2.toString());
		// System.out.println();
		// System.out.println("-------------------------------------------------------------------------------");

		EmpleadoAsalariado t1 = contexto.getBean("empleadoAsalariado", EmpleadoAsalariado.class);
		t1.setNombre("Ana Karina");
		t1.setApellido("Parra Aponte");
		t1.setEdad(32);
		t1.setGenero("Femenino");
		t1.setDni("95937395");
		t1.setNumeroSeguroSocial("XLM-95937395");
		t1.setSalarioSemanal(20000);
		// System.out.println(t1.toString());
		// System.out.println();
		// System.out.println("-------------------------------------------------------------------------------");

		EmpleadoPorComision t2 = contexto.getBean("empleadoPorComision", EmpleadoPorComision.class);
		t2.setNombre("Klenis del Valle");
		t2.setApellido("Aponte Aponte");
		t2.setEdad(22);
		t2.setGenero("Femenino");
		t2.setDni("22222222222");
		t2.setNumeroSeguroSocial("XLM-2222222222");
		t2.setVentasBrutas(5000);
		t2.setTarifaComision(0.3);
		// System.out.println(t2.toString());
		// System.out.println();
		// System.out.println("-------------------------------------------------------------------------------");

		EmpleadoBaseMasComision t22 = contexto.getBean("empleadoBaseMasComision", EmpleadoBaseMasComision.class);
		t22.setNombre("Nilda Margarita");
		t22.setApellido("Aponte Aponte");
		t22.setEdad(56);
		t22.setGenero("Femenino");
		t22.setDni("7099066");
		t22.setNumeroSeguroSocial("NMA-7099066");
		t22.setVentasBrutas(5000);
		t22.setTarifaComision(0.3);
		t22.setSalarioBase(3000);
		// System.out.println(t22.toString());
		// System.out.println();
		// System.out.println("-------------------------------------------------------------------------------");

		EmpleadoPorHora t3 = contexto.getBean("empleadoPorHora", EmpleadoPorHora.class);
		t3.setNombre("Yarelis Alexandra");
		t3.setApellido("Parra Gómez");
		t3.setEdad(6);
		t3.setGenero("Femenino");
		t3.setDni("18232212");
		t3.setNumeroSeguroSocial("YAP-18232212");
		t3.setHoras(50);
		t3.setSueldoPorHoras(200.0);
		// System.out.println(t3.toString());

		contexto.close();
		// ..................................................................................................
		// ..................................................................................................
		// Creación de la colección de Objetos de tipo Persona

		List<Persona> personas = new ArrayList<Persona>();

		// Agregando Objetos(Persona) a las colección.
		personas.add(e1);
		personas.add(e2);
		personas.add(t1);
		personas.add(t2);
		personas.add(t22);
		personas.add(t3);

		// Recorriendo la colección
		for (Persona persona : personas) {

			System.out.println(persona.toString());
			System.out.println();
			System.out.println("-------------------------------------------------------------------------------");
		}

	}
}

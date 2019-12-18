package com.educarOnline.JavaAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Clase de configuración de Spring con código java.
 * 
 * @author José Parra
 */

@Configuration
@ComponentScan("com.educarOnline.JavaAnnotations")
public class PersonaConfiguration {

	@Bean
	public Informe informeEstudianteBecaServicio() {

		return new InformeEstudianteBecaServicio();

	}

	@Bean
	public EstudianteBecaServicio estudianteBecaServicio() {

		return new EstudianteBecaServicio(informeEstudianteBecaServicio());
	}

	@Bean
	public Informe informeEstudianteBecaEstudio() {

		return new InformeEstudianteBecaEstudio();

	}

	@Bean
	public EstudianteBecaEstudio estudianteBecaEstudio() {

		return new EstudianteBecaEstudio(informeEstudianteBecaEstudio());
	}

	@Bean
	public Informe informeEmpleadoAsalariado() {
		return new InformeEmpleadoAsalariado();
	}

	@Bean
	public EmpleadoAsalariado empleadoAsalariado() {
		return new EmpleadoAsalariado(informeEmpleadoAsalariado());

	}

	@Bean
	public Informe informeEmpleadoPorComision() {
		return new InformeEmpleadoPorComision();
	}

	@Bean
	public EmpleadoPorComision empleadoPorComision() {
		return new EmpleadoPorComision(informeEmpleadoPorComision());

	}

	@Bean
	public Informe informeEmpleadoBaseMasComision() {
		return new InformeEmpleadoBaseMasComision();
	}

	@Bean
	public EmpleadoBaseMasComision empleadoBaseMasComision() {
		return new EmpleadoBaseMasComision(informeEmpleadoBaseMasComision());

	}

	@Bean
	public Informe informeEmpleadoPorHoras() {
		return new InformeEmpleadoPorHoras();
	}

	@Bean
	public EmpleadoPorHora empleadoPorHora() {
		return new EmpleadoPorHora(informeEmpleadoPorHoras());

	}

}

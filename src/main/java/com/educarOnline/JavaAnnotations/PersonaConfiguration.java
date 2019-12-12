package com.educarOnline.JavaAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author 
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
	
	

}

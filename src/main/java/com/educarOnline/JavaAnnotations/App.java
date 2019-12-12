package com.educarOnline.JavaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	//leer el class de configuración
    	
    	AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(PersonaConfiguration.class);
    		
    	EstudianteBecaServicio e1 = contexto.getBean("estudianteBecaServicio",EstudianteBecaServicio.class);
    	e1.setNombre("Jose Guillermo");
    	e1.setApellido("Parra Aponte");
    	EstudianteBecaEstudio e2 = contexto.getBean("estudianteBecaEstudio",EstudianteBecaEstudio.class);
    	e2.setNombre("Doralis Teomara");
    	e2.setApellido("Quiñonez Rosales");
    	EmpleadoAsalariado t1 = contexto.getBean("empleadoAsalariado",EmpleadoAsalariado.class);
    	t1.setNombre("Ana Karina");
    	t1.setApellido("Parra Aponte");
    	t1.setSalarioSemanal(20000);
    	
    	System.out.println(e1.toString());
    	System.out.println();
    	System.out.println(e2.toString());
    	System.out.println();
    	System.out.println(t1.toString());
    	
    	
    	
    }
}

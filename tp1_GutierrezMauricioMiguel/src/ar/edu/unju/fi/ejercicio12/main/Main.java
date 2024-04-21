package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;
public class Main {

	public static void main(String[] args) {


			
				Scanner entrada = new Scanner(System.in);
				Persona persona1 = new Persona();
				System.out.println("INGRESE NOMBRE");
				persona1.setNombre(entrada.nextLine());
			    System.out.println("Ingrese fecha de nacimiento");
			    System.out.println("Ingrese anio yyyy:");
			    int anio = entrada.nextInt();
			    System.out.println("Ingrese mes mm:");
			    int mes = entrada.nextInt();
			    System.out.println("Ingrese dia dd:");
			    int dia = entrada.nextInt();
				Calendar Fecha = Calendar.getInstance();
				Fecha.set(anio,mes-1,dia);
				persona1.setFechadeN(Fecha);
				//Usando los metodos accesores
				//publicarCapacitacion(persona1); 
		       System.out.println("NOMBRE :"+persona1.getNombre());
		       System.out.println("FECHA DE NACIMIENTO :"+persona1.getFechadeN().getTime() +" - "+dia+"/"+mes+"/"+anio);
		       System.out.println("EDAD :"+persona1.Edad()+" anios");
		       System.out.println("SIGNO DEL ZODIACO :"+persona1.signo(dia,mes));
		       System.out.println("ESTACION :"+persona1.estacion(dia,mes));
			

	

	}

}

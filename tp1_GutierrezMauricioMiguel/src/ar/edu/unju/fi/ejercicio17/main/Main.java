package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;




public class Main {
	
	public static void main(String[] args) {
		ArrayList<Jugador> jugadores = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
	   int opcion = 0; 
		while (opcion !=8) {
			System.out.println("1 – Alta de jugador");
			System.out.println("2 – Mostrar los datos del jugador ");
			System.out.println("3 – Mostrar todos los jugadores ordenados por apellido.");
			System.out.println("4 – Modificar los datos de un jugador");
			System.out.println("5 – Eliminar un jugador ");
			System.out.println("6 – Mostrar la cantidad total de jugadores que tiene el ArrayList.");
			System.out.println("7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
			
			System.out.println("8 – Salir.");
			System.out.println("ELIJA OPCION :");
		 opcion = sc.nextInt();
		switch (opcion) {
			case 1:
				System.out.println("---- ALTA DE JUGADOR----");
				Jugador persona = new Jugador();
				System.out.println("Ingrese nombre: ");
				sc.nextLine();
				persona.setNombre(sc.nextLine());
				System.out.println("Ingrese apellido: ");
				persona.setApellido(sc.nextLine());
				System.out.println("Ingrese Fecha de Nacimiento: ");
				//String fecha = sc.nextLine();
				LocalDate fecha = LocalDate.parse(sc.nextLine());
			    persona.setFechadeN(fecha);
			    System.out.println("Ingrese nacionalidad: ");
			    persona.setNacionalidad(sc.nextLine());
			    System.out.println("Ingrese Posicion :");
			    persona.setPosición(sc.nextLine());
			    System.out.println("Ingrese estatura: ");
			    persona.setEstatura(sc.nextDouble());
			    System.out.println("Ingrese peso: ");
			    persona.setPeso(sc.nextDouble());
			    jugadores.add(persona);
			   System.out.println("ALTA DE JUGADOR CON EXITO");
			   break;
			case 2:; System.out.println("MOSTRAR DATOS DE JUGADOR");
			System.out.println("Ingrese nombre");
			sc.nextLine();
			String auxN = sc.nextLine();
			System.out.println("Ingrese apellido");
			String auxA = sc.nextLine();
			boolean jugadorEncontrado = false;
			for (Jugador jugador : jugadores) {
			    if (jugador.getNombre().equals(auxN) && jugador.getApellido().equals(auxA)) {
			        mostrarDatosJugador(jugador);
			        jugadorEncontrado = true;
			        
			    }
			}

			if (!jugadorEncontrado) {
			    System.out.println("Jugador no encontrado en el array.");
			   
			}
			break;
			case 3: System.out.println("Mostrar jugadores ordenados pode apellido");
			jugadores.sort(Comparator.comparing(Jugador::getApellido));
	    	for ( Jugador jugar : jugadores) {
	    		System.out.println("Nombre: "+jugar.getNombre()+" "+jugar.getApellido());
	    	
	    	}
				break;
			case 4: System.out.println("MODIFICAR DATOS DEL JUGADOR");
			System.out.println("Ingrese nombre");
			sc.nextLine();
			String auxNom = sc.nextLine();
			System.out.println("Ingrese apellido");
			String auxApe = sc.nextLine();
			for (Jugador jugador2 : jugadores) {
			    if (jugador2.getNombre().equals(auxNom) && jugador2.getApellido().equals(auxApe)) {
			    	System.out.println("Ingrese nombre: ");
					jugador2.setNombre(sc.nextLine());
					System.out.println("Ingrese apellido: ");
					jugador2.setApellido(sc.nextLine());
					System.out.println("Ingrese Fecha de Nacimiento: ");
					//String fecha = sc.nextLine();
					LocalDate fecha2 = LocalDate.parse(sc.nextLine());
				    jugador2.setFechadeN(fecha2);
				    System.out.println("Ingrese nacionalidad: ");
				    jugador2.setNacionalidad(sc.nextLine());
				    System.out.println("Ingrese Posicion :");
				    jugador2.setPosición(sc.nextLine());
				    System.out.println("Ingrese estatura: ");
				    jugador2.setEstatura(sc.nextDouble());
				    System.out.println("Ingrese peso: ");
				    jugador2.setPeso(sc.nextDouble());
			    	System.out.println("Datos modificados");
			    }
			    else {
			    	System.out.println( "No se encontro el jugador");
			    }
			}
			      
				break;
			case 5: 
				Iterator<Jugador>itera = jugadores.iterator();
				System.out.println("BORRAR UN JUGADOR");
				System.out.println("Ingrese nombre");
				sc.nextLine();
				String Nomb = sc.nextLine();
				System.out.println("Ingrese apellido");
				String Apeb = sc.nextLine();
			  	while(itera.hasNext()) {
			  		Jugador borrado = itera.next();
			  		if (borrado.getNombre().equals(Nomb) && borrado.getApellido().equals(Apeb))
			  				{
			  	itera.remove();
			  	System.out.println("Jugador borrado");
			  	}
			  	else {
			  		System.out.println("No se encontro el jugador");
			  	}
			  	}
			  	
				break;
			case 6:
				System.out.println("Jugadore totales: "+jugadores.size());
				break;
			case 7: 
				System.out.println("Ingrese la nacionalidad: ");
			int cont = 0;
			sc.nextLine();
			String nac = sc.nextLine();
				for (Jugador jugador3 : jugadores) {
				    if (jugador3.getNacionalidad().equals(nac)) {
				    	cont++;
				    }
				}
				System.out.println("Cantidad de "+nac+" = "+cont);
				
				break;
			 default:
	              System.out.println("Opcion invalida");
	              break;
	              
		}
		
		}
		System.out.println("Saliendo..");
	}

	private static void mostrarDatosJugador(Jugador jugador) {
	    System.out.println("Nombre: " + jugador.getNombre());
	    System.out.println("Apellido: " + jugador.getApellido());
	    System.out.println("Fecha de nacimiento: " + jugador.getFechadeN());
	    System.out.println("Nacionalidad: " + jugador.getNacionalidad());
	    System.out.println("Posicion: " + jugador.getPosición());
	    System.out.println("Estatura: " + jugador.getEstatura());
	    System.out.println("Peso: " + jugador.getPeso());
	}
    
    
}
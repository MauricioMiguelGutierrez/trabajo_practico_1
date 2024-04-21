package ar.edu.unju.fi.ejercicio18.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.Destino_Turistico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
	ArrayList<Pais> paises = new ArrayList<>();
	ArrayList<Destino_Turistico> destinos = new ArrayList<>();
	paises.add( new Pais("A1","Argentina"));
	paises.add(new Pais( "A2","Peru"));
	
	 int opcion = 0; 
		while (opcion !=9) {
			System.out.println("1 – Alta de destino turistico");
			System.out.println("2 – Mostrar todos los destino turisticos ");
			System.out.println("3 – Modificar el pais de un destino turistico");
			System.out.println("4 – Limpiar el arrysList de destino turisticos");
			System.out.println("5 – Eliminar un destino turistico ");
			System.out.println("6 – Mostrar Los destinos turisticos ordenados por nombre.");
			System.out.println("7 – Mostrar todos los paises");
			System.out.println("8 – Mostrar los destinos turisticos q pertenecen a un pais");
			System.out.println("9 – Salir.");
			System.out.println("ELIJA OPCION :");
		 opcion = sc.nextInt();
		switch (opcion) {
		case 1: System.out.println("---- ALTA DE Destino Turistico----");
		Destino_Turistico dest = new Destino_Turistico();
		System.out.println("Ingrese Codigo: ");
		sc.nextLine();
		dest.setCodigo(sc.nextLine());
		System.out.println("Ingrese Nombre: ");
		 dest.setNombre(sc.nextLine());
		System.out.println("Ingrese Codigo de pais: ");
		boolean bol = false;
		while (bol==false) {
			String codd = sc.nextLine();
		   for (Pais k:paises) {
			   if (k.getCodigo().equals(codd)) {
			dest.setPais(k);
			bol = true;
           }
			   else {System.out.println("No existe codigo para ese pais");
			     System.out.println("Vuelva a escribirlo");
			   }
		   }
		}
		System.out.println("Ingrese Precio: ");
	    dest.setPrecio(sc.nextDouble());
	    System.out.println("Ingrese Dias: ");
	    dest.setPrecio(sc.nextInt());
	    destinos.add(dest);
	   System.out.println("ALTA DE DESTINO TURISTICO");
	   break;
		case 2:System.out.println("TODOS LOS DESTINOS");
		for (Destino_Turistico i : destinos) {
			System.out.println(i.toString());
		}
		break;
		case 3: System.out.println("Modificar el pais de un destino");
		System.out.println("Ingrese nombre Destino");
		String auxnom = sc.nextLine();
		for (Destino_Turistico l : destinos) {
			 if (l.getNombre().equals(auxnom)) {
				 System.out.println("Ingrese Pais: ");
					boolean bole = false;
					while (bole==false) {
						String nomP = sc.nextLine();
					   for (Pais j:paises) {
						   if (j.getNombre().equals(nomP)) {
						l.setPais(j);
						bol = true;
			           }
						   else {System.out.println("No existe ese pais");
						     System.out.println("Vuelva a escribirlo");
						   }
					   }
					}
					System.out.println("PAIS MODIFICADO");
			 }
			 else System.out.println("No se encontro el destino");	    
		}
		break;
		case 4: System.out.println("Limpiando la Arrays");
			Iterator<Destino_Turistico>itera = destinos.iterator();
			while(itera.hasNext()) {
				itera.next();
		  				itera.remove();
		  	System.out.println("..Array limpia");
		  	}
			break;
		case 5 :Iterator<Destino_Turistico>iterad = destinos.iterator();
		System.out.println("BORRAR UN DESTINO");
		System.out.println("Ingrese codigo");
		sc.nextLine();
		String cod = sc.nextLine();
	  	while(iterad.hasNext()) {
	  		Destino_Turistico borrado = iterad.next();
	  		if (borrado.getCodigo().equals(cod)){
	  	iterad.remove();
	  	System.out.println("Destino borrado");
	  	}
	  	else {
	  		System.out.println("No se encontro el destino");
	  	}
	  	}
	  	break;
		case 6:System.out.println("Mostrar destinos ordenados por nombre");
		destinos.sort(Comparator.comparing(Destino_Turistico::getCodigo));
    	for ( Destino_Turistico jugar : destinos) {
    		System.out.println("Nombre: "+jugar.getNombre());
    	
    	}
    	break;
		case 7 :for (Pais pais : paises) {
		    System.out.println("Nombre: " + pais.getNombre());
		    System.out.println("Código: " + pais.getCodigo());
		    System.out.println("----------"); 
		}
		break;
		case 8:	System.out.println("Ingrese el codigo de pais: ");
		int cont = 0;
		sc.nextLine();
		String nac = sc.nextLine();
			for (Destino_Turistico m : destinos) {
			    if (m.getPais().getCodigo().equals(nac)) {
			    	System.out.println(m.toString());
			    }
			}			
			break;
		 default:
              System.out.println("Opcion invalida");
              break;
}
}
}
}
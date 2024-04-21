package ar.edu.unju.fi.ejercicio16;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     String[] nombres = new String[5]; //
	     for (int i = 0; i < nombres.length; i++) {
	         System.out.print("INGRESAR EL Nombre para " + i + ": ");
	         nombres[i] = scanner.next();
	     }
	     int i=0;
	     System.out.println("----Valores---");
	     while (nombres.length > i) {
	    	 System.out.println("Valor de "+i+" :"+nombres[i]);
	    	 i++;
	     }
	
	  System.out.println("Tamanio: "+nombres.length);
	  
	System.out.println("Ingrese el indice rango [0,4] a elimniar: ");
	scanner.nextLine();
	byte ind = scanner.nextByte();
	int aux = 0 ;
	 if (ind <= nombres.length-1 && ind >= 0 ) {
			if (ind == 4) {
			nombres[ind]= " ";
			}
			else {
			do {
			  nombres[ind] = nombres[ind+1];
			  ind++;
			}
			while  (ind < nombres.length-1);
			nombres[4]= " ";   
	        }
			while (nombres.length > aux) {
		    	 System.out.println("Valor de "+aux+" :"+nombres[aux]);
		    	 aux++;
			}
     }
	 
	 else {
		 System.out.println("Indice invalido");
	 }
}
}
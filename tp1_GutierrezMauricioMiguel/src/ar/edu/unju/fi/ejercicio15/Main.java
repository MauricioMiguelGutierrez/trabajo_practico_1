package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("INGRESE UN NUMERO ENTERO que se encuentre en el rango [5,10]");
		 int rango = scanner.nextInt();
   if (rango >=5 && rango <=10) 
        {
	     String[] elementos = new String[rango]; 
    
	      
	     for (int i = 0; i < elementos.length; i++) {
	         System.out.print("Para la posicion "+i+" Ingrese un nombre: ");
	         elementos[i] = scanner.next();
	     }
	  System.out.println("\nIndice\tValor");
	     for (int i = 0; i < elementos.length; i++) {
	         System.out.println(i + "\t" + elementos[i]);
	         }
	     System.out.println("----------------------");
	     System.out.println("----------------------");
	     System.out.println("\nIndice\tValor");
	     for (int i = elementos.length-1; i >= 0 ; i--) {
	    	 System.out.println(i + "\t" + elementos[i]);
	         }
	      }
   else {
	    	 System.out.println("El rango igresado no es valido");
	     }

	}

}

package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("INGRESE UN NUMERO ENTERO que se encuentre en el rango [3,10]");
		 int rango = scanner.nextInt();
   if (rango >=3 && rango <=10) 
        {
	     int[] elementos = new int[rango]; // Array creada
         int aux = 0;
	      
	     for (int i = 0; i < elementos.length; i++) {
	         System.out.print("INGRESAR EL NUNMERO PARA LA POSICION " + i + ": ");
	         elementos[i] = scanner.nextInt();
	     }
	     System.out.println("\nIndice\tValor");
	     for (int i = 0; i < elementos.length; i++) {
	         System.out.println(i + "\t" + elementos[i]);
	         }
	     for (int i = 0; i < elementos.length; i++) {
	         aux = aux + elementos[i];
	         }
	     System.out.println("La suma de los elementos es :"+aux);
		 }
   else {
	    	 System.out.println("El rango igresado no es valido");
	     }
	   
	 
	}

}
package ar.edu.unju.fi.ejercicio13.main;

import java.util.Scanner;

public class Main {
  
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     int[] elementos = new int[8]; // Array de 8 elementos

     // Le pedimos al usuario por medio de una Estructura iterativa
     //El ingreso de los valores para la array 
     for (int i = 0; i < elementos.length; i++) {
         System.out.print("INGRESAR EL NUNMERO PARA LA POSICION " + i + ": ");
         elementos[i] = scanner.nextInt();
     }

     // Mostramos los valores y su posicion
     System.out.println("\nIndice\tValor");
     for (int i = 0; i < elementos.length; i++) {
         System.out.println(i + "\t" + elementos[i]);
     }
 }
}
	
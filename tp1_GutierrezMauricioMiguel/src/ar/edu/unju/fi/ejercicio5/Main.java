package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        int aux;
        Scanner scaner = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero(entre 1 y 9): ");
            numero = scaner.nextInt();
        } while (numero < 1 || numero > 9);
        for(int i = 0;i <= 10;i++) {
            aux = numero * i;
            System.out.println(numero+ " x " +i+ " = "+aux); 
        }
    }
}

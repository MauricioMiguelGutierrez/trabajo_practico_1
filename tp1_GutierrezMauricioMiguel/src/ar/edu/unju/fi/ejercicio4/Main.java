package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int num = 0;
        int factorial = 1;
        int i = 1;
        do {
            System.out.println("Ingrese un valor(entre 0 y 10): ");
            num = scaner.nextInt(); 
        } while (num < 0 || num > 10 );  

        if (num != 0 && num != 1) {
            while(i<=num) {
                factorial = factorial * i;
                i++;
            } 
            System.out.println("El factoreo de "+num+" es "+factorial);
        } 
        else {
            System.out.println("El factoreo de "+num+" es 1");
        }   
    }
}
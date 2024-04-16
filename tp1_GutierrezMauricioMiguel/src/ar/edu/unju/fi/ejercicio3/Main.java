package ar.edu.unju.fi.ejercicio3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num = scaner.nextInt();
        if (num % 2 == 0) {
            int par = num * 3;
            System.out.println(par);
        }
        else {
            int impar = num * 2;
            System.out.println(impar);
        }

    }
}
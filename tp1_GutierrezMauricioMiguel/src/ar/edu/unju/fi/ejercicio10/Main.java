package ar.edu.unju.fi.ejercicio10;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.Pizza;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        Pizza pizza = new Pizza();
        while (i <= 3) {
            System.out.println("\nIngrese el diamento de la Piza(20,30,40): ");
            int diamentro = scanner.nextInt();
            System.out.println("Tiene ingredientes Especiales(true/false): ");
            boolean ingredientes = scanner.nextBoolean();
            pizza.setDiametro(diamentro);
            pizza.setIngredientesEspeciales(ingredientes);
            pizza.setPrecio(pizza.calcularPrecio());
            pizza.setArea(pizza.calcularArea());
            System.out.println("\n*** Pizza "+i+" ***");
            System.out.println(pizza);
            i++;
        }
    }
}


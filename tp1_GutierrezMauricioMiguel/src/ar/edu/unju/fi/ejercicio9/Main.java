package ar.edu.unju.fi.ejercicio9;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.Producto;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        Producto producto = new Producto();
        Scanner scanner = new Scanner(System.in);
        while (i <= 3) {
            System.out.println("\nIngrese el nombre del producto: ");
            String nombre = scanner.next();
            System.out.println("Ingrese el Codigo: ");
            int codigo = scanner.nextInt();
            System.out.println("Ingrese el Precio: ");
            float precio = scanner.nextFloat();
            producto.setNombre(nombre);
            producto.setCodigo(codigo);
            producto.setPrecio(precio);
            System.out.println(producto);
            i++;
        }
    }
}

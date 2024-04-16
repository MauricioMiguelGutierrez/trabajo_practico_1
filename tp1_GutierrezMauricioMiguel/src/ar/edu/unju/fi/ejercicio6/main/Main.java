package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {
    public static void main(String[] args) {
        String dni,nombre;
        int dia,mes,anio;

        Scanner scanner = new Scanner(System.in);
        
        // Usando constructor por defecto
        System.out.println("###############################################");
        Persona persona1 = new Persona();
        System.out.println(persona1);

        // Usando constructor con dni, nombre y fecha de nacimento
        System.out.println("\n###############################################\n");
        System.out.println("Ingrese su DNI");
        dni = scanner.next();

        System.out.println("Ingrese su Nombre");
        nombre = scanner.next();

        System.out.println("Ingrese dia de nacimiento");
        dia = scanner.nextInt();

        System.out.println("Ingrese mes de nacimiento");
        mes = scanner.nextInt();

        System.out.println("Ingrese año de nacimiento");
        anio = scanner.nextInt();

        Persona persona2 = new Persona(dni,nombre,LocalDate.of(anio,mes,dia));
        System.out.println(persona2);

        // Usando constructor con todos los parametros
        System.out.println("\n###############################################\n");
        System.out.println("Ingrese su DNI");
        dni = scanner.next();

        System.out.println("Ingrese su Nombre");
        nombre = scanner.next();

        System.out.println("Ingrese dia de nacimiento");
        dia = scanner.nextInt();

        System.out.println("Ingrese mes de nacimiento");
        mes = scanner.nextInt();

        System.out.println("Ingrese año de nacimiento");
        anio = scanner.nextInt();

        System.out.println("Ingrese provincia");
        String provincia = scanner.next();

        Persona persona3 = new Persona(dni,nombre,LocalDate.of(anio,mes,dia),provincia);
        System.out.println(persona3);
    }
}

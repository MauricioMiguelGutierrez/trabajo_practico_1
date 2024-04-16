package ar.edu.unju.fi.ejercicio6;

import java.time.LocalDate;

public class Persona {
    private static final String PROVINCIA = "Jujuy";
    
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;
    private int edad;
    
    public Persona() {
        //this("40237384","Thomas", LocalDate.of(2001,02,28), PROVINCIA);
    } 

    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this(dni, nombre, fechaNacimiento, PROVINCIA);
    }

    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        setDni(dni);
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setProvincia(provincia);
        this.edad = calcularEdad();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int calcularEdad() {
        if (getFechaNacimiento() != null) return LocalDate.now().getYear() - getFechaNacimiento().getYear();
        return 0;
    }

    public boolean esMayor() {
        return edad >= 18;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDatos");
        sb.append("\nDNI: ").append(getDni());
        sb.append("\nNombre: ").append(getNombre());
        sb.append("\nFecha de naciminto: ").append(getFechaNacimiento());
        sb.append("\nProvincia: ").append(getProvincia());
        sb.append("\nEdad: ").append(edad);
        if (esMayor()) sb.append("\nEs mayor de edad");
        else sb.append("\nEs menor de edad");
        return sb.toString();
    }
}    
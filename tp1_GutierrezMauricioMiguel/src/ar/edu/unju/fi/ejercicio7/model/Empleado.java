package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
    private static final Float MINIMO = 210000f;
    private static final Float AUMENTO = 20000f;

    private String nombre;
    private int legajo;
    private float salario;

    public Empleado(String nombre, int legajo, float salario) {
        setNombre(nombre);
        setLegajo(legajo);
        if(salario < MINIMO) setSalario(MINIMO);
        else setSalario(salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void aumentarSalario() {
        this.salario = this.salario + AUMENTO;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre del Empleado: ").append(getNombre());
        sb.append("\nLegajo: ").append(getLegajo());
        sb.append("\nSalario: ").append(getSalario());
        return sb.toString();
    }

    
}
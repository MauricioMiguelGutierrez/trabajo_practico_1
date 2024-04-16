package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
    private String nombre;
    private int codigo;
    private float precio;
    private int descuento = 20;

    public Producto() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public float calcularDescuento() {
        return this.precio = precio - (precio * descuento / 100);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre del Producto: ").append(getNombre());
        sb.append("\nCodigo del Producto: ").append(getCodigo());
        sb.append("\nPrecio Del Producto: ").append(getPrecio());
        sb.append("\nDescuento del Producto: ").append(calcularDescuento());

        return sb.toString();
    }
    
}
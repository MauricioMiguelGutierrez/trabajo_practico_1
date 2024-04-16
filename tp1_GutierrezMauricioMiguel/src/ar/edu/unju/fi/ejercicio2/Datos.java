package ar.edu.unju.fi.ejercicio2;

public class Datos {
	private String pais;
    private int edad;
    private float altura;
    private float precio;
    private int telefono;
    private float coseno;

    public Datos(String pais, int edad, float altura, float precio, int telefono, float coseno) {
        this.pais = pais;
        this.edad = edad;
        this.altura = altura;
        this.precio = precio;
        this.telefono = telefono;
        this.coseno = coseno;
    }

    public void mostarDatos() {
        System.out.println("Pais: "+pais);
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public float getCoseno() {
        return coseno;
    }

    public void setCoseno(float coseno) {
        this.coseno = coseno;
    }

}

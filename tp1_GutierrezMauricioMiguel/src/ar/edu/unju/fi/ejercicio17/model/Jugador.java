package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {
	private String Nombre;
    private String Apellido;
	private LocalDate FechadeN;
	private String Nacionalidad;
	private Double Estatura;
	private Double Peso;
	private String Posición;

	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param nombre
	 * @param apellido
	 * @param fechadeN
	 * @param nacionalidad
	 * @param estatura
	 * @param peso
	 * @param posición
	 */
	public Jugador(String nombre, String apellido, LocalDate fechadeN, String nacionalidad, Double estatura,
			Double peso, String posición) {
		Nombre = nombre;
		Apellido = apellido;
		FechadeN = fechadeN;
		Nacionalidad = nacionalidad;
		Estatura = estatura;
		Peso = peso;
		Posición = posición;
	}
    
    @Override
	public String toString() {
		return "Jugador [Nombre=" + Nombre + ", Apellido=" + Apellido + ", FechadeN=" + FechadeN + ", Nacionalidad="
				+ Nacionalidad + ", Estatura=" + Estatura + ", Peso=" + Peso + ", Posición=" + Posición + "]";
	}


	public long calcularEdad () {
    	
    	LocalDate fechactual = LocalDate.now();
    	Period dias = Period.between(this.getFechadeN(), fechactual);
    	return dias.getYears();
    			}
    	
	
	
	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApellido() {
		return Apellido;
	}


	public void setApellido(String apellido) {
		Apellido = apellido;
	}


	public LocalDate getFechadeN() {
		return FechadeN;
	}


	public void setFechadeN(LocalDate fechadeN) {
		FechadeN = fechadeN;
	}


	public String getNacionalidad() {
		return Nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}


	public Double getEstatura() {
		return Estatura;
	}


	public void setEstatura(Double estatura) {
		Estatura = estatura;
	}


	public Double getPeso() {
		return Peso;
	}


	public void setPeso(Double peso) {
		Peso = peso;
	}


	public String getPosición() {
		return Posición;
	}


	public void setPosición(String posición) {
		Posición = posición;
	}
}
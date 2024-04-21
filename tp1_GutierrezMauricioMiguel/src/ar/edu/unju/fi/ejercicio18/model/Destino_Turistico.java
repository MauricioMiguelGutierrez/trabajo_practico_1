package ar.edu.unju.fi.ejercicio18.model;
public class Destino_Turistico {
	 private String codigo;
	 private String nombre;
	 private double precio;
	 private Pais pais;
	 private int cdias;
	 public Destino_Turistico() {
	}
	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 * @param pais
	 * @param cdias
	 */
	public Destino_Turistico(String codigo, String nombre, double precio, Pais pais, int cdias) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.cdias = cdias;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getCdias() {
		return cdias;
	}
	public void setCdias(int cdias) {
		this.cdias = cdias;
	}
	@Override
	public String toString() {
		return "Destino_Turistico [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", pais=" + pais
				+ ", cdias=" + cdias + "]";
	}
	 
	}

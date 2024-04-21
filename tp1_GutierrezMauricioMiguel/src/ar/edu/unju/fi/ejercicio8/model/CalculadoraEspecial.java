package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {

	private int n ;
 
	
	
	
	
	public CalculadoraEspecial(int n) {
		this.n = n;
	}

	public void  calcularProductorial() {
		
	int resultado = 1;
	for (int k=1;k<=n;k++) {
		resultado = resultado * k*(k+4);
	}
	System.out.println("Resul del productorial" +resultado);
	}
	public void dcalcularSumatorial () {
		double resultado = 0;
		for (int k =1;k<=n;k++) {
			resultado = resultado + (((k*(k +1))/2)^2);
		}
		System.out.println("Resul del sumatorial :"+resultado);
	}
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	
}
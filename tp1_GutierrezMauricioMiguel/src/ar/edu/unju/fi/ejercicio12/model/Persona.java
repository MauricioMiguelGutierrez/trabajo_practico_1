package ar.edu.unju.fi.ejercicio12.model;
import java.util.Calendar;
public class Persona {
	   private String nombre;
	   private Calendar FechadeN;
	   
	   public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, Calendar fechadeN) {
		this.nombre = nombre;
		FechadeN = fechadeN;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechadeN() {
		return FechadeN;
	}

	public void setFechadeN(Calendar fechadeN) {
		FechadeN = fechadeN;
	}
	  public long Edad() {
		  Calendar hoy = Calendar.getInstance();
		  long milisegundos = hoy.getTimeInMillis() - FechadeN.getTimeInMillis();
			long dias = milisegundos/1000/60/60/24/364;
			return dias;
			} 
	  public String signo(int dia , int mes) {
		  String[] signosZ = {
	              "Acuario", "Piscis", "Aries", "Tauro", "Géminis", "Cáncer",
	              "Leo", "Virgo", "Libra", "Escorpio", "Sagitario", "Capricornio"
	      };
		  int aux = 0;
	      int[] FechaI = {20, 19, 21, 20, 21, 21, 23, 23, 23, 23, 22, 22};
	      int[] FechaF = {18, 20, 19, 20, 20, 22, 22, 22, 22, 21, 21, 19};

	      for (int i = 0; i < signosZ.length; i++) {
	          if ((mes == i && dia >= FechaI[i]) ||
	              (mes == (i + 1) && dia <= FechaF[i])) {
	        	  aux = i;
	          }  
	     
	      }

	      return signosZ[aux-1];

	  }
	  public String estacion (int dia , int mes) {
		  if (mes <=1 || mes > 12) {
	          return "Mes invalido";
	      }

	      switch (mes) {
	          case 1:
	          case 2:
	              return "VERANO";
	          case 3:
	              if (dia <= 19) {
	                  return "VERANO";
	              } else {
	                  return "OTONIO";
	              }
	          case 4:
	          case 5:
	              return "OTONIO";
	          case 6:
	              if (dia <= 22) {
	                  return "OTONIO";
	              } else {
	                  return "INVIERNO";
	              }
	          case 7:
	          case 8:
	              return "INVIERNO";
	          case 9:
	              if (dia <= 21) {
	                  return "INVIERNO";
	              } else {
	                  return "PRIMAVERA";
	              }
	          case 10:
	          case 11:
	        	  return "PRIMAVERA";
	          case 12:
	        	  if (dia <= 21) {
	                  return "PRIMAVERA";
	        	  } else {
	        		  return "VERANO";
	        	  }
	          default:
	              return null;
	      }
	  }
	  }
		
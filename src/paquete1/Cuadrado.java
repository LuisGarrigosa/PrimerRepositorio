/**
 * 
 */
package paquete1;

/**
 * @author LuisGarrigosa
 *
 */
public class Cuadrado {
	double lado;
	public Cuadrado() {
		
	}
	public Cuadrado(double miLado) {
	lado=miLado;	
	}
	public double calculaPerimetro() {
		return 4*lado;
	}
}

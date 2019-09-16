package practica1;

public class Circulo {
	double radio;
	Punto centro;
	
	public Circulo(double centro_x,double centro_y, double radio) {
		if (radio < 0) {
			throw new RuntimeException("Circulo con radio no válido");
		}
		this.radio=radio;
		this.centro=new Punto(centro_x,centro_y);
	}
	
	public void imprimir() {
		System.out.println("("+this.centro.x+","+this.centro.y+","+this.radio+")");
	}
	
	public double perimetro() {
		return 2*Math.PI*this.radio;
	}
	public double area() {
		return Math.PI*Math.pow(this.radio,2);
	}
	
	public void escalar(double factor) {
		this.radio*=factor;
	}
	public void desplazar(double desp_x,double desp_y) {
		this.centro.x+=desp_x;
		this.centro.y+=desp_y;
	}
	public static double distancia(Circulo c1,Circulo c2) {
		double distancia=Punto.distancia(c1.centro, c2.centro)-c1.radio-c2.radio;
		return distancia>0 ? distancia : 0;
	}
	public static boolean seTocan(Circulo c1,Circulo c2) {
		return distancia(c1,c2)==0 ? true:false; 
	}
	
	public boolean loContiene(Circulo otro) {
		return Punto.distancia(this.centro, otro.centro)+otro.radio<this.radio ? true:false;
	}
}

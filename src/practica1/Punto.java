package practica1;

public class Punto {
	double x;
	double y;
	
	public Punto() {
		this.x=0;
		this.y=0;
	}
	
	public Punto(double a, double b) {
		this.x=a;
		this.y=b;
	}
	
	public void imprimir() {
		System.out.println("("+this.x+","+this.y+")");
	}
	public void desplazar(double desp_x,double desp_y) {
		this.x+=desp_x;
		this.y+=desp_y;
	}
	public static double distancia(Punto p1, Punto p2) {
		return Math.sqrt(Math.pow(p1.x-p2.x, 2)+Math.pow(p1.y-p2.y, 2));
	}
}

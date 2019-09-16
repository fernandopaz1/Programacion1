package practica1;

public class PrueboPunto {

	public static void main(String[] args) {
		
		System.out.println("Pruebo la clase Punto del ejercicio 2\n");
		
		System.out.print("Creo un punto vacio inicializando en cero:  ");
		Punto p1=new Punto();
		p1.imprimir();
		
		System.out.print("Creo un punto con variables:  ");
		Punto p2=new Punto(1.5,3.1416);
		p2.imprimir();

		System.out.print("Desplazo el punto en cero:  ");
		p1.desplazar(6.4, 2.5);;
		p1.imprimir();
	
		System.out.print("La distania entre puntos es:  "+Punto.distancia(p1, p2));
	
		
	}

}

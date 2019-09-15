package clase8;

import java.awt.Point;
import java.awt.Rectangle;

public class PrueboEjercicios {

	public static void main(String[] args) {
		
		System.out.println("Pruebo ejercicio 1");
		
		Point p1=new Point(0,0);
		Point p2=new Point(1,1);
		
		System.out.print("La distancia entre los puntos:  ");
		Ejercicio1.printPoint(p1);
		System.out.print(" y ");
		Ejercicio1.printPoint(p2);
		System.out.print(" es:  "+Ejercicio1.distancia(p1, p2));
		
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Pruebo ejercicio 2");

		Rectangle r= new Rectangle(0,0,1,1);
		
		System.out.print("La medida de la diagonal del rectangulo:  ");
		Ejercicio2.printRectangle(r);
		System.out.println(" es:  "+Ejercicio2.diagonal(r));
		System.out.println("Por otro m�todo es:  "+Ejercicio2.diagonal2(r));
		
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Pruebo ejercicio 3");

		Rectangle r2= new Rectangle(0,0,100,100);
		
		System.out.print("El punto central del rectangulo:  ");
		Ejercicio2.printRectangle(r2);
		System.out.println(" es:  ");
		Ejercicio1.printPoint(Ejercicio3.centro(r2));

		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Pruebo ejercicio 4");

		Rectangle r3= new Rectangle(0,0,100,100);
		Point p3= new Point(200,50);
		
		System.out.print("El punto:  ");
		Ejercicio1.printPoint(p3);
		System.out.print(" esta dentro del rectangulo:  ");
		Ejercicio2.printRectangle(r3);
		System.out.print(" es una afirmacion:  ");
		Ejercicio4.printBoolean(Ejercicio4.estaDentro(p3,r3));
		
		
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Pruebo ejercicio 5");

		Point p4= new Point(200,50);
		Point p5= new Point(100,0);
		
		System.out.print("El punto medio entre los puntos:  ");
		Ejercicio1.printPoint(p4);
		System.out.print(" y ");
		Ejercicio1.printPoint(p5);
		System.out.print(" es:  ");
		Ejercicio1.printPoint(Ejercicio5.puntoMedio(p4, p5));

		
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Pruebo ejercicio 6");

		Rectangle r4= new Rectangle(200,50,40,10);
		Rectangle r5= new Rectangle(100,0,1,4);
		
		System.out.print("El Rectangulo mas peque�o que contiene a los rectangulos :  ");
		Ejercicio2.printRectangle(r4);
		System.out.print(" y ");
		Ejercicio2.printRectangle(r5);
		System.out.print(" es:  ");
		Ejercicio2.printRectangle(Ejercicio6.encuadrar(r4,r5));
		
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("Pruebo ejercicio 7");

		Rectangle r6= new Rectangle(0,0,40,10);
		Rectangle r7= new Rectangle(0,0,100,20);
		
		System.out.print("El Rectangulo :  ");
		Ejercicio2.printRectangle(r6);
		System.out.print(" esta contenido dentro del rectangulo ");
		Ejercicio2.printRectangle(r7);
		System.out.print(" es una afirmacion:  ");
		Ejercicio4.printBoolean(Ejercicio7.estaContenido(r6,r7));
	}

	
}

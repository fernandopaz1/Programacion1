package clase8;

import java.awt.Point;
import java.awt.Rectangle;

public class Ejercicio2 {
	
	public static double diagonal(Rectangle r){
		//La clase Rectangle esta definida como public class Rectangle{x0,y0,ancho, alto}
		double dcuad= (r.width)*(r.width)+(r.height)*(r.height);
		return Math.sqrt(dcuad);
	}
	
	public static double diagonal2(Rectangle r){  //otra forma
		Point p1=new Point(r.x,r.y);
		Point p2=new Point(r.x+r.width,r.y+r.height);
		return Ejercicio1.distancia(p1,p2);
	}
	
	public static void printRectangle(Rectangle r){
		System.out.print(" ("+r.x+","+r.y+","+r.width+","+r.height+") ");
	}

}

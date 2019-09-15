package clase8;

import java.awt.Point;

public class Ejercicio1 {

	public static double distancia(Point p1, Point p2){  //otra forma
		double distCuad=Math.pow((p1.x-p2.x), 2)+Math.pow((p1.y-p2.y), 2);
		return Math.sqrt(distCuad);
	}
	
	public static void printPoint(Point p){
		System.out.print(" (" + p.x+","+p.y+") ");
	}
}

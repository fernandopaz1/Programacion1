package clase8;

import java.awt.Point;

public class Ejercicio5 {
	public static Point puntoMedio(Point p1, Point p2){
		int x = (p1.x+p2.x)/2;
		int y = (p1.y+p2.y)/2;
		Point p=new Point(x,y);
		return p;
	}

}

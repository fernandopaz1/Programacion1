package clase8;

import java.awt.Point;
import java.awt.Rectangle;

public class Ejercicio7 {
	
	public static boolean estaContenido(Rectangle r1, Rectangle r2){
		Point p1=new Point(r1.x,r1.y);
		Point p2=new Point(r1.x+r1.width,r1.y);
		Point p3=new Point(r1.x,r1.y+r1.height);
		Point p4=new Point(r1.x+r1.width,r1.y+r1.height);
		
		return Ejercicio4.estaDentro(p1,r2)&&Ejercicio4.estaDentro(p2,r2)&&Ejercicio4.estaDentro(p3,r2)&&Ejercicio4.estaDentro(p4,r2) ? true:false;
	}
	
}

package clase8;

import java.awt.Point;
import java.awt.Rectangle;

public class Ejercicio4 {
	 public static boolean estaDentro(Point p, Rectangle r){
		 return r.x>p.x || r.y>p.y || (r.x+r.width)<p.x || (r.y+r.height)<p.y ? false : true;
	 }
	 
	public static void printBoolean(boolean b){
		if(b){
			System.out.print("Verdadero");
			return;
		}
		System.out.print("Falso");
	}
}

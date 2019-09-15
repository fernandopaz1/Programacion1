package clase8;

import java.awt.Point;
import java.awt.Rectangle;

public class Ejercicio3 {
	
	public static Point centro(Rectangle r){
		int x=r.x+(r.width)/2;
		int y=r.y+(r.height)/2;
		Point p=new Point(x,y);
		return p;
	}

}

package clase8;

import java.awt.Rectangle;

public class Ejercicio6 {
	public static Rectangle  encuadrar(Rectangle r1, Rectangle r2){
		int x= r1.x<r2.x ? r1.x : r2.x;
		int y= r1.y<r2.y ? r1.y : r2.y;
		int width= (r1.x+r1.width)>(r2.x+r2.width) ? (r1.x+r1.width)-x : (r1.x+r1.width)-x;
		int height= (r1.y+r1.height)>(r2.y+r2.height) ? (r1.y+r1.height)-y : (r2.y+r2.height)-y;
		Rectangle r=new Rectangle(x,y,width,height);
		return r;

	}
}

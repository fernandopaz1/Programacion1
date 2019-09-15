package clase8;

import java.awt.Rectangle;

public class Ejercicio8 {
	 public static Rectangle interseccion(Rectangle r1, Rectangle r2){
		 int x= r1.x>r2.x ? r1.x:r2.x;    //Devuelve el inicio del cuadrado mas corrido a la derecha 
			int y= r1.y>r2.y ? r1.y:r2.y;    //Devuelve el inicio del cuadrado mas corrido hacia arriba
			int x2= r1.x+r1.width<r2.x+r2.width ? r1.x+r1.width:r2.x+r2.width;    //Devuelve el fin del cuadrado menos corrido a la derecha 
			int y2= r1.y+r1.height<r2.y+r2.height ? r1.y+r1.height:r2.y+r2.height;    //Devuelve el inicio del cuadrado mas corrido hacia arriba
				
			Rectangle r3=new Rectangle(x,y,x+x2,y+y2);
			
			return Ejercicio7.estaContenido(r3,r1)&&Ejercicio7.estaContenido(r3,r1) ? r3 : null;
	 }
}

package practica1;

public class PrueboCirculo {

	public static void main(String[] args) {
		System.out.println("Pruebo la clase Circulo del ejercicio 2\n");
		
		System.out.print("Creo un cirulo:  ");
		Circulo c1=new Circulo(0,0,3);
		c1.imprimir();
		
		System.out.println("Perimetro del circulo:  "+c1.perimetro());
		System.out.println("Area del cirulo:  "+c1.area());
		
		System.out.print("Lo desplazo:  ");
		c1.desplazar(4, 5);
		c1.imprimir();
		
		System.out.print("Calculo su distancia con respecto a:  ");
		Circulo c2=new Circulo(4,5,2);
		c2.imprimir();
		System.out.println("La distancia entre los circulos es:  "+Circulo.distancia(c1, c2));
		
		System.out.print("Los circulo introducidos se tocan es una afirmacion:  ");
		if(Circulo.seTocan(c1, c2)) {System.out.println("true");}
		else {System.out.println("false");}
		
		
		System.out.print("El circulo:  ");
		c2.imprimir();
		System.out.print("Esta contenido dentro del otro es una afirmacion:  ");
		if(c1.loContiene(c2)) {System.out.println("true");}
		else {System.out.println("false");}
		

	}

}

package clase4;

public class prueboEjercicios {

	public static void main(String[] args) {
	
	System.out.println("Pruebo ejercicio 1 :");
	
	int a=3;
	
	System.out.println("La suma de los numeros que estan entre 1 y n="+ a + " es : "+ejercicio1.sumarHasta(a));

	System.out.println("");
	
	System.out.println("Pruebo ejercicio 2 :");
	
	

	
	int b=10;
	
	System.out.println("La suma de los pares entre 1 y n="+ b + " es : "+ejercicio2.sumarParesHasta(b));
	
	System.out.println("");
	
	System.out.println("Pruebo ejercicio 3 :");

	

	
	int c=10;
	
	System.out.print("Imprimo del 1 al  n="+ c + " ascendente : ");
	System.out.println(" ");
	ejercicio3.imprimirHasta(c);
	
	System.out.println("");
	System.out.println("");
	
	System.out.println("Pruebo ejercicio 4 :");

	int d=10;
	
	System.out.println("Imprimo del 1 al  n="+ d + " descendente : ");

	ejercicio4.imprimirDesde(d);

	System.out.println(" ");
	System.out.println("");
	
	
	System.out.println("Pruebo ejercicio 5 :");
	
	int A=3, B=5;
	
	System.out.println("A="+ A + " elevado a B="+ B + " es : "+ejercicio5.potencia(A,B));

	System.out.println("");
	System.out.println("");

	System.out.println("Pruebo ejercicio 6 :");
	
	int C=17;
	
	System.out.println("Si es primo devuelve 1 sino 0, C=" + C + " es "  + ejercicio6.esPrimo(C,C-1));

	System.out.println("");
	System.out.println("");
	
	int D=80;
	
	System.out.println("La cantidad de primos entre C="+C+" y D="+D+" es: "+ejercicio6.cantidadPrimosEntre(C,D));
	
	System.out.println("");
	System.out.println("");
	
	System.out.println("Pruebo ejercicio 7 :");
	
	int E=81;
	
	System.out.println("El numero primo que le sigue a E=" + E + " es "  + ejercicio7.siguientePrimo(E));

	System.out.println("");
	System.out.println("");
	
	System.out.println("Pruebo ejercicio 7 :");
	
	int F=2;
	
	System.out.println("El numero E=" + E + " es par es una afirmacion "  + ejercicio8.esPar(F));

	System.out.println("");
	System.out.println("");
	
	}
	
}

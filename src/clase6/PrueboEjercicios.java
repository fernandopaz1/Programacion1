package clase6;

//import java.util.Scanner;



public class PrueboEjercicios {

	public static void main(String[] args) {
		
		System.out.println("Pruebo ejercicio 1");
		
		//Scanner scan=new Scanner(System.in);
		
		int array[]= {10,1,2,3,4,5,6,7,8,9};
		
		System.out.print("La suma del array introducidos es:  "+Ejercicio1.sumarElementos(array));
		
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Pruebo ejercicio 2");
		
		//Scanner scan=new Scanner(System.in);
		
		String s="estestoscopio";
		
		System.out.print("El string: "+ s +" imprimiendo las letras segun aparecen y la cantidad que aparecen es ");
		Ejercicio2.imprimirApariciones(s);
		
		
		System.out.println("");
		System.out.println("");

	}

}

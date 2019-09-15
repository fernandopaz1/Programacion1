package clase3;

import java.util.Scanner;

public class ejercicio2 {

	//Escribir el m�todo public static int[] pedirArray(int n) que construye un arreglo 
	//solicitando su longitud por teclado, solicitando al usuario el valor de cada una 
	// de las posiciones y devuelve el arreglo constru�do
	
	private static Scanner scan;

	public static int[] pedirArray(int n) {
		int[] a=new int[n];
		scan = new Scanner(System.in);
		
		for(int i=0;i<n;i++){
			System.out.println("Ingrese un entero:  ");
			a[i] = scan.nextInt();
		}
		return a;
	}
	

}

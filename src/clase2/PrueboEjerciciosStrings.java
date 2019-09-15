package clase2;

import java.util.Scanner;

public class PrueboEjerciciosStrings {

	public static Scanner scan;

	public static void main(String[] args){
		scan = new Scanner(System.in);
		
		System.out.println("Ingrese un texto:  ");
		
		String palabra = scan.next();    //La idea es introducir una sola palabra ya que solo cuenta las letras e de la primera
		
		System.out.println("La cantidad de letras e es:  ");
		System.out.println(EjerciciosStrings1.cuantasE(palabra));
	}
}

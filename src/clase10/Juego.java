package clase10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Juego {

	public static void main(String[] args) 
	{
		
		String palabra = palabraRandom();
		System.out.println(palabra);
		
		
		
	}

	/**
	 * Devuelve una palabra del diccionario elegida alazar
	 */
	private static String palabraRandom() 
	{
		String ret = null;
		Scanner scan =null;
		File f=new File("src/clase10/lemario.txt");
		
		
		
		try {
			scan = new Scanner(f);
			int k = (int) (Math.random()*80000);
			
			System.out.print(scan.next());
			
			
			

			while (k > 0 && scan.hasNext())
			{
				
				
				ret=scan.nextLine();
				k--;
			}
			
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}

		String acentos = "áéíóú";
		String vocales = "aeiou";
		for (int i = 0; i < acentos.length(); i++)
			ret = ret.replace(acentos.charAt(i), vocales.charAt(i));
		
		return ret;
	}

}

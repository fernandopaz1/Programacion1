package clase5;

public class Ejercicio2 {
	public static void imprimirEspaciado(String s){
		if(s==""){
			System.out.print(s);
			return;
		}
		System.out.print(s.charAt(0)+" ");
		imprimirEspaciado(Ejercicio1.resto(s));
		
	}

}

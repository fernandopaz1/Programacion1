package clase5;

public class Ejercicio6 {
	public static boolean esAbecedaria(String s){
		if(s.length()==1){
			return true;
		}
		return s.charAt(0)<s.charAt(1) ? esAbecedaria(Ejercicio1.resto(s)) : false;
	}
}

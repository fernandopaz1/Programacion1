package clase5;

public class Ejercicio3 {
	public static void imprimirAsterisco(String s){
		if(s==""){
			System.out.print(s);
			return;
		}
		if(s.length()==1){
			System.out.print(s.charAt(0));
			imprimirAsterisco(Ejercicio1.resto(s));
		}
		else{
			System.out.print(s.charAt(0)+"*");
			imprimirAsterisco(Ejercicio1.resto(s));
		}
	}
}

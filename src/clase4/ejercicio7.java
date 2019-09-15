package clase4;

public class ejercicio7 {
	 public static int siguientePrimo(int n){
		 return ejercicio6.esPrimo(n+1,n)==1 ? n+1 : siguientePrimo(n+1);
	 }
}

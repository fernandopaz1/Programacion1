package clase4;

public class ejercicio8 {
	public static boolean esPar(int n){
		if(n==1){
			return false;
		}
		return n==0 ? true : esPar(n-2);
	}
}

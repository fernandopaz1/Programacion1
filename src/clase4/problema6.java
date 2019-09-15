package clase4;

public class problema6 {
	public static int esPrimo(int n,  int i){
		if(n==1){
			return 0;
		}
		if(i==1){
				return 1;
		}
		return n%i==0 ? 0 : esPrimo(n,i-1);
	}
	
	
	public static int cantidadPrimosEntre(int n, int m){
		if(n==m){
			return esPrimo(n,n-1)==1 ? 1 : 0;
		}
		return esPrimo(n,n-1)==1 ?  1+cantidadPrimosEntre(n+1,m) : cantidadPrimosEntre(n+1,m); 
	}
}

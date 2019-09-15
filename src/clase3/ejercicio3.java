package clase3;

public class ejercicio3 {
	public static int[] rango(int m, int n){
		int[] a=new int[n-m+1];
		
		for(int i=0;i<a.length;i++){
			a[i]=m+i;
		}
		return a;
	}
}

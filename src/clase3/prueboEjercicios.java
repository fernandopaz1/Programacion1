package clase3;

public class prueboEjercicios {
	public static void main(String[] args){
		int[] a={1,2,3,4,4,5,6,7};
		ejercicio1.imprimirArray(a);
		
		int n=5;
		a=ejercicio2.pedirArray(n);
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}

}

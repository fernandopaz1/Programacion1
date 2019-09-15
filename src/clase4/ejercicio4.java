package clase4;

public class ejercicio4 {
	public static void imprimirDesde(int N){
		if(N>0){
			System.out.print(" "+N);  //Imprimo primero N y luego hago la recursion   
			imprimirDesde(N-1);    //Solo si N>0
		} 
	} 
}

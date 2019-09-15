package clase4;

public class ejercicio3 {
	
	public static void imprimirHasta(int N){
		if(N>1){imprimirHasta(N-1);				//Hago la recursion y despus imprimo el actual
		}
		System.out.print(" "+N);				//De esta fomma hace la recursion primerio y 
											//e imprime los valore mas cerca al caso base
	}
}

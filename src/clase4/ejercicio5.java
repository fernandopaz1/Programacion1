package clase4;

public class ejercicio5 {
	public static int potencia(int A, int B){
		return B==0 ? 1 : A*potencia(A,B-1);
	}

}

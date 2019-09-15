package clase4;

public class ejercicio1 {

	public static int sumarHasta(int N) {
		return N==0 ? N : N+sumarHasta(N-1);
	}

}

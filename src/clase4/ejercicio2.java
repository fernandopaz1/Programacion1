package clase4;

public class ejercicio2 {
	public static int sumarParesHasta(int N){
		int sumo = (N%2==0) ? 1 : 0 ;     //Me fijo si es par o no
		return N==0 ? N : N*sumo+sumarParesHasta(N-1); //Sumo recursivamente si es par o no
	}
	
}

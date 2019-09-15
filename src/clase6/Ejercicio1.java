package clase6;

public class Ejercicio1 {
	
	public static int sumaParcial(int[] elementos, int i, int suma){
		return i==elementos.length ? 0: elementos[i]+sumaParcial(elementos,i+1,suma);
		}
	
	public static int sumarElementos(int[] elementos){
		int i=0;
		int suma=0;
		return sumaParcial(elementos,i,suma);
	}


}

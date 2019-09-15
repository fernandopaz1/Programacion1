package clase6;

public class Hanoi {
	public static void main (String[] args) {
		int[] elementos = {1,4,5};
		System.out.println(Ejercicio1.sumarElementos(elementos));
		hanoi(3);
	}
	
	public static void hanoi (int n) {
		hanoi(n, 1, 3, 2);
	}
	
	public static void hanoi (int n, int ori, int des, int tem) {
		if (n==0) {
			return;
		}
		hanoi(n-1, ori, tem, des);
		System.out.println("Pasar un disco de la " + ori +" a la "+ des);
		hanoi(n-1, tem, des, ori);
	}
}

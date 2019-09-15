package clase3;

public class ejercicio5 {

	public static int max(int[] a) {
		//Implementar una funci�n public static int max(int[] a),
		//que dado un arreglo de enteros desordenado devuelva el m�ximo elemento del arreglo.

		int maximo=a[0];
		for(int i=0;i<a.length;i++){
				if(maximo<a[i]){
					maximo=a[i];
				}
		}
		return maximo;
	}

}

package clase3;

public class ejercicio4 {

	public static int prom(int[] a ){
		// implementar una funci�n public static int prom(int[] a)
		//que dado un arreglo de enteros, devuelva el promedio de los elementos del arreglo.
		
		int acum = 0 ;
		for(int i=0;i<a.length;i++){
			acum = acum + a[i] ; 
		
		}
	return acum/a.length; 
	}

}

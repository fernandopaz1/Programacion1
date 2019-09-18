package practica1;

public class Arreglos {
	public int [] a;

	public Arreglos(int [] array) {
		this.a=new int [array.length];
		for(int i=0; i<array.length;i++) {
			this.a[i]=array[i];
		}
	}
	
	
	public static boolean esSinRepetidos(int[] arr) {
		if(arr.length==0 || arr.length==1) {
			return true;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	public static int[] pegar(int[] arr, int[] arr2) {
		int i;
		int[] a=new int[arr.length+arr2.length];
		for(i=0;i<arr.length;i++) {
			a[i]=arr[i];
		}
		for(i=arr.length;i<arr2.length;i++) {
			a[i]=arr2[i-arr.length];
		}
		return a;
	}
	
	public static int[] agregarAlFinal(int[] arr, int elem) {
		int[] a=new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			a[i]=arr[i];
		}
		a[a.length]=elem;
		return a;
	}
	
	public static boolean estaEn(int[] arr, int elem) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==elem) {
				return true;
			}
		}
		return false;
	}
	
	public static int[] sinRepetidos(int[] arr) {
		if(esSinRepetidos(arr)) {return arr;}
		
		int[] a=new int[1];
		a[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(!estaEn(a,arr[i])) {
				a=agregarAlFinal(a,arr[i]);
			}
		}
		
		return a;
	}
	
	public static void invertir(int[] arr) {
		int[] a =new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			a[i]=arr[arr.length-i-1];
		}
		arr=a;
	}
}

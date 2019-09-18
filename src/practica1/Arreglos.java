package practica1;

public class Arreglos {
	public int [] a;

	public Arreglos(int [] array) {
		this.a=new int [array.length];
		for(int i=0; i<array.length;i++) {
			this.a[i]=array[i];
		}
	}
}

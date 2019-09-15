package clase3;

public class ejerciciosArray {
	
	//Estamos escribiendo codigo fuente compliando y ejecutando
	//Los argumentos del main se los deber�a pasar al ejecutar el archivo compilado
	//Supongamos que mi codigo se llama Hello.java
	//con javac Hello.java en la terminal lo compilo
	//me tira un archivo .class
	//para ejecutar se usa java seguido del nombre del .class

	
	public static void main(String[] args) {
		/*
		int[] a=new int[4];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		*/
		int[] a={1,2,3,4}; //Lo mismo que arriba
		System.out.println(a);  //Imprimiendo de esta forma me devuelve la posision de memoria
		int i;
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}

package clase2;

import java.util.Random;

public class Practica0 {
	
	//la funcion oDivisible retorna si n es divisible por m
	public static boolean oDivisible(int n, int m){
		boolean b;
		if(n%m==0){
			b=true;
		}
		else{
			b=false;
		}
		return b;
	}
	
	///opcion 2
	public static boolean oDivisible2(int n, int m){
		if(n%m==0){
			return true;
		}
		else{
			return false;
		}
	}

	public static boolean oDivisible3(int n, int m){
		return n%m==0;
	}
	public static void main(String[] args){
		int a,c;
		a=2;
		Random r=new Random();
		c=r.nextInt(10);  //me tira numeros a azar entre 0 y 10
		
		System.out.println(c);
		System.out.println(a);
		System.out.println(oDivisible3(c,a));
		
		
	}
}

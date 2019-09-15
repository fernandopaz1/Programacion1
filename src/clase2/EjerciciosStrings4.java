package clase2;

public class EjerciciosStrings4 {
	
	public static boolean duodromo(String palabra){
		int i,N=palabra.length();
		
		if(N%2!=0){
			return false;
		}
		
		for(i=0;i<N;i=i+2){
			if(palabra.charAt(i)!=palabra.charAt(i+1)){
				return false;
			}
		}
		return true;		
	}

}

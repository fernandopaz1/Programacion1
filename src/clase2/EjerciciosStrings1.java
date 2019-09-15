package clase2;

public class EjerciciosStrings1 {
	
	public static int cuantasE(String palabra){
		int i,cuentoe=0;
		
		for(i=0;i<palabra.length();i++){
			if(palabra.charAt(i)=='e' || palabra.charAt(i)=='E'){
				cuentoe++;
			}
		}
		return cuentoe;
	}
}

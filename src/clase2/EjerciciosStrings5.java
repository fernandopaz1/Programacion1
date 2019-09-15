package clase2;

public class EjerciciosStrings5 {
	public static boolean esPrefijo(String s, String prefijo){
		int i;
		
		for(i=0;i<s.length();i++){
			if(s.charAt(i)!=prefijo.charAt(i)){
					return false;
			}
		}
				
		return true;
	}
}

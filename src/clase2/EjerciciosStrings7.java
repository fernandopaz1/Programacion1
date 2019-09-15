package clase2;

public class EjerciciosStrings7 {
	public static boolean esSubstring(String s1, String s2){
		int i;
		if(s1.length()>s2.length()){
			return false;
		}
		
		//Me fijo en que indice de s1 esta la primer letra de s2
		
		int indiceComienzo=s1.indexOf(s1.charAt(0));
				
		if((indiceComienzo+s1.length())>s2.length()){
				return false;
		}
		
		for(i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(indiceComienzo+i)){
				return false;
			}
		}
		
		
		return true;
		
	}
}

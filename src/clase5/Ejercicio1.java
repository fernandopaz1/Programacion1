package clase5;

public class Ejercicio1 {
	
	
	public static String resto(String s){
		String resto="";
		for(int i=1;i<s.length();i++){
			resto=resto+s.charAt(i);
		}
		return resto;
	}
	
	public static int longitud(String s){
		return s=="" ? 0 : 1+longitud(resto(s));
	} 

}

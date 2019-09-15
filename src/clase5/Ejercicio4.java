package clase5;

public class Ejercicio4 {
	
	public static String restofinal(String s){
		String resto="";
		for(int i=0;i<s.length()-1;i++){
			resto=resto+s.charAt(i);
		}
		return resto;
	}
	
	public static String reverso(String s){
		return s=="" ? s : s.charAt(s.length()-1)+reverso(restofinal(s));
		
	}

}

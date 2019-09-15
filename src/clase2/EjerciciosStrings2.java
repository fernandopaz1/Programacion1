package clase2;

public class EjerciciosStrings2 {
	public static boolean SoloE(String palabra){
		int i;
		boolean a=true;
		for(i=0;i<palabra.length();i++){
			if(palabra.charAt(i)!='e' || palabra.charAt(i)!='E'){
				a=false;
			}
		}
		return a;
	}
}

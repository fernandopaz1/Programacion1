package clase6;

public class Ejercicio2 {
	
		public static int cantidadDeApariciones(String s, char c,int i){
			if(i==s.length()) {return 0;}
			return s.charAt(i)==c ? 1+cantidadDeApariciones(s,c,i+1): cantidadDeApariciones(s,c,i+1);
		}
		
		public static boolean estaEn(String s, char c,int i) {
			if(i==s.length()) {return false;}
			return s.charAt(i)==c ? true : estaEn(s,c,i+1);
		}
	
		public static void imprimirRecursivo(char c, int i) {
			for(int j=0;j<i;j++) {
				System.out.print(c);
			}
		}
		
		
		
		public static void imprimirApariciones(String s) {
			String apariciones="";
			for(int i=0;i<s.length();i++) {
				if(estaEn(apariciones,s.charAt(i),0)==false){
					apariciones+=s.charAt(i);
					imprimirRecursivo(s.charAt(i),cantidadDeApariciones(s,s.charAt(i),0));
				
				}
			}
			
			System.out.println(" ");
			System.out.println(apariciones);
		}
		
		

}

package clase2;

public class EjerciciosStrings6 {

	public static boolean esPrefijoDesde(String s, String prefijo, int posicion){
		int i;
		
		for(i=posicion;i<s.length();i++){
			if(s.charAt(i)!=prefijo.charAt(i)){
					return false;
			}
		}
				
		return true;
	}
	
}

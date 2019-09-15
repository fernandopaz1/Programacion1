package clase5;

public class Ejercicio5 {
	public static String combinar(String s, String t){
	if(s=="" || t==""){
		return s+t;              //ya que uno de los dos es vacio puedo sumar tranquilo
	}
	return s.charAt(0)>t.charAt(0) ? t.charAt(0)+combinar(Ejercicio1.resto(s),Ejercicio1.resto(t)) : s.charAt(0)+combinar(Ejercicio1.resto(s),Ejercicio1.resto(t)); 
	}
							//uso combinar con strings que se acercan al caso base (resto)
}

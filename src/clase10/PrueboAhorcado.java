package clase10;

public class PrueboAhorcado {

	public static void main(String[] args) {
		
		String s="TUTIFRUTTI";
		
		try {
			Ahorcado a=new Ahorcado(s);
			a.jugar(s);
		}catch(RuntimeException ex) {
			System.out.println("Para jugar al ahorcado ingresar una palabra valida");
		}
		

	}

}

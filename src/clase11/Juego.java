package clase11;

public class Juego 
{
	
/*	public iniciar() {
		Mazo jugador=new Mazo[5]; 
	}*/
	
	public static void main(String[] args) 
	{
		Mazo m = new Mazo();

		
		m.mezclar();
		
		//m.mostrar();
		
		System.out.println("-------------");
		
		Jugador j1=new Jugador(m);
		j1.mostrarMano();
		
		Carta enMesa=m.dameCarta();
		
		
		
		
	}

}

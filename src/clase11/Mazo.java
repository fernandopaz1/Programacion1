package clase11;
import java.util.Random;

public class Mazo 
{
	// Variables de instancia
	private Carta[] cartas;
	int ultima;  //Ultima carta del mazo
	
	public Mazo() 
	{
		this.cartas = new Carta[40];
		this.ultima =this.cartas.length;
		
		
		int j = 0;
		for (int p = 1; p <= 4; p++)
		{
			for (int i = 1; i <= 7; i++)
				this.cartas[j++] = new Carta(p, i);
			
			for (int i = 10; i <= 12; i++)
				this.cartas[j++] = new Carta(p, i);
		}
	}

	public void mostrar() 
	{
		for (int i = 0; i < cartas.length; i++) 
		{
			System.out.println(this.cartas[i]);
		}		
	}

	public void mezclar() 
	{
		Random r=new Random();
		for(int k=0;k<500;k++) {
			int i =r.nextInt(this.cartas.length);
			int j =r.nextInt(this.cartas.length);
			Carta c=this.cartas[i];//.copiarCarta();
			this.cartas[i]=this.cartas[j];
			this.cartas[j]=c;
			
		}
		}
		
		public Carta dameCarta() {
			Carta c=this.cartas[this.ultima-1];
			this.ultima--;
			return c;
		}
}

package clase11;

public class Carta 
{
	// Variables de instancia
	private int palo;
	private int numero;

	public Carta(int p, int i) 
	{
		this.palo = p;
		this.numero = i;
	}
	
	
	public  Carta copiarCarta() {
		Carta c=new Carta(this.palo,this.numero);
		return c;
	}
	
	public String toString() 
	{
		String[] palos = { "Espada", "Oro", "Copa", "Basto"};
		return this.numero + " de " + palos[this.palo-1]; 
	}
}














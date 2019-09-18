package clase11;

public class Jugador {
	Carta[] mano;
	int ultima;
	

	public Jugador(Mazo m) {
		this.ultima=0;
		this.mano=new Carta[40];
		for(int i=0;i<7;i++) {
			recibirCarta(m.dameCarta());
		}
	}
	
	
	public void recibirCarta(Carta c){
		this.mano[this.ultima]=c;
		this.ultima++;
	}
	
	public void mostrarMano() {
		for (int i = 0; i < this.ultima; i++) {
			System.out.println(this.mano[i]);
			}		
	}
	
	public void puedoJugar() {
		
	}
	
}

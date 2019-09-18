package clase10;

import java.util.Scanner;

//import java.util.Scanner;
//Scanner intento=new Scanner(System.in);

public class Ahorcado {
	private String palabra;
	private char[] estado;
	private int vidas;
	private boolean ganado;
	
	//Invariante de representacion de ahorcado
	
	//*La cantidad de vidas debe ser de 0 a 5
	//*El String palabra secreta debe ser una palabra secreta del Lemario
	//*El estado tiene que ser un arreglo de chars el mismo largo que palabra secreta
	//*El estado solo puede tener letras adiviniadas o '_', solo pueden ser las mismas que la palabra
	//ganado solo puede ser true o false. Si es true ya esta ganado, si es false se peridio o todavia esta en juego
	

	public Ahorcado(String palabraSecreta) {
		int i;
		this.palabra = palabraSecreta.toLowerCase();
		this.estado = new char[palabraSecreta.length()];
		for (i = 0; i < palabraSecreta.length(); i++) {
			this.estado[i] = '_';
			if(this.palabra.charAt(i)==' '){
				throw new RuntimeException("No es una palabra");
			}
		}
		
		
		this.vidas = 5;
		this.ganado=false;
	}

	public boolean arriesgarLetra(String s) {
		int bandera = 0;
		int i;
		char c=s.toLowerCase().charAt(0);
		for (i = 0; i < this.palabra.length(); i++) {
			if(c==this.estado[i]){
				this.vidas-=1;
				System.out.println("Letra repetida");
				return false;
			}
			if (c == this.palabra.charAt(i)) {
				bandera = 1;
				this.estado[i] = this.palabra.charAt(i);
			}
		}
		
		this.ganado=true;
		for(i=0;i<this.palabra.length();i++){
			if(this.estado[i]!=this.palabra.charAt(i)){
				this.ganado=false;
			}
		}
		
		if (bandera == 0) {
			this.vidas-=1;
			System.out.println("La letra no esta en la palabra");
			return false;
		}

		
		
		
		return true;
	}
	
	public void mostrar(){
		int i;
		System.out.print("Vidas:  ");
		for(i=0;i<this.vidas;i++) {
			System.out.print('*');
		}
		System.out.print("\n");
		for (i = 0; i < this.palabra.length(); i++) {
			System.out.print(this.estado[i]+" ");
			}
	}
	
	public void  arriesgarPalabra(String p){
		if(this.palabra.equals(p)){
			this.ganado=true;
		}
		else{
			this.vidas-=1;
			System.out.println("\nPalabra equivocada");
		}
	}
	
	public boolean terminado(){
		if(this.vidas<=0 || this.ganado){
			return true;
		}
		return false;
	}
	
	public boolean ganado(){
		return this.vidas>0 && this.ganado ? true:false;
	}

	public void jugar(String p) {
		//Ahorcado a=new Ahorcado(p);
		Scanner scan=new Scanner(System.in);
		System.out.println("Hallar una palabra de "+p.length()+" letras:");
		while(!this.terminado()) {
			this.mostrar();
			System.out.print("\nIntroducir letra o palabra completa:");
			String s=scan.next();
			if(s.length()==1) {
				this.arriesgarLetra(s);
			}
			else {
				this.arriesgarPalabra(s);
			}
		}
		
		if(this.ganado) {
			System.out.println("Ganaste! La palabra es:  "+this.palabra);
		}else {System.out.println("Perdiste :(");}
		
		
		scan.close();
	}
	
}


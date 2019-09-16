package clase10;

import java.util.Scanner;

public class Tateti {

	private char tablero[][];   //varaibles de instancia
	private char jugador;		//Los invariantes de representacion son matrices de 
	private char ganador;       // 3*3 donde solo puden ser solo x o y _
								//Tiene que haber alternancia de x e y
								//si hay n x's y m o's solo pueden diferir en 1
								//como siempre arranco en x n tiene que ser mayor que m
								//Jugador solo puede ser 'x' o 'o'
								//Ganador solo puede ser " ", 'x' o 'o'

	public Tateti() {
		tablero = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tablero[i][j] = '_';
			}
		}

		jugador = 'x';                   //Inicio con x
		ganador = ' ';
	}

	public void Mostrar() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tablero[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public char ProximoTurno() {
		return jugador;
	}

	public void Jugar(int i, int j) {
		if (tablero[i][j] != '_') {
			throw new RuntimeException("posición no vacía");
		}

		if (Terminado()) {
			throw new RuntimeException("juego ya terminado");
		}

		tablero[i][j] = jugador;
		jugador = (jugador == 'x') ? 'o' : 'x';
	}

	public boolean Terminado() {
		return HayGanador() || Completo();
	}

	public boolean HayGanador() {
		char c;

		// miramos filas
		for (int i = 0; i < 3; i++) {
			c = tablero[i][0];
			if (c == tablero[i][1] && c == tablero[i][2] && c != '_') {
				ganador = c;
				return true;
			}
		}

		// miramos columnas
		for (int j = 0; j < 3; j++) {
			c = tablero[0][j];
			if (c == tablero[1][j] && c == tablero[2][j] && c != '_') {
				ganador = c;
				return true;
			}
		}

		// miramos una diagonal
		c = tablero[0][0];
		if (c == tablero[1][1] && c == tablero[2][2] && c != '_') {
			ganador = c;
			return true;
		}

		// miramos la otra diagonal
		c = tablero[0][2];
		if (c == tablero[1][1] && c == tablero[2][0] && c != '_') {
			ganador = c;
			return true;
		}

		return false;
	}

	public boolean Completo() {
		int cont = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				if (tablero[i][j] != '_') {
					cont++;
				}
		}
		return cont == 9;
	}

	public char Ganador() {
		if (!Terminado()) {
			throw new RuntimeException("el juego no terminó todavía");
		}

		return ganador;
	}

	public static void main(String args[]) {
		Tateti tateti = new Tateti();
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		tateti.Mostrar();
		while (tateti.Terminado() == false) {
			a = input.nextInt();
			b = input.nextInt();
			tateti.Jugar(a, b);
			tateti.ProximoTurno();

			tateti.Mostrar();
		}

		if (tateti.Completo() && !tateti.HayGanador()) {
			System.out.println("Empate");
		}

		if (tateti.HayGanador()) {
			System.out.println("Hay ganador: " + tateti.ganador);
		}

		input.close();
		// Hola, soy un tateti! Completame! ;)
	}

}
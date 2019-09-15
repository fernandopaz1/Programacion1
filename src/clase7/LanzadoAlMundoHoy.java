package clase7;

public class LanzadoAlMundoHoy {

	// Suma entre 0 y n
	public static int sumar(int n) {
		if (n < 0) {
			throw new RuntimeException("N�mero negativo");
		}

		if (n == 0) {
			return 0;
		}

		return n + sumar(n - 1);

	}

	// a ** b
	public static int potencia(int a, int b) {
		if (b < 0) {
			throw new RuntimeException("N�mero negativo");
		}
		if (b == 0) {
			return 1;
		}

		return a * potencia(a, b - 1);
	}

	// Suma entre a y b
	public static int sumaEntre(int a, int b) {
		if (a == b) {
			return a;
		}

		return a + sumaEntre(a + 1, b);
	}

	public static void main(String[] args) {
		int n = -10;

		try {
			System.out.println("sumar(" + n + ") = " + sumar(n));
		} catch (RuntimeException ex) {
			System.out.println("Se produjo un error con el valor ingresado");

		}

		int a = 2;
		int b = -5;
		try {
			System.out.println("potencia(" + a + ", " + b + ") = "
					+ potencia(a, b));
		} catch (RuntimeException ex) {
			System.out.println("Se produjo un error con el valor  de b ingresado");

		}

		a = 5;
		b = 7;

		System.out.println("sumaEntre(" + a + ", " + b + ") = "
				+ sumaEntre(a, b));
	}

}
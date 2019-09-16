package practica1;

public class PrueboFraccion {

	public static void main(String[] args) {
		
		System.out.println("Pruebo la clase fracción: "+"\n");
		
		try {
			Fraccion f=new Fraccion(4,22);
			System.out.print("a) La fracción es:  ");
			f.imprimir();
			System.out.print("b) Invirtiendo el signo:  ");
			f.invertirSigno();
			f.imprimir();
			System.out.print("c) Invirtiendo la fracción:  ");
			f.invertir();
			f.imprimir();
			System.out.println("d) Pasando a double:  "+f.aDouble());
			System.out.print("e) Reduciendo la fracción a su expresion minima:  ");
			f.reducir();
			f.imprimir();
			Fraccion q=new Fraccion(10,9);
			System.out.print("f) Multiplico la fracción por:  ");
			q.imprimir();
			System.out.print("Da como resultado:  ");
			Fraccion.producto(f,q).imprimir();
			System.out.print("g) Sumo las fracciones:  ");
			q.imprimir();f.imprimir();
			System.out.print("h) Da como resultado:  ");
			Fraccion.suma(f,q).imprimir();
			
		}
		catch(RuntimeException ex) {System.out.print("Error en el valor del denominador");};
		
		
		
		
	}

}

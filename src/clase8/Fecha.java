package clase8;

public class Fecha{   //Hasta ahora solo usamos las clases como funciones
	int dia = 1;          //Variable de instacia
	int mes=1;				//El metodo de instancia no tiene el static
	int anio=1970;
	
	public Fecha(int d,int m,int a) {   //Este es el metodo constructor
		this.dia = d;          //This asigna dia a la variables
		this.mes=m;			
		this.anio=a;	
	}
	
	public void imprimir(){             //Aca defino como imprimir fecha ::Va sin el static
		System.out.println(this.dia+"/"+this.mes+"/"+this.anio);
	}

	
	//Metodo de clase: es lo que veiamos antes lleva static.
	//No se puede usar this en un metodo de clase ya que no esta aplicado sobre la clase
	//Se invoca con el punto
	//Por Ejemplo Math.sqrt(4) es una metodo de clase
	//sqrt es la funcion definida en la clase Math
	
	//Las cosas que empiezan con minusculas no estan orientadas a objetos, Ej: int, boolean...
	//En cambio cosas como String o Math si estan orientadas a objetos.
	//Sin embargo para cambiar los metodos habira que cambiar el codigo fuente
	
	//Scanner input =new Scanner(System.in);
	// int n=input.nextInt();
	//Scanner es una clase  
	//El segundo Scanner es el metodo constructor (no tiene return)
	//input ahora es un objero
	//nextInt() es una instancia, basicamente mira que pasa en el teclado y devuelve el proximo
	//entero escrito
	//En java para construir un objeto necesito si o si tener la clase definida
	
	
	//System.out.println("hola");
	//pritnln() es un metodo de clase
	//System es una clase
	//out "probablemente" es un objeto sobre el cual llamo al metodo println()
	
		
	public static void main(String[] s){
		Fecha f2=new Fecha(1,12,19);
		f2.imprimir();
	}
}



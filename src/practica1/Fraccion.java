package practica1;

public class Fraccion {
	int numerador;
	int denominador;
	
	public Fraccion(int n, int d){
		if (d == 0) {
			throw new RuntimeException("Denominador nulo");
		}else {
		this.numerador=n;
		this.denominador=d;}
	}
	
	public void imprimir(){
		if(this.denominador==1||this.denominador==-1) {
			System.out.println(this.denominador*this.numerador);
			return;}
		if(this.numerador*this.denominador>0) {
			System.out.println(Math.abs(this.numerador)+"/"+Math.abs(this.denominador));
			return;
		}
		if(this.numerador==0){
			System.out.println("0");
			return;
		}
		
		System.out.println("-"+Math.abs(this.numerador)+"/"+Math.abs(this.denominador));
	}
	public void invertirSigno() {
		this.numerador*=-1;
	}
	public void invertir() {
		int a=this.numerador;
		this.numerador=this.denominador;
		this.denominador=a;
	}
	public double aDouble() {
		return 1.0*this.numerador/(this.denominador);
	}
	
	public static int mcd(int a, int b) {
		if(Math.abs(a)==Math.abs(b)) {return Math.abs(a);}
		int max =Math.max(Math.abs(a), Math.abs(b));  //Veo cual es el maximo en modulo
		int div=1;
		for(int i=2;i<(max/2+1);i++) {			//Voy del 2 hasta la mitad del maximo
			if(a%i==0 && b%i==0) {
				div=i;
			}
		}
		return div;
	}
	
	public void reducir() {
		int a=mcd(this.denominador,this.numerador);
		this.numerador/=a;
		this.denominador/=a;
	}
	public static Fraccion producto(Fraccion q1, Fraccion q2) {  //Metodo de clase ya que quiero el resultado
																 //Sin modificar los objetos
		Fraccion q=new Fraccion(q1.numerador*q2.numerador,q1.denominador*q2.denominador);
		q.reducir();
		return q;
	}
	public static Fraccion suma(Fraccion q1, Fraccion q2) {
		Fraccion q=new Fraccion(q1.numerador*q2.denominador+q2.numerador*q1.denominador,q1.denominador*q2.denominador);
		q.reducir();
		return q;
	}
	public static Fraccion division(Fraccion q1, Fraccion q2) {  
	Fraccion q=new Fraccion(q1.numerador*q2.denominador,q1.denominador*q2.numerador);
	q.reducir();
	return q;
}
}

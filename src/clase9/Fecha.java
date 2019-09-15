package clase9;

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

	public static int diasDelMes(int mes, int anio){ //es una metodo de clase ya que no necesito el objeto para operar. Tampoco lo modifico
		if(mes==2){
			return (anio-2016)%4==0 ? 29 : 28;
		}
		return mes==4||mes==6|| mes==9|| mes==11 ? 30:31;
	}
	
	public boolean esValida(){                   //Si no le paso argumentos es un metodo de instancia ya que uso las propiedades de la clase.
		return this.dia<=diasDelMes(this.mes,this.anio) && this.mes<12 && this.dia>0 && this.mes>0 ? true : false;
	}											//Si recibiera argumentos podria ser un metodo de clase tambien
	
	public void avanzarDia(){					//Este si o si tiene que ser un metodo de instancia ya que modifico el objeto dentro del metodo
		if(this.dia<diasDelMes(this.mes,this.anio)){
			this.dia++;
			return;
		}
		if(this.mes<12){
			this.mes++;
			return;
		}
		this.anio++;
		this.dia=1;
		this.mes=1;
	}
	
	 public boolean antesQue(Fecha otra){  //Es una instancia que recibe como parametro otro objeto del tipo fecha
		 if(this.anio>otra.anio){
			 return false;
		 }
		 if(this.anio==otra.anio && this.mes>otra.mes){
			 return false;
		 }
		 if(this.anio==otra.anio && this.mes==otra.mes && this.dia>otra.dia){
			 return false;
		 }
		 return true;
	 }
	
	 public int diaDelAnio(){   //tambi�n es un m�todo de instancia pero si le pasara parametros podria ser un metodo de clase
		 int acum=this.dia;		//Me fijo cuantos deias pasaron de este mes
		 for(int i=1;i<this.mes;i++){		
			 acum+=diasDelMes(this.mes-i, this.anio);   //voy sumando los dias que pasaron de los meses completos (como arranca en i=1 no suma el mes actual)
		 }
		 return acum;
	 }
	
	 public static int diasBisiesto(int anio){
		 return anio%4==0 ? 366:365;
	 }
	 
	 public int diasDeDiferenciaCon(Fecha otra){
		 if(this.antesQue(otra)){                         
			 int acum=diasBisiesto(this.anio)-this.dia+otra.dia;
			 for(int i=1;i<otra.anio;i++){
				 acum=diasBisiesto(this.anio+i);
			 }
			 return acum;
		 }
		 int acum=diasBisiesto(otra.anio)-otra.dia+this.dia;
		 for(int i=1;i<this.anio;i++){
			 acum=diasBisiesto(otra.anio+i);
		 }
		 return acum;
		 
	 }
	 
	
}

